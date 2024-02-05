package org.example;

import java.util.HashMap;
import java.util.Map;

public record SideItem(String size, String type) {

    public double getPrice() {
        Map<String, Double> sideItemPrices = new HashMap<>() {{
            put("SmallFries", 2.99);
            put("MediumFries", 4.99);
            put("LargeFries", 5.99);
            put("SmallOnionRings", 2.99);
            put("MediumOnionRings", 4.99);
            put("LargeOnionRings", 5.99);
        }};
        String typeWithNoSpaces = type.replaceAll("\\s", "");
        String sideItemPriceKey = String.join("", size, typeWithNoSpaces);
        return sideItemPrices.get(sideItemPriceKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SideItem that = (SideItem) o;
        return this.size().equals(that.size()) &&
                this.type().equals(that.type()) &&
                this.getPrice() == that.getPrice();
    }
}
