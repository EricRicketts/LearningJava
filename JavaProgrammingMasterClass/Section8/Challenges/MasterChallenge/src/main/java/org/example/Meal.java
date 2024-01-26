package org.example;

import java.util.HashMap;

public class Meal {

    private final Hamburger burger;
    private final SideItem drink;
    private final double price;
    protected HashMap<String, Double> burgersAndToppingsTypeAndPrice = new HashMap<>();

    public double getPrice() {
        return price;
    }

    public Hamburger getBurger() {
        return burger;
    }

    public SideItem getDrink() {
        return drink;
    }

    private void setBurgersAndToppingsTypeAndPrice() {
        Object[][] typesAndPrices = new Object[][]{
                {"Basic Hamburger", 9.99}, {"Deluxe Hamburger", 10.99}, {"Cheese", 1.50},
                {"Lettuce", 1.00}, {"Tomatoes", 1.00}, {"Ketchup", 1.00}, {"Mustard", 1.00},
                {"Mayonnaise", 1.00}, {"Onion", 1.00}, {"Relish", 1.00}, {"Pickles", 1.00}
        };
        for (Object[] item : typesAndPrices) {
            String itemType = (String) item[0];
            Double itemPrice = (Double) item[1];
            burgersAndToppingsTypeAndPrice.put(itemType, itemPrice);
        }
    }

    public HashMap<String, Double> getBurgersAndToppingsTypeAndPrice() {
        return burgersAndToppingsTypeAndPrice;
    }

    protected Item convertToNoCostBurgerOrTopping(String itemName) {
        return new Item(itemName, 0.00);
    }

    protected Item convertToBurgerOrTopping(String burgerOrToppingName) {
        double burgerOrToppingPrice = this.getBurgersAndToppingsTypeAndPrice().get(burgerOrToppingName);
        return new Item(burgerOrToppingName, burgerOrToppingPrice);
    }

    public Meal(Hamburger burger, SideItem drink) {
        this.burger = burger;
        this.drink = drink;
        this.price = burger.getPrice() + drink.getPrice();
        this.setBurgersAndToppingsTypeAndPrice();
    }
}
