package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.SpinnerUI;

public class ElectricCarTest {

    ElectricCar electricCar;
    String expected, result;

    @BeforeEach
    public void setUp() {
        String description = "ElectricCar";
        int horsepower = 300;
        double avgKmPerLitre = 17.88;
        int cylinders = 4;
        int octane = 87;
        double avgKmPerCharge = 480;
        int batterySize = 91;
        electricCar =
            (ElectricCar) Car.getType(
            description, horsepower, avgKmPerLitre,
            cylinders, octane, avgKmPerCharge,
            batterySize
        );
    }

    @Test
    public void testGetBatterySize() {
        int expected = 91;
        int result = electricCar.getBatterySize();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAvgKmPerCharge() {
        electricCar.setAvgKmPerCharge(380);
        double expected = 380;
        double result = electricCar.getAvgKmPerCharge();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStartEngine() {
        expected = "A ElectricCar is starting its engine.\n" +
                "This ElectricCar has a batter capacity of 91 kWh and gets 480.0 km on a single charge.";
        result = electricCar.startEngine();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDrive() {
        expected = "A ElectricCar is now at idle.\n" +
                "A ElectricCar is now being driven.\n" +
                "This ElectricCar has a battery rated at 91 kwh.\n" +
                "This ElectricCar gets 480.0 km on a single charge.\n" +
                "Make sure you fully charge before a long trip!";
        result = electricCar.drive();
        Assertions.assertEquals(expected, result);
    }

}
