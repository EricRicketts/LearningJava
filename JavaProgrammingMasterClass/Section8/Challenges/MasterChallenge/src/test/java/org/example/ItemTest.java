package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

    private Item side;

    @BeforeEach
    public void setUp() {
        side = new Item("Medium", "Side", "Onion Rings");
    }

    @Test
    public void testGetSideSize() {
        Assertions.assertEquals("Medium", side.size());
    }

    @Test
    public void testGetSideType() {
        Assertions.assertEquals("Side", side.type());
    }

    @Test
    public void testGetSideName() {
        Assertions.assertEquals("Onion Rings", side.name());
    }

    @Test
    public void testGetSidePrice() {
        Assertions.assertEquals(4.99, side.getPrice());
    }

    @Test
    public void testEquals() {
        Item otherSide = new Item("Medium", "Side", "Onion Rings");
        Assertions.assertEquals(side, otherSide);
    }
}