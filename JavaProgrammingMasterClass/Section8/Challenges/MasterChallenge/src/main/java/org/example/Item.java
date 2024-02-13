package org.example;

import java.util.HashMap;
import java.util.Map;

public record Item(String size, String type, String name) {

    final static Map<String, Double> drinkPrices = new HashMap<>(){{
        put("SmallCoke", 2.99);
        put("MediumCoke", 4.99);
        put("LargeCoke", 5.99);
        put("SmallPepsi", 2.99);
        put("MediumPepsi", 4.99);
        put("LargePepsi", 5.99);
    }};

    final static Map<String, Double> sidePrices = new HashMap<>(){{
        put("SmallFries", 2.99);
        put("MediumFries", 4.99);
        put("LargeFries", 5.99);
        put("SmallOnionRings", 2.99);
        put("MediumOnionRings", 4.99);
        put("LargeOnionRings", 5.99);
    }};

    final static Map<String, Double> toppingPrices = new HashMap<>(){{
            put("Cheese", 1.50);
            put("Ketchup", 1.00);
            put("Mustard", 1.00);
            put("Mayonnaise", 1.00);
            put("Pickles", 1.50);
            put("Onions", 1.50);
            put("Lettuce", 1.50);
            put("Tomatoes", 1.50);
        }};

    private double getDrinkPrice() {
        String nameWithNoSpaces = this.name().replaceAll("\\s", "");
        String drinkPriceKey = String.join("", size, nameWithNoSpaces);
        return drinkPrices.get(drinkPriceKey);
    }

    public double getPrice() {
        return switch (this.type().toLowerCase()) {
            case "drink" -> this.getDrinkPrice();
            case "side" -> this.getSidePrice();
            case "topping" -> this.getToppingPrice();
            default -> 0.00;
        };
    }

    private double getSidePrice() {
        String nameWithNoSpaces = this.name().replaceAll("\\s", "");
        String sidePriceKey = String.join("", size, nameWithNoSpaces);
        return sidePrices.get(sidePriceKey);
    }

    private double getToppingPrice() {
        String nameWithNoSpaces = this.name().replaceAll("\\s", "");
        String toppingPriceKey = String.join("", size, nameWithNoSpaces);
        return toppingPrices.get(toppingPriceKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item that = (Item) o;
        return this.size().equals(that.size()) &&
                this.type().equals(that.type()) &&
                this.name().equals(that.name()) &&
                this.getPrice() == that.getPrice();
    }
}
