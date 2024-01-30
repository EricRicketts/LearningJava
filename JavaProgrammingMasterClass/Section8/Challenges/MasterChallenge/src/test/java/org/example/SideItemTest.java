package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SideItemTest {

    private SideItem sideItem;

    @BeforeEach
    public void setUp() {
        sideItem = new SideItem("Generic", 1.99, "Regular");
    }

    @Test
    public void testGetSize() {
        Assertions.assertEquals("Regular", sideItem.getSize());
    }

    @Test
    public void testEquals() {
        SideItem otherSideItem = new SideItem("Generic", 1.99, "Regular");
        Assertions.assertEquals(sideItem, otherSideItem);
    }
}
/*
    Since SideItem extends Item there is no need to test getType or getPrice as those
    have been tested in the ItemTest file.  The only field that needs to be tested
    in SideItem is the size field as that is unique to SideItem.
*/
