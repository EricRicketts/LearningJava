package org.example;

public class Tie extends ProductForSale {

    @Override
    public String showDetails() {
        return getClass().getSimpleName() + " " + "(" + getType() + ")" + " "
                + "Description: " + getDescription() + " " + "Price: " + formatPrice();
    }

    public Tie(String type, String description, double price) {
        super(type, description, price);
    }
}
