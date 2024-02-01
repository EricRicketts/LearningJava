package org.example;

public class Meal {

    private Hamburger burger;
    private Drink drink;
    private SideItem sideItem;

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
        this.burger = new Hamburger("Medium");
        this.drink = new Drink("Small", "Coke");
        this.sideItem = new SideItem("Small", "Fries");
    }

    public Meal(String burgerSize, String drinkSize, String drinkType,
                String sideItemSize, String sideItemType
    ) {
        this.burger = new Hamburger(burgerSize);
        this.drink = new Drink(drinkSize, drinkType);
        this.sideItem = new SideItem(sideItemSize, sideItemType);
    }
}
