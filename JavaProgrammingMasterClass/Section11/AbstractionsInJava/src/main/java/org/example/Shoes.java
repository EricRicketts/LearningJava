package org.example;

public class Shoes extends ProductForSale {

    @Override
    public String showDetails() {
        return "Shoes " + "(" + getType() + ")" + " "
                + "Description: " + getDescription() + " " + "Price: " + formatPrice();
    }

    public Shoes(String type, String description, double price) {
        super(type, description, price);
    }
}
