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
    public void testSideItemType() {
        Assertions.assertEquals("Fries", item.getType());
    }

    @Test
    public void testSideItemPrice() {
        Assertions.assertEquals(6.99, item.getPrice());
    }
}
