package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

    private Item side, drink;

    @BeforeEach
    public void setUp() {
        side = new Item("Medium", "Side", "Onion Rings");
        drink = new Item("Large", "Drink", "Coke");
    }

    @Test
    public void testGetSideSize() {
        Assertions.assertEquals("Medium", side.getSize());
    }

    @Test
    public void testGetSideType() {
        Assertions.assertEquals("Side", side.getType());
    }

    @Test
    public void testGetSideName() {
        Assertions.assertEquals("Onion Rings", side.getName());
    }

    @Test
    public void testGetSidePrice() {
        Assertions.assertEquals(4.99, side.getPrice());
    }

    @Test
    public void testEqualsForSide() {
        Item otherSide = new Item("Medium", "Side", "Onion Rings");
        Assertions.assertEquals(side, otherSide);
    }

    @Test
    public void testGetDrinkSize() {
        Assertions.assertEquals("Large", drink.getSize());
    }

    @Test
    public void testGetDrinkType() {
        Assertions.assertEquals("Drink", drink.getType());
    }

    @Test
    public void testGetDrinkName() {
        Assertions.assertEquals("Coke", drink.getName());
    }

    @Test
    public void testGetDrinkPrice() {
        Assertions.assertEquals(5.99, drink.getPrice());
    }

    @Test
    public void testEqualsForDrinks() {
        Item otherDrink = new Item("Large", "Drink", "Coke");
        Assertions.assertEquals(drink, otherDrink);
    }
}