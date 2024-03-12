package org.example;

public enum Topping {

    MUSTARD, KETCHUP, MAYONNAISE, TOMATO, LETTUCE, PICKLES, ONIONS, BACON, CHEDDAR, AMERICAN, MOZZARELLA, PROVOLONE;
    // semicolon is required if you are going to add additional functionality to the enum
    public double getPrice() {
        return switch(this) {
            case MUSTARD, KETCHUP, MAYONNAISE, TOMATO, LETTUCE, PICKLES, ONIONS -> 1.00;
            case BACON, CHEDDAR, AMERICAN, MOZZARELLA, PROVOLONE -> 1.50;
            default -> 0.00;
        };
    }
}
