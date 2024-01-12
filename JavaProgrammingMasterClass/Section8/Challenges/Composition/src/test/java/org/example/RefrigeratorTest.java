package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RefrigeratorTest {

    Refrigerator refrigerator;

    @BeforeEach
    public void setUp() {
        refrigerator = new Refrigerator();
    }

    @Test
    public void testWorkForRefrigerator() {
        String expected, result;
        expected = "";
        result = refrigerator.orderFood();
        Assertions.assertEquals(expected, result);
        expected = "The Refrigerator is ordering food.";
        refrigerator.setHasWorkToDo(true);
        result = refrigerator.orderFood();
        Assertions.assertEquals(expected, result);
    }
}
