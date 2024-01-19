package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GasPoweredCarTest {

    GasPoweredCar gasPoweredCar;
    String expected, result;

    @BeforeEach
    public void setUp() {
        gasPoweredCar =
       (GasPoweredCar) Car.getType("GasPoweredCar", 17.88, 4, 87);
    }

    @Test
    public void testGetAvgKmPerLitre() {
        double expected = 17.88;
        double result = gasPoweredCar.getAvgKmPerLitre();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetCylinders() {
        int expected = 4;
        int result = gasPoweredCar.getCylinders();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOctaneRating() {
        int expected = 87;
        int result = gasPoweredCar.getOctane();
        gasPoweredCar.setOctane(93);
        Assertions.assertEquals(expected, result);
        expected = 93;
        result = gasPoweredCar.getOctane();
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testStartEngine() {
        String firstStatement = "A GasPoweredCar is starting its engine.";
        String secondStatement = "This GasPoweredCar has 4 cylinders and gets 17.88 km/L.";
        expected = String.join("\n", firstStatement, secondStatement);
        result = gasPoweredCar.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDrive() {
        expected = """
            A GasPoweredCar is now at idle.
            A GasPoweredCar is now being driven.
            This GasPoweredCar needs an octane rating of at least 87.""";
        result = gasPoweredCar.drive();
        Assertions.assertEquals(expected, result);
    }
}
