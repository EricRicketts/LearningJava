package org.example;

public class Undershirt extends ProductForSale {

    @Override
    public String showDetails() {
        return getClass().getSimpleName() + " " + "(" + getType() + ")" + " "
                + "Description: " + getDescription() + " " + "Price: " + formatPrice();
    }

    public Undershirt(String type, String description, double price) {
        super(type, description, price);
    }
}
