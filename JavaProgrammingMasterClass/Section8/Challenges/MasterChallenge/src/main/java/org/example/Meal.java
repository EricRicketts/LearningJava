package org.example;

import java.util.HashMap;
import java.util.Map;

public class Meal {

    private Hamburger burger;
    private SideItem drink;
    private final double price;
    protected HashMap<String, Double> burgersSizeAndPrice = new HashMap<>(Map.of(
            "Small", 7.99, "Medium", 9.99, "Large", 10.99
            )
    );
    protected HashMap<String, Double> drinksTypeAndPrice = new HashMap<>(Map.of(
            "SmallCoke", 4.99, "MediumCoke", 6.99, "LargeCoke", 7.99,
            "SmallPepsi", 4.99, "MediumPepsi", 6.99, "LargePepsi", 7.99
        )
    );

    public double getPrice() {
        return price;
    }

    public void setBurger(Hamburger burger) {
        this.burger = burger;
    }

    public void setDrink(SideItem drink) {
        this.drink = drink;
    }

    public Hamburger getBurger() {
        return burger;
    }

    public SideItem getDrink() {
        return drink;
    }


    public Meal(String burgerSize, String drinkSize, String drinkType) {
        this.setBurger(new Hamburger(burgerSize, burgersSizeAndPrice.get(burgerSize)));
        this.setDrink(new SideItem(
                drinkType,
                drinksTypeAndPrice.get(String.join("", drinkSize, drinkType)),
                drinkSize
            )
        );
        this.price = this.burger.getPrice() + this.drink.getPrice();
    }

    public Meal(Hamburger burger, SideItem drink) {
        this.setBurger(burger);
        this.setDrink(drink);
        this.price = this.burger.getPrice() + this.drink.getPrice();
    }
}
