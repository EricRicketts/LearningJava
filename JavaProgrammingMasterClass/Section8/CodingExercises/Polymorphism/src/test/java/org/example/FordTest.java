package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FordTest {

    private Ford ford;
    String expected, result;

    @BeforeEach
    public void setUp() {
        ford = new Ford(6, "Ford Falcon");
    }

    @Test
    public void testCylindersGetter() {
        int expected = 6;
        int result = ford.getCylinders();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNameGetter() {
        expected = "Ford Falcon";
        result = ford.getName();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "Ford -> startEngine()";
        result = ford.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAccelerate() {
        expected = "Ford -> accelerate()";
        result = ford.accelerate();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBrake() {
        expected = "Ford -> brake()";
        result = ford.brake();
        Assertions.assertEquals(expected, result);
    }
}
