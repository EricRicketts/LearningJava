package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class ProductForSale {

    private String type, description;
    private double price;

    protected String getType() {
        return type;
    }

    protected String getDescription() {
        return description;
    }

    protected double getPrice() { return price; }

    protected String formatPrice() {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(getPrice());
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
