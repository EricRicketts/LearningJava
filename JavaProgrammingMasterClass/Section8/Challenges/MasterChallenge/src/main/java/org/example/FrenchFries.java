package org.example;

public class FrenchFries extends Item {

    private final String size;

    public String getSize() {
        return size;
    }

    public FrenchFries(String type, double price, String size) {
        super(type, price);
        this.size = size;
    }
}
