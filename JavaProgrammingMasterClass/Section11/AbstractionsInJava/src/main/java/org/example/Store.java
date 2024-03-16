package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {

    List<ProductForSale> productForSaleList;
    List<List<OrderItem>> orderItemList;

    public List<ProductForSale> getProductForSaleList() {
        return productForSaleList;
    }

    public List<List<OrderItem>> getOrderItemList() {
        return orderItemList;
    }

    public void addProductToSaleList(ProductForSale product) {
        getProductForSaleList().add(product);
    }

    public void addItemToOrder(OrderItem item, int orderNumber) {
        int orderIndex = orderNumber - 1;
        int numberOfProducts = getProductForSaleList().size();
        ProductForSale productFromOrderItem = item.getProductForSale();
        if (orderNumber > getOrderItemList().size()) {
            getOrderItemList().add(orderIndex, new ArrayList<>());
        }
        for (int i = 0; i < numberOfProducts; i++) {
            ProductForSale productOnSaleList = getProductForSaleList().get(i);
            if (productOnSaleList == productFromOrderItem) {
                getOrderItemList().get(orderIndex).add(item);
                break;
            }
        }
    }

    public String printOrderItems() {
        String salesReceipt  = "";
        int numberOfOrders = getOrderItemList().size();
        for (int i = 0; i < numberOfOrders; i++) {
            salesReceipt += "Order (" + (i + 1) + ")\n";
            List<OrderItem> currentOrderList = getOrderItemList().get(i);
            int sizeOfCurrentOrderList = currentOrderList.size();
            for (int j = 0; j < sizeOfCurrentOrderList; j++) {
                OrderItem currentOrder = currentOrderList.get(j);
                ProductForSale currentProduct = currentOrder.getProductForSale();
                salesReceipt += "Quantity: " + currentOrder.getQuantity() + " "
                        + currentProduct.getClass().getSimpleName() + " (" +
                        currentProduct.getType() + ") " + "Price: " +
                        currentProduct.formatPrice() + " each\n";
            }
        }
        return salesReceipt;
    }

    public Store() {
        productForSaleList = new ArrayList<>();
        orderItemList = new ArrayList<List<OrderItem>>();
    }
}
