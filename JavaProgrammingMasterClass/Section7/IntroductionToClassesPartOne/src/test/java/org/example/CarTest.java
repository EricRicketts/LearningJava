package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    private final Car car = new Car();

    @Test
    public void testCarMakeGetterAndSetter() {
        Assertions.assertNull(car.getMake());
        car.setMake("Ford");
        Assertions.assertEquals(
                "Ford",
                car.getMake()
        );
    }

    @Test
    public void testCarModelGetterAndSetter() {
        Assertions.assertNull(car.getModel());
        car.setModel("Taurus");
        Assertions.assertEquals(
                "Taurus",
                car.getModel()
        );
    }

    @Test
    public void testCarColorGetterAndSetter() {
        Assertions.assertNull(car.getColor());
        car.setColor("Blue");
        Assertions.assertEquals(
                "Blue",
                car.getColor()
        );
    }

    @Test
    public void testCarDoorsGetterAndSetter() {
        Assertions.assertEquals(0, car.getDoors());
        car.setDoors(4);
        Assertions.assertEquals(
                4,
                car.getDoors()
        );
    }

    @Test
    public void testCarConvertableGetterAndSetter() {
        Assertions.assertFalse(car.isConvertable());
        car.setConvertable(true);
        Assertions.assertTrue(car.isConvertable());
    }
}
