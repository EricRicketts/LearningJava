package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderItemTest {

    private OrderItem orderItem;

    @BeforeEach
    public void setUp() {
        Trousers trousers = new Trousers("Slimline Joggers", "Light and sporty", 75.00);
        orderItem = new OrderItem(2, trousers);
    }

    @Test
    public void testOrderItem() {
        Object[] expected = {2, "Trousers (Slimline Joggers) Description: Light and sporty Price: 75.00"};
        Object[] results = {
                orderItem.getQuantity(),
                orderItem.getProductForSale().showDetails()
        };
        Assertions.assertArrayEquals(expected, results);
    }
}
