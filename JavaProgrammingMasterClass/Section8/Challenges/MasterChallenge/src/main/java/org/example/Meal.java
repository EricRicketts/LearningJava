package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meal {

    private Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");
    private final Hamburger hamburger;
    private Item drink;
    private final Item side;

    public Item getFirstTopping() {
        return firstTopping;
    }

    public void setFirstTopping(Item firstTopping) {
        this.firstTopping = firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public void setSecondTopping(Item secondTopping) {
        this.secondTopping = secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public void setThirdTopping(Item thirdTopping) {
        this.thirdTopping = thirdTopping;
    }

    private List<Item> getAllToppings() {
        List<Item> toppingList = new ArrayList<>();
        if (!Objects.isNull(this.getFirstTopping())) toppingList.add(this.getFirstTopping());
        if (!Objects.isNull(this.getSecondTopping())) toppingList.add(this.getSecondTopping());
        if (!Objects.isNull(this.getThirdTopping())) toppingList.add(this.getThirdTopping());

        return toppingList;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Item getDrink() {
        return drink;
    }

    public Item getSide() { return side; }

    public double getPrice() {
        double toppingsPrice = 0.00;
        for (Item topping : this.getAllToppings()) toppingsPrice += topping.getPrice();
        return this.getHamburger().getPrice() + toppingsPrice + this.getDrink().getPrice()
                + this.getSide().getPrice();
    }

    public void changeDrinkSizeTo(String newSize) {
        this.drink = new Item(newSize, "Drink", this.getDrink().getName());
    }

    private String printDrink() {
        return this.getDrink().getSize() + " " + this.getDrink().getName() + " $" +
                decimalFormat.format(this.getDrink().getPrice()) + "\n";
    }

    private String printEntree() {
        return this.getHamburger().size() + " Hamburger " +
                "$" + decimalFormat.format(this.getHamburger().getPrice()) + "\n";
    }

    private String printSide() {
        return this.getSide().getSize() + " " + this.getSide().getName() + " $"
                + decimalFormat.format(this.getSide().getPrice()) + "\n";
    }

    private String printToppings() {
        String itemizedToppings = "";
        for (Item topping : this.getAllToppings()) {
            itemizedToppings = String.join("", itemizedToppings,
                    (topping.getName() + " $" + decimalFormat.format(topping.getPrice())), "\n");
        }

        return itemizedToppings;
    }

    private String printTotal() {
        return "Total " + "$" + decimalFormat.format(this.getPrice()) + "\n";
    }

    public String printItemizedList() {
        return this.printEntree() + this.printToppings() + this.printDrink()
                + this.printSide() + this.printTotal();
    }

    public Meal() {
        this.hamburger = new Hamburger("Medium");
        this.drink = new Item("Small", "Drink", "Coke");
        this.side = new Item("Small", "Side", "Fries");
    }

    public Meal(Hamburger hamburger, Item drink, Item side) {
        this.hamburger = hamburger;
        this.drink = drink;
        this.side = side;
    }
}
