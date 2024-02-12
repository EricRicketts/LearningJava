package org.example;

import java.util.HashMap;
import java.util.Map;

public record Hamburger(String size) {

    public double getPrice() {
        Map<String, Double> hamburgerPrices = new HashMap<>() {{
            put("Small", 7.99); put("Medium", 9.99); put("Large", 10.99);
        }};
        return hamburgerPrices.get(size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger that = (Hamburger) o;
        return  this.size().equals(that.size()) &&
                this.getPrice() == that.getPrice();
    }

    public Hamburger(String size) {
        this.size = size;
    }
}
