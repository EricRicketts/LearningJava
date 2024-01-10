package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {

    @Test
    public void testAddWater() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Assertions.assertFalse(coffeeMaker.isHasWorkToDo());
        coffeeMaker.addWater();
        Assertions.assertTrue(coffeeMaker.isHasWorkToDo());
    }
}
