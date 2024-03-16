package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Shirt extends ProductForSale {

    @Override
    public String showDetails() {
        return getClass().getSimpleName() + " " + "(" + getType() + ")" + " "
                + "Description: " + getDescription() + " " + "Price: " + formatPrice();
    }

    public Shirt(String type, String description, double price) {
        super(type, description, price);
    }
}
