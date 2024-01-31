package org.example;

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

    public Hamburger(String size, double price) {
        this.size = size;
        this.price = price;
    }
}
