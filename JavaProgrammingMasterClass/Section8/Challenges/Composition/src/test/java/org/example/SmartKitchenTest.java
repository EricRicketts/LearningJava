package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmartKitchenTest {

    private SmartKitchen smartKitchen;
    private String expected, result;

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

    @Test
    public void testLoadDishwasher() {
        Assertions.assertFalse(smartKitchen.getDishWasher().isHasWorkToDo());
        smartKitchen.loadDishWasher();
        Assertions.assertTrue(smartKitchen.getDishWasher().isHasWorkToDo());
    }

    @Test
    public void testOnlyCoffeeMakerWorking() {
        expected = "The coffee maker is brewing coffee.";
        smartKitchen.setKitchenState(true, false, false);
        result = smartKitchen.doKitchenWork();
        result = result.trim();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAllThreeAppliancesWorking() {
        expected = String.join(" ",
                "The coffee maker is brewing coffee.",
                "The Refrigerator is ordering food.",
                "The dishwasher is washing the dishes.");
        smartKitchen.setKitchenState(true, true, true);
        result = smartKitchen.doKitchenWork();
        Assertions.assertEquals(expected, result);
    }
}
