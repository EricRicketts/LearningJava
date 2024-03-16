package org.example;

public class Underwear extends ProductForSale {


    @Override
    public String showDetails() {
        return getClass().getSimpleName() + " " + "(" + getType() + ")" + " "
                + "Description: " + getDescription() + " " + "Price: " + formatPrice();
    }

    public Underwear(String type, String description, double price) {
        super(type, description, price);
    }
}
