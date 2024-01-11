package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmartKitchenTest {

    private SmartKitchen smartKitchen;

    @BeforeEach
    public void setUp() {
        smartKitchen = new SmartKitchen();
    }

    @Test
    public void testAddWater() {
        Assertions.assertFalse(smartKitchen.getCoffeeMaker().isHasWorkToDo());
        smartKitchen.addWater();
        Assertions.assertTrue(smartKitchen.getCoffeeMaker().isHasWorkToDo());
    }

    @Test
    public void testPourMilk() {
        Assertions.assertFalse(smartKitchen.getRefrigerator().isHasWorkToDo());
        smartKitchen.pourMilk();
        Assertions.assertTrue(smartKitchen.getRefrigerator().isHasWorkToDo());
    }
}
