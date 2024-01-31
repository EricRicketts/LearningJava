package org.example;

public class Meal {

    private final Hamburger burger;
    private final Drink drink;
    private final SideItem sideItem;

    public Hamburger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public Meal() {
        this.burger = new Hamburger("Medium", 9.99);
        this.drink = new Drink("Small", "Coke", 3.99);
        this.sideItem = new SideItem("Small", "Fries", 2.99);
    }
    public Meal(String burgerSize, Double burgerPrice, Drink drink, SideItem sideItem) {
        this.burger = new Hamburger(burgerSize, burgerPrice);
        this.drink = drink;
        this.sideItem = sideItem;
    }
}
