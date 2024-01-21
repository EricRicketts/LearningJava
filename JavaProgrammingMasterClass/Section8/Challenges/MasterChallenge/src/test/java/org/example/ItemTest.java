package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item("Fries", 6.99);
    }

    @Test
    public void testItemGetType() {
        Assertions.assertEquals("Fries", item.getType());
    }

    @Test
    public void testItemGetPrice() {
        Assertions.assertEquals(6.99, item.getPrice());
    }

    @Test
    public void testItemSetType() {
        String expected = "Tater Tots";
        item.setType(expected);
        String result = item.getType();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testItemSetPrice() {
        double expected = 12.99;
        item.setPrice(expected);
        double result = item.getPrice();
        Assertions.assertEquals(expected, result);
    }
}
