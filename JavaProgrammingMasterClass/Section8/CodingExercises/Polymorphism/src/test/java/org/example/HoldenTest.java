package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HoldenTest {

    private Holden holden;
    String expected, result;

    @BeforeEach
    public void setUp() {
        holden = new Holden(6, "Holden Commodore");
    }

    @Test
    public void testCylindersGetter() {
        int expected = 6;
        int result = holden.getCylinders();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNameGetter() {
        expected = "Holden Commodore";
        result = holden.getName();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "Holden -> startEngine()";
        result = holden.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAccelerate() {
        expected = "Holden -> accelerate()";
        result = holden.accelerate();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBrake() {
        expected = "Holden -> brake()";
        result = holden.brake();
        Assertions.assertEquals(expected, result);
    }
}
