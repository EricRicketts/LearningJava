package org.example;

public class SideItem extends Item {

    private final String size;

    public String getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SideItem that = (SideItem) o;
        return  this.getType().equals(that.getType()) &&
                this.getSize().equals(that.getSize()) &&
                this.getPrice() == that.getPrice();
    }

    public SideItem(String type, double price, String size) {
        super(type, price);
        this.size = size;
    }
}
