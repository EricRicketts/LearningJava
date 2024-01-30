package org.example;

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

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
