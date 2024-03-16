package org.example;

public class Shoes extends ProductForSale {

    @Override
    public String showDetails() {
        return getClass().getSimpleName() + " " + "(" + getType() + ")" + " "
                + "Description: " + getDescription() + " " + "Price: " + formatPrice();
    }

    public Shoes(String type, String description, double price) {
        super(type, description, price);
    }
}
