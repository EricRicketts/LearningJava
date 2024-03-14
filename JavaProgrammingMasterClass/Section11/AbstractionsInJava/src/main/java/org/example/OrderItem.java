package org.example;

public class OrderItem {

    private int quantity;
    private ProductForSale productForSale;

    public int getQuantity() {
        return quantity;
    }

    public ProductForSale getProductForSale() {
        return productForSale;
    }

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }
}
