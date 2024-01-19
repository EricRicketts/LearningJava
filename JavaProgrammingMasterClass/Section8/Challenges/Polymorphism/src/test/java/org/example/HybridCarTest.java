package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HybridCarTest {

    HybridCar hybridCar;
    String expected, result;

    @BeforeEach
    public void setUp() {
        hybridCar =
                (HybridCar) Car.getType("HybridCar", 250, 12.5,
                        4, 87, 200, 72);
    }

    @Test
    public void testAvgKmPerLitre() {
        hybridCar.setAvgKmPerLitre(15.0);
        double expected = 15.0;
        double result = hybridCar.getAvgKmPerLitre();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "A HybridCar is starting its engine.\n" +
                "This HybridCar has a batter capacity of 72 kWh and gets 12.5 km/L.";
        result = hybridCar.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDrive() {
        expected = "A HybridCar is now at idle.\n" +
                "A HybridCar is now being driven.\n" +
                "This HybridCar has a battery rated at 72 kwh.\n" +
                "This HybridCar gets 12.5 km per litre.\n" +
                "Though not a pure EV, still make sure you fully charge before a long trip!";
        result = hybridCar.drive();
        Assertions.assertEquals(expected, result);
    }
}
