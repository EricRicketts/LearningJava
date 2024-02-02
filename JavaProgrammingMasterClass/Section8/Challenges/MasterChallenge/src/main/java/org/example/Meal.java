package org.example;

public class Meal {

    private final HamburgerWithToppings burger;
    private final Drink drink;
    private final SideItem sideItem;

    public HamburgerWithToppings getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public Meal() {
        this.burger = new HamburgerWithToppings("Medium", "Cheese",
                "Ketchup", "Mustard");
        this.drink = new Drink("Small", "Coke");
        this.sideItem = new SideItem("Small", "Fries");
    }

    public Meal(String burgerSize, String drinkSize, String drinkType,
                String sideItemSize, String sideItemType, String firstToppingType
    ) {
        this.burger = new HamburgerWithToppings(burgerSize, firstToppingType);
        this.drink = new Drink(drinkSize, drinkType);
        this.sideItem = new SideItem(sideItemSize, sideItemType);
    }

    public Meal(String burgerSize, String drinkSize, String drinkType,
                String sideItemSize, String sideItemType, String firstToppingType,
                String secondToppingType
    ) {
        this.burger = new HamburgerWithToppings(burgerSize, firstToppingType, secondToppingType);
        this.drink = new Drink(drinkSize, drinkType);
        this.sideItem = new SideItem(sideItemSize, sideItemType);
    }

    public Meal(String burgerSize, String drinkSize, String drinkType,
                String sideItemSize, String sideItemType, String firstToppingType,
                String secondToppingType, String thirdToppingType
    ) {
        this.burger = new HamburgerWithToppings(burgerSize, firstToppingType,
                secondToppingType, thirdToppingType);
        this.drink = new Drink(drinkSize, drinkType);
        this.sideItem = new SideItem(sideItemSize, sideItemType);
    }
}
