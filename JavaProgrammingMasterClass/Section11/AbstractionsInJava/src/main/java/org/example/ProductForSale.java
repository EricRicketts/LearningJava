package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class ProductForSale {

    private String type, description;
    private double price;

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);
        return Double.parseDouble(df.format(price));
    }

    public double getSalesPrice(int quantity) {
        return quantity * getPrice();
    }

    public String getPricedLineItem(int quantity) {
        return getType() + " " + quantity + " " + getSalesPrice(quantity);
    }

    public abstract String showDetails();

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }
}
