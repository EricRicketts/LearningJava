package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    private Drink drink;

    @BeforeEach
    public void setUp() {
        drink = new Drink("Pepsi", 3.99, "Small");
    }

    @Test
    public void testSize() {
        String expected = "Small";
        String result = drink.getSize();
        Assertions.assertEquals(expected, result);
        expected = "Medium";
        drink.setSize("Medium");
        result = drink.getSize();
        Assertions.assertEquals(expected, result);
    }
}
