package org.example;

import java.text.DecimalFormat;
import java.util.Objects;

public class Meal {

    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");
    private final HamburgerWithToppings hamburgerWithToppings;
    private Drink drink;
    private final SideItem sideItem;

    public HamburgerWithToppings getHamburgerWithToppings() {
        return hamburgerWithToppings;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public double getPrice() {
        return this.getHamburgerWithToppings().getPrice() + this.getDrink().getPrice()
                + this.getSideItem().getPrice();
    }

    public void changeDrinkSizeTo(String newSize) {
        this.drink = new Drink(newSize, this.getDrink().type());
    }

    private String printDrink() {
        return this.getDrink().size() + " " + this.getDrink().type() + " $" +
                decimalFormat.format(this.getDrink().getPrice()) + "\n";
    }

    private String printEntree() {
        return this.getHamburgerWithToppings().getBurger().getSize() + " Hamburger " +
                "$" + decimalFormat.format(this.getHamburgerWithToppings().getBurger().getPrice()) + "\n";
    }

    private String printSideItem() {
        return this.getSideItem().size() + " " + this.getSideItem().type() + " $"
                + decimalFormat.format(this.getSideItem().getPrice()) + "\n";
    }

    private String printToppings() {
        String itemizedToppings = "";
        for (Item topping : this.getHamburgerWithToppings().getAllToppings()) {
            if (!Objects.isNull(topping)) {
                itemizedToppings = String.join(itemizedToppings, (topping.type() + " $" +
                        decimalFormat.format(topping.getPrice()) + "\n"));
            }
        }
        return itemizedToppings;
    }

    private String printTotal() {
        return "Total: " + "$" + this.getPrice() + "\n";
    }

    public String printItemizedList() {
        return this.printEntree() + this.printToppings() + this.printDrink()
                + this.printSideItem() + this.printTotal();
    }

    public Meal() {
        this.hamburgerWithToppings = new HamburgerWithToppings("Medium");
        this.drink = new Drink("Small", "Coke");
        this.sideItem = new SideItem("Small", "Fries");
    }

    public Meal(HamburgerWithToppings hamburgerWithToppings, Drink drink, SideItem sideItem) {
        this.hamburgerWithToppings = hamburgerWithToppings;
        this.drink = drink;
        this.sideItem = sideItem;
    }
}
