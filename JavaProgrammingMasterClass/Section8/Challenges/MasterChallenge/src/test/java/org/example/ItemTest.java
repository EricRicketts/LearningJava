package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item("Generic", 1.99);
    }

    @Test
    public void testGetType() {
        Assertions.assertEquals("Generic", item.getType());
    }

    @Test
    public void testGetPrice() {
        Assertions.assertEquals(1.99, item.getPrice());
    }

    @Test
    public void testEquals() {
        Item otherItem = new Item("Generic", 1.99);
        Assertions.assertEquals(item, otherItem);
    }
}
/*
    If Item and SideItem classes are tested there is no need to test the individual food items
    because all food items extend either the Item or SideItem classes.
*/
