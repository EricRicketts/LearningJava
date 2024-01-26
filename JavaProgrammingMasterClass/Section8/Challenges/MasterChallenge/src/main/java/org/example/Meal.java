package org.example;

public class Meal {

    private final Hamburger burger;
    private final SideItem drink;
    private double price;

    public double getPrice() {
        return price;
    }

    public Hamburger getBurger() {
        return burger;
    }

    public SideItem getDrink() {
        return drink;
    }

    public Meal(Hamburger burger, SideItem drink) {
        this.burger = burger;
        this.drink = drink;
        this.price = burger.getPrice() + drink.getPrice();
    }
}
