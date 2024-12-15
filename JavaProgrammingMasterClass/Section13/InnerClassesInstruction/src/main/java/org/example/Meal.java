package org.example;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    /*
        Meal is the only public facing class.  Item and its subclass, Burger, are both private.
        The design decision is to make all the calculations regarding the individual meal items
        within the Meal class.
        The Meal class then takes the results of the Inner class calculations to produce the public
        facing results.  This is a very good example of encapsulation, but one drawback is a lack of
        flexibility.  If there is an Item not on the order then it needs to be added as a class to
        the Inner classes of Meal.
    */
    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    // no argument constructor calls parameter based constructor with conversion rate of 1
    public Meal() {
        this(1);
    }

    // base constructor only argument is conversionRate, other items are fixed
    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: ", getTotal());
    }

    public void addToppings(String... selectedToppings) {
        burger.addToppings(selectedToppings);
    }

    private class Item {

        private String name;
        private String type;
        private double price;

        // two argument constructor if the item is a burger, it does have an issue if the
        // type is not a burger, set the meal price to zero
        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name,
                    getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }

    private class Burger extends Item {

        private static String noToppingError = "";

        // adding code after enum, get the price of the chosen topping
        private enum Extra {AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;

            private double getPrice() {
                return switch (this) {
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE -> 1.5;
                    default -> 0;
                };
            }

        }

        private List<Item> toppings = new ArrayList<>();
        Burger(String name) {
            super(name, "burger", 5.0);
        }

        // get the price of the main items by calling the parent class => Item
        // then add the price of all the toppings
        public double getPrice() {
            double total = super.price;
            for (Item topping : toppings) {
                total += topping.price;
            }
            return total;
        }

        private void addToppings(String... selectedToppings) {

            // iterate through each individual toppings and add an individual topping
            // to the toppings list, this is so that the getPrice() can calculate the
            // price of the included toppings
            for (String selectedTopping : selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING",
                            topping.getPrice()));
                } catch (IllegalArgumentException ie) {
                    noToppingError = "No topping found for " + selectedTopping;
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for (Item topping : toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }

            return itemized.toString();
        }

    }
}
