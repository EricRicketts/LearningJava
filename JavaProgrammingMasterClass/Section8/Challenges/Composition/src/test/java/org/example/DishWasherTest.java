package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DishWasherTest {

    DishWasher dishWasher;

    @BeforeEach
    public void setUp() {
        dishWasher = new DishWasher();
    }

    @Test
    public void testDoDishes() {
        String expected, result;
        expected = "";
        result = dishWasher.doDishes();
        Assertions.assertEquals(expected, result);
        dishWasher.setHasWorkToDo(true);
        expected = "The dishwasher is washing the dishes.";
        dishWasher.setHasWorkToDo(true);
        result = dishWasher.doDishes();
        Assertions.assertEquals(expected, result);
    }
}
