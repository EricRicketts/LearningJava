package org.example;

import java.util.HashMap;
import java.util.Map;

public class Drink {

    private final String size;
    private final String type;
    private final double price;

    public String getSize() {
        return size;
    }

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
        Drink that = (Drink) o;
        return  this.getSize().equals(that.getSize()) &&
                this.getType().equals(that.getType()) &&
                this.getPrice() == that.getPrice();
    }

    public Drink(String size, String type) {
        Map<String, Double> drinkPrices = new HashMap<>(){{
            put("SmallCoke", 2.99); put("MediumCoke", 4.99); put("LargeCoke", 5.99);
            put("SmallPepsi", 2.99); put("MediumPepsi", 4.99); put("LargePepsi", 5.99);
        }};
        String drinkPriceKey = String.join("", size, type);
        this.size = size;
        this.type = type;
        this.price = drinkPrices.get(drinkPriceKey);
    }
}
