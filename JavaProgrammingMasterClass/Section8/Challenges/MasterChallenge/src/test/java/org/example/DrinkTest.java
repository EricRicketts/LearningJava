package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    private Drink drink;

    @BeforeEach
    public void setUp() {
        drink = new Drink("Medium", "Coke");
    }

    @Test
    public void testDrinkType() {
        Assertions.assertEquals("Coke", drink.type());
    }

    @Test
    public void testDrinkPrice() {
        Assertions.assertEquals(4.99, drink.getPrice());
    }

    @Test
    public void testDrinkSize() {
        Assertions.assertEquals("Medium", drink.size());
    }

    @Test
    public void testEquals() {
        Drink otherDrink = new Drink("Medium", "Coke");
        Assertions.assertEquals(drink, otherDrink);
    }
}
