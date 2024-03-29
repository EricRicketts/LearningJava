package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {

    CoffeeMaker coffeeMaker;

    @BeforeEach
    public void setUp() {
        coffeeMaker = new CoffeeMaker();
    }

    @Test
    public void testWorkForCoffeeMaker() {
        String expected, result;
        expected = "";
        result = coffeeMaker.brewCoffee();
        Assertions.assertEquals(expected, result);
        expected = "The coffee maker is brewing coffee.";
        coffeeMaker.setHasWorkToDo(true);
        result = coffeeMaker.brewCoffee();
        Assertions.assertEquals(expected, result);
    }
}
