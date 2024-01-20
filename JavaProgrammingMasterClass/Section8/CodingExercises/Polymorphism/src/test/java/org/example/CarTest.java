package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;
    String expected, result;

    @BeforeEach
    public void setUp() {
        car = new Car(6, "Generic Car");
    }

    @Test
    public void testCylindersGetter() {
        int expected = 6;
        int result = car.getCylinders();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNameGetter() {
        expected = "Generic Car";
        result = car.getName();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "Car -> startEngine()";
        result = car.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAccelerate() {
        expected = "Car -> accelerate()";
        result = car.accelerate();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBrake() {
        expected = "Car -> brake()";
        result = car.brake();
        Assertions.assertEquals(expected, result);
    }
}
