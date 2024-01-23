package org.example;

public class Item {
    private final String type;
    private final double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
