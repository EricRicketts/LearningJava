package org.example;

public class Hamburger extends Item {

    protected Item firstTopping;
    protected Item secondTopping;
    protected Item thirdTopping;

    public Item getFirstTopping() {
        return firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public Hamburger(String type, double price) {
        super(type, price);
    }
}
