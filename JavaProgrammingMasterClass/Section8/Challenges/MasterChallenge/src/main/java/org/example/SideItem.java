package org.example;

public class SideItem extends Item {

    private final String size;

    public String getSize() {
        return size;
    }

    public SideItem(String type, double price, String size) {
        super(type, price);
        this.size = size;
    }
}
