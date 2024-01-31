package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item("Cheese", 1.50);
    }

    @Test
    public void testGetType() {
        Assertions.assertEquals("Cheese", item.getType());
    }

    @Test
    public void testGetPrice() {
        Assertions.assertEquals(1.50, item.getPrice());
    }

    @Test
    public void testEquals() {
       Item otherItem = new Item("Cheese", 1.50);
       Assertions.assertEquals(item, otherItem);
    }
}
