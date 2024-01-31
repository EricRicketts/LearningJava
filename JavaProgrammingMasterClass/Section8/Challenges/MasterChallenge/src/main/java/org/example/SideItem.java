package org.example;

public class SideItem {
    private final String size, type;
    protected double price;

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

    public SideItem(String size, String type, double price) {
        this.size = size;
        this.type = type;
        this.price = price;
    }
}
