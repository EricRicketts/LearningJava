package org.example;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String type, double price) {
        super(type, price);
    }

    public DeluxeBurger(String type, double price, String firstTopping) {
        super(type, price);
        this.firstTopping = new Item(firstTopping, 0.00);
    }

    public DeluxeBurger(
            String type, double price,
            String firstTopping, String secondTopping
    ) {
        super(type, price);
        this.firstTopping = new Item(firstTopping, 0.00);
        this.secondTopping = new Item(secondTopping, 0.00);
    }

    public DeluxeBurger(
            String type, double price, String firstTopping,
            String secondTopping, String thirdTopping
    ) {
        super(type, price);
        this.firstTopping = new Item(firstTopping, 0.00);
        this.secondTopping = new Item(secondTopping, 0.00);
        this.thirdTopping = new Item(thirdTopping, 0.00);
    }
}
