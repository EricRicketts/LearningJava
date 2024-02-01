package org.example;

import java.util.HashMap;
import java.util.Map;

public class Hamburger {

    private final String size;
    private final double price;

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger that = (Hamburger) o;
        return  this.getSize().equals(that.getSize()) &&
                this.getPrice() == that.getPrice();
    }

    public Hamburger(String size) {
        Map<String, Double> hamburgerPrices = new HashMap<>() {{
            put("Small", 7.99); put("Medium", 9.99); put("Large", 10.99);
        }};
        this.size = size;
        this.price = hamburgerPrices.get(size);
    }
}
