package org.example;

public class Drink extends Item {

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Drink(String type, double price, String size) {
        super(type, price);
        this.size = size;
    }
}
