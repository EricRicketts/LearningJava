package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<ProductForSale> productForSaleList;
    List<OrderItem> orderItemList;

    public List<ProductForSale> getProductForSaleList() {
        return productForSaleList;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addProductToSaleList(ProductForSale product) {
        getProductForSaleList().add(product);
    }

    public void addItemToOrder(OrderItem item) {
        boolean itemIsValidProduct = false;
        int numberOfProducts = getProductForSaleList().size();
        ProductForSale productFromOrderItem = item.getProductForSale();

        for (int i = 0; i < numberOfProducts; i++) {
            ProductForSale productOnSaleList = getProductForSaleList().get(i);
            if (productOnSaleList == productFromOrderItem) {
                getOrderItemList().add(item);
                break;
            }
        }
    }

    public String printOrderItems() {
        String salesReceipt  = "";
        for (OrderItem orderItem : getOrderItemList()) {
            salesReceipt += "(" + orderItem.getQuantity() + ")" + " "
                    + orderItem.getProductForSale().showDetails() + "\n";
        }
        return salesReceipt;
    }

    public Store() {
        productForSaleList = new ArrayList<>();
        orderItemList = new ArrayList<>();
    }
}
