package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CylinderTest {

    Cylinder cylinder;
    double expected, result;

    @BeforeEach
    public void setUp() {
        cylinder = new Cylinder(5.55, 7.25);
    }

    @Test
    public void testGetRadius() {
        expected = 5.55;
        result = cylinder.getRadius();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetHeight() {
        expected = 7.25;
        result = cylinder.getHeight();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetArea() {
        expected = 96.76890771219959;
        result = cylinder.getArea();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetVolume() {
        expected = 701.574580913447;
        result = cylinder.getVolume();
        Assertions.assertEquals(expected, result);
    }
}
