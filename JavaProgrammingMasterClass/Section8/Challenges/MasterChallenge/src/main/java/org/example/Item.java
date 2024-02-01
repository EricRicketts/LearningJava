package org.example;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private final String type;
    private final double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item that = (Item) o;
        return  this.getType().equals(that.getType()) &&
                this.getPrice() == that.getPrice();
    }

    public Item(String type) {
        Map<String, Double> itemPrices = new HashMap<>() {{
            put("Cheese", 1.50); put("Ketchup", 1.00); put("Mustard", 1.00);
            put("Mayonnaise", 1.00); put("Pickles", 1.50); put("Onions", 1.50);
            put("Lettuce", 1.00); put("Tomatoes", 1.50);
        }};
        this.type = type;
        this.price = itemPrices.get(type);
    }
}
