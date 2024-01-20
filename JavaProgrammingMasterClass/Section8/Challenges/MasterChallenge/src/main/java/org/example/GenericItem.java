package org.example;

public class GenericItem {

    private String type;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GenericItem(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
