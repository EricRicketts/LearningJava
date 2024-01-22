package org.example;

public class Item {
    private String type;
    private double price;

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
