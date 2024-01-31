package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    private Drink drink;

    @BeforeEach
    public void setUp() {
        drink = new Drink("Medium", "Coke", 3.99);
    }

    @Test
    public void testDrinkType() {
        Assertions.assertEquals("Coke", drink.getType());
    }

    @Test
    public void testDrinkPrice() {
        Assertions.assertEquals(3.99, drink.getPrice());
    }

    @Test
    public void testDrinkSize() {
        Assertions.assertEquals("Medium", drink.getSize());
    }

    @Test
    public void testEquals() {
        Drink otherDrink = new Drink("Medium", "Coke", 3.99);
        Assertions.assertEquals(drink, otherDrink);
    }
}
