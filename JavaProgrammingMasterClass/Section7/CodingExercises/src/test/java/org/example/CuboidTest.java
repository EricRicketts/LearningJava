package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuboidTest {

    Cuboid cuboid;

    @BeforeEach
    public void setUp() {
        cuboid = new Cuboid(5, 10, 5);
    }

    @Test
    public void testGetWidth() {
        Assertions.assertEquals(5, cuboid.getWidth());
    }

    @Test
    public void testGetLength() {
        Assertions.assertEquals(10, cuboid.getLength());
    }

    @Test
    public void testGetHeight() {
        Assertions.assertEquals(5, cuboid.getHeight());
    }

    @Test
    public void testGetArea() {
        Assertions.assertEquals(50, cuboid.getArea());
    }

    @Test
    public void testGetVolume() {
        Assertions.assertEquals(250, cuboid.getVolume());
    }

    @Test
    public void testCourseData() {
        List<Double> widthList = new ArrayList<>(Arrays.asList(
            -5.0, 5.0, 5.0, -5.0,
            -5.0, 5.0, -5.0, 0.0,
            1.0, 1.0, 0.0, 0.0,
            1.0, 0.0, 5.25, 2.5,
            8.0, 8.0
        ));
        List<Double> lengthList = new ArrayList<>(Arrays.asList(
            1.0, -1.0, 1.0, -1.0,
            1.0, -1.0, -1.0, 3.0,
            0.0, 3.0, 0.0, 3.0,
            0.0, 0.0, 3.5, 4.25,
            4.0, 1.0
        ));
        List<Double> heightList = new ArrayList<>(Arrays.asList(
            1.0, 2.0, -2.0, 2.0,
            -2.0, -2.0, -2.0, 2.0,
            2.0, 0.0, 2.0, 0.0,
            0.0, 0.0, 2.55, 5.5,
            2.0, 1.0
        ));
        List<Double> volumeList = new ArrayList<>(Arrays.asList(
            0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 46.856249999999996, 58.4375,
            64.0, 8.0
        ));

        for (int index = 0; index < volumeList.size(); index++) {
            double width = widthList.get(index);
            double length = lengthList.get(index);
            double height = heightList.get(index);
            double volume = volumeList.get(index);

            cuboid = new Cuboid(width, length, height);
            Assertions.assertEquals(volume, cuboid.getVolume());
        }
    }

}
