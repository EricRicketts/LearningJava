package org.example;

import java.util.HashMap;
import java.util.Map;

public record Drink(String size, String type) {

    public double getPrice() {
        Map<String, Double> drinkPrices = new HashMap<>() {{
            put("SmallCoke", 2.99);
            put("MediumCoke", 4.99);
            put("LargeCoke", 5.99);
            put("SmallPepsi", 2.99);
            put("MediumPepsi", 4.99);
            put("LargePepsi", 5.99);
        }};
        String drinkPriceKey = String.join("", size, type);
        return drinkPrices.get(drinkPriceKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink that = (Drink) o;
        return this.size().equals(that.size()) &&
                this.type().equals(that.type()) &&
                this.getPrice() == that.getPrice();
    }
}
