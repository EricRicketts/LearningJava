package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Port;
import java.util.List;

public class StoreTest {

    private Store clothingStore;
    private List<OrderItem> firstOrderList, secondOrderList;
    private List<ProductForSale> productList;
    Object[] expected, results;

    @BeforeEach
    public void setUp() {
        clothingStore = new Store();
        ProductForSale trousers = new Trousers("Corduroy", "Durable, cold weather", 85.50);
        ProductForSale shirt = new Shirt("Flannel", "Cold weather", 45.99);
        ProductForSale shoes = new Shoes("Oxford", "Formal", 99.99);
        ProductForSale underwear = new Underwear("Trunks", "Everyday, dress up", 5.99);
        ProductForSale undershirt = new Undershirt("Thompson Tee", "dry and sweat free", 9.99);
        OrderItem trouserPurchase = new OrderItem(2, trousers);
        OrderItem shirtPurchase = new OrderItem(4, shirt);
        OrderItem shoePurchase = new OrderItem(2, shoes);
        OrderItem underWearPurchase = new OrderItem(8, underwear);
        OrderItem underShirtPurchase = new OrderItem(6, undershirt);
        clothingStore.addProductToSaleList(trousers);
        clothingStore.addProductToSaleList(shirt);
        clothingStore.addProductToSaleList(shoes);
        clothingStore.addProductToSaleList(underwear);
        clothingStore.addProductToSaleList(undershirt);
        clothingStore.addItemToOrder(trouserPurchase, 1);
        clothingStore.addItemToOrder(shirtPurchase, 1);
        clothingStore.addItemToOrder(shoePurchase, 1);
        clothingStore.addItemToOrder(underWearPurchase, 2);
        clothingStore.addItemToOrder(underShirtPurchase, 2);
        firstOrderList = clothingStore.getOrderItemList().get(0);
        secondOrderList = clothingStore.getOrderItemList().get(1);
        productList = clothingStore.getProductForSaleList();
    }

    @Test
    public void testNumberOfProductsForSale() {
        int numberOfProductsForSale = productList.size();
        Assertions.assertEquals(5, numberOfProductsForSale);
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
    public void testNumberOfOrderItemLists() {
        int numberOfOrderItemLists = clothingStore.getOrderItemList().size();
        Assertions.assertEquals(2, numberOfOrderItemLists);
    }

    @Test
    public void testSizeOfEachOrderItemList() {
        int[] expected = new int[]{3, 2};
        int[] results = new int[]{
                clothingStore.getOrderItemList().get(0).size(),
                clothingStore.getOrderItemList().get(1).size()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testFirstOrderItemFromFirstList() {
        OrderItem firstItem = firstOrderList.get(0);
        expected = new Object[]{2, "Corduroy", "Durable, cold weather", 85.50};
        results = new Object[]{
                firstItem.getQuantity(), firstItem.getProductForSale().getType(),
                firstItem.getProductForSale().getDescription(), firstItem.getProductForSale().getPrice()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testFirstOrderItemFromSecondList() {
        OrderItem firstItem = secondOrderList.get(0);
        expected = new Object[]{8, "Trunks", "Everyday, dress up", 5.99};
        results = new Object[]{
                firstItem.getQuantity(), firstItem.getProductForSale().getType(),
                firstItem.getProductForSale().getDescription(), firstItem.getProductForSale().getPrice()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddOrderItemNotInProductList() {
        int originalSizeOfSecondOrderItemList = secondOrderList.size();
        ProductForSale tie = new Tie("Bow", "Formal", 19.99);
        OrderItem ties = new OrderItem(2, tie);
        clothingStore.addItemToOrder(ties, 2);
        int newSizeOfSecondOrderItemList = secondOrderList.size();
        Assertions.assertEquals(originalSizeOfSecondOrderItemList, newSizeOfSecondOrderItemList);
    }

    @Disabled
    @Test
    public void testPrintReceipt() {
        String expected = """
                Order (1)
                Quantity: 2 Trousers (Corduroy) Price: $85.50 each
                Order (2)
                Quantity: 4 Shirt (Flannel) Price: $45.99 each
                Sales Total: $262.98
                """;
        String results = clothingStore.printOrderItems();
        Assertions.assertEquals(expected, results);
    }
}
