package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Port;
import java.util.List;

public class StoreTest {

    private Store clothingStore;
    private List<OrderItem> orderedItems;
    private List<ProductForSale> productList;
    Object[] expected, results;

    @BeforeEach
    public void setUp() {
        clothingStore = new Store();
        ProductForSale trousers = new Trousers("Corduroy", "Durable, cold weather", 85.50);
        ProductForSale shirt = new Shirt("Flannel", "Cold weather", 45.99);
        OrderItem trouserPurchase = new OrderItem(2, trousers);
        OrderItem shirtPurchase = new OrderItem(4, shirt);
        clothingStore.addProductToSaleList(trousers);
        clothingStore.addProductToSaleList(shirt);
        clothingStore.addItemToOrder(trouserPurchase);
        clothingStore.addItemToOrder(shirtPurchase);
        orderedItems = clothingStore.getOrderItemList();
        productList = clothingStore.getProductForSaleList();
    }

    @Test
    public void testNumberOfProductsForSale() {
        int numberOfProductsForSale = productList.size();
        Assertions.assertEquals(2, numberOfProductsForSale);
    }

    @Test
    public void testFirstProduct() {
        ProductForSale firstProduct = productList.get(0);
        expected = new Object[]{"Corduroy", "Durable, cold weather", 85.50};
        results = new Object[]{
                firstProduct.getType(), firstProduct.getDescription(), firstProduct.getPrice()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testSecondProduct() {
        ProductForSale secondProduct = productList.get(1);
        expected = new Object[]{"Flannel", "Cold weather", 45.99};
        results = new Object[]{
                secondProduct.getType(), secondProduct.getDescription(), secondProduct.getPrice()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testNumberOfOrderItems() {
        int numberOfOrderItems = orderedItems.size();
        Assertions.assertEquals(2, numberOfOrderItems);
    }

    @Test
    public void testFirstOrderItem() {
        OrderItem firstItem = orderedItems.get(0);
        expected = new Object[]{2, "Corduroy", "Durable, cold weather", 85.50};
        results = new Object[]{
                firstItem.getQuantity(), firstItem.getProductForSale().getType(),
                firstItem.getProductForSale().getDescription(), firstItem.getProductForSale().getPrice()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testSecondOrderItem() {
        OrderItem secondItem = orderedItems.get(1);
        expected = new Object[]{4, "Flannel", "Cold weather", 45.99};
        results = new Object[]{
                secondItem.getQuantity(), secondItem.getProductForSale().getType(),
                secondItem.getProductForSale().getDescription(), secondItem.getProductForSale().getPrice()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddOrderItemNotInProductList() {
        int originalNumberOfOrderItems = orderedItems.size();
        Shoes shoes = new Shoes("Oxford", "Timeless formal and daily", 76.99);
        OrderItem shoesItem = new OrderItem(2, shoes);
        clothingStore.addItemToOrder(shoesItem);
        int numberOrOrderItems = clothingStore.getOrderItemList().size();
        Assertions.assertEquals(originalNumberOfOrderItems, numberOrOrderItems);
    }

    @Test
    public void testPrintReceipt() {
        String expected = """
                (2) Trousers (Corduroy) Description: Durable, cold weather Price: 85.50
                (4) Shirt (Flannel) Description: Cold weather Price: 45.99
                """;
        String results = clothingStore.printOrderItems();
        Assertions.assertEquals(expected, results);
    }
}
