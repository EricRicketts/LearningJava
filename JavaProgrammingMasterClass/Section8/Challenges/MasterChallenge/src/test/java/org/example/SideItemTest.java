package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SideItemTest {

    private SideItem sideItem;

    @BeforeEach
    public void setUp() {
        sideItem = new SideItem("Medium", "Onion Rings");
    }

    @Test
    public void testGetSize() { Assertions.assertEquals("Medium", sideItem.size()); }

    @Test
    public void testGetType() {
        Assertions.assertEquals("Onion Rings", sideItem.type());
    }

    @Test
    public void testGetPrice() {
        Assertions.assertEquals(4.99, sideItem.getPrice());
    }

    @Test
    public void testEquals() {
        SideItem otherSideItem = new SideItem("Medium", "Onion Rings");
        Assertions.assertEquals(sideItem, otherSideItem);
    }
}