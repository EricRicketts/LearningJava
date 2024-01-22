package org.example;

public class Drink extends Item {

    private final String size;

    public String getSize() {
        return size;
    }

    public Drink(String type, double price, String size) {
        super(type, price);
        this.size = size;
    }
}
