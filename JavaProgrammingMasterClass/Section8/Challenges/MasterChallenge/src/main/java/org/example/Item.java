package org.example;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public record Item(String type) {

    public double getPrice() {
        Map<String, Double> itemPrices = new HashMap<>() {
            {
                put("Cheese", 1.50);
                put("Ketchup", 1.00);
                put("Mustard", 1.00);
                put("Mayonnaise", 1.00);
                put("Pickles", 1.50);
                put("Onions", 1.50);
                put("Lettuce", 1.50);
                put("Tomatoes", 1.50);
            }
        };
        return itemPrices.get(this.type());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item that = (Item) o;
        return this.type().equals(that.type()) &&
                this.getPrice() == that.getPrice();
    }
}
