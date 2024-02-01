package org.example;

import java.util.HashMap;
import java.util.Map;

public class SideItem {
    private final String size, type;
    private final double price;

    public String getSize() { return size; }

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
        SideItem that = (SideItem) o;
        return  this.getSize().equals(that.getSize()) &&
                this.getType().equals(that.getType()) &&
                this.getPrice() == that.getPrice();
    }

    public SideItem(String size, String type) {
        Map<String, Double> sideItemPrices = new HashMap<>(){{
            put("SmallFries", 2.99); put("MediumFries", 4.99); put("LargeFries", 5.99);
            put("SmallOnionRings", 2.99); put("MediumOnionRings", 4.99); put("LargeOnionRings", 5.99);
        }};
        this.size = size;
        this.type = type;
        String typeWithNoSpaces = type.replaceAll("\\s", "");
        String sideItemPriceKey = String.join("", size, typeWithNoSpaces);
        this.price = sideItemPrices.get(sideItemPriceKey);
    }
}
