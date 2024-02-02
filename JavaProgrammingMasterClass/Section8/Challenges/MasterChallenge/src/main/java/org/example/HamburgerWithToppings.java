package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HamburgerWithToppings {

    Hamburger burger;
    private Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;

    public void setFirstTopping(Item firstTopping) { this.firstTopping = firstTopping; }

    public void setSecondTopping(Item secondTopping) { this.secondTopping = secondTopping; }

    public void setThirdTopping(Item thirdTopping) { this.thirdTopping = thirdTopping; }

    public Hamburger getBurger() { return burger; }

    public Item getFirstTopping() {
        return firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public double getTotalPriceForToppings() {
        double totalPriceForToppings = 0.00;
        List<Item> toppings = new ArrayList<>();
        toppings.add(this.getFirstTopping());
        toppings.add(this.getSecondTopping());
        toppings.add(this.getThirdTopping());

        for (Item topping : toppings) {
            if (!Objects.isNull(topping)) totalPriceForToppings += topping.getPrice();
        }
        return totalPriceForToppings;
    }

    public double getPrice() {
        return this.getBurger().getPrice() + getTotalPriceForToppings();
    }

    public HamburgerWithToppings(String size) {
        this.burger = new Hamburger(size);
    }

    public HamburgerWithToppings(String size, String firstToppingType) {
        this.burger = new Hamburger(size);
        this.setFirstTopping(new Item(firstToppingType));
    }

    public HamburgerWithToppings(String size, String firstToppingType, String secondToppingType) {
        this.burger = new Hamburger(size);
        this.setFirstTopping(new Item(firstToppingType));
        this.setSecondTopping(new Item(secondToppingType));
    }

    public HamburgerWithToppings(String size, String firstToppingType,
                                 String secondToppingType, String thirdToppingType
    ) {
        this.burger = new Hamburger(size);
        this.setFirstTopping(new Item(firstToppingType));
        this.setSecondTopping(new Item(secondToppingType));
        this.setThirdTopping(new Item(thirdToppingType));
    }
}