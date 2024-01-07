package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testCourseData() {
        List<Double> radiusList = new ArrayList<>(Arrays.asList(
            -5.0, 5.0, -5.0,
            0.0, 1.0, 5.25,
            2.15
        ));
        List<Double> heightList = new ArrayList<>(Arrays.asList(
            1.0, -1.0, -1.0,
            0.0, 3.0, 3.5,
            4.75
        ));
        List<Double> areaList = new ArrayList<>(Arrays.asList(
                0.0, 78.53981633974483, 0.0,
                0.0, 3.141592653589793, 86.59014751456867,
                14.522012041218817
        ));
        List<Double> volumeList = new ArrayList<>(Arrays.asList(
                0.0, 0.0, 0.0,
                0.0, 9.42477796076938, 303.06551630099034,
                68.97955719578938
        ));
        for (int index = 0; index < radiusList.size(); index++) {
            double cylinderArea = areaList.get(index);
            double cylinderVolume = volumeList.get(index);
            double radius = radiusList.get(index);
            double height = heightList.get(index);
            cylinder = new Cylinder(radius, height);
            Assertions.assertEquals(cylinderArea, cylinder.getArea());
            Assertions.assertEquals(cylinderVolume, cylinder.getVolume());
        }
    }
}
