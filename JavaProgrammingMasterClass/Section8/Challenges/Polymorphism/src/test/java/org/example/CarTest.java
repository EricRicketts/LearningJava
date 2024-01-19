package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car;
    String expected, result;

    @BeforeEach
    public void setUp() {
        car = new Car("Generic", 300);
    }

    @Test
    public void testGetDescription() {
        expected = "Generic";
        result = car.getDescription();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testHorsepower() {
        int expected = 300;
        int result = car.getHorsepower();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "A Car is starting its engine.";
        result = car.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDrive() {
        expected = "A Car is now at idle.\n" +
            "A Car is now being driven.";
        result = car.drive();
        Assertions.assertEquals(expected, result);
    }
}
