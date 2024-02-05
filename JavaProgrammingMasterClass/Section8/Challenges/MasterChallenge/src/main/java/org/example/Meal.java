package org.example;

public class Meal {

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

    public void changeDrinkSizeTo(String newSize) {
        this.drink = new Drink(newSize, this.getDrink().type());
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
