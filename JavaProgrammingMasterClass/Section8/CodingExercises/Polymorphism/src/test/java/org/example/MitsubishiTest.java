package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MitsubishiTest {

    private Mitsubishi mitsubishi;
    String expected, result;

    @BeforeEach
    public void setUp() {
        mitsubishi = new Mitsubishi(3, "Mirage");
    }

    @Test
    public void testCylindersGetter() {
        int expected = 3;
        int result = mitsubishi.getCylinders();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNameGetter() {
        expected = "Mirage";
        result = mitsubishi.getName();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "Mitsubishi -> startEngine()";
        result = mitsubishi.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAccelerate() {
        expected = "Mitsubishi -> accelerate()";
        result = mitsubishi.accelerate();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBrake() {
        expected = "Mitsubishi -> brake()";
        result = mitsubishi.brake();
        Assertions.assertEquals(expected, result);
    }
}
