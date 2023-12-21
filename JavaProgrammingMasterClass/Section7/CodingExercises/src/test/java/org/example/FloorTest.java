package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FloorTest {

    private final double invalidDimension = -1.0;
    @Test
    public void testWidthLessThanZero() {
        Floor floor = new Floor(invalidDimension, 1.0);
        Assertions.assertEquals(0.0, floor.getArea());
    }

    @Test
    public void testLengthLessThanZero() {
        Floor floor = new Floor(1.0, invalidDimension);
        Assertions.assertEquals(0.0, floor.getArea());
    }

    @Test
    public void testArea() {
        Floor floor = new Floor(1.5, 4.5);
        Assertions.assertEquals(6.75, floor.getArea());
    }

    @Test
    public void testCourseData() {
        List<Double> widths = new ArrayList<>(Arrays.asList(
                0.0, -1.0, 0.0, 0.0,
                1.0, 7.5, 5.0, 4.0,
                1.5, 4.5, 12.75, 6.3
        ));
        List<Double> lengths = new ArrayList<>(Arrays.asList(
                0.0, 0.0, -5.0, 1.0,
                0.0, 1.0, 2.0, 3.0,
                2.25, 6.60, 3.55, 5.40
        ));
        List<Double> areas = new ArrayList<>(Arrays.asList(
                0.0, 0.0, 0.0, 0.0,
                0.0, 7.50, 10.0, 12.0,
                3.375, 29.70, 45.2625, 34.02
        ));

        for (int index = 0; index < areas.size(); index++) {
            double width = widths.get(index);
            double length = lengths.get(index);
            double area = areas.get(index);
            Floor floor = new Floor(width, length);
            double result = Math.round(floor.getArea() * 10_000.00) / 10_000.00;
            Assertions.assertEquals(area, result);
        }
    }
}
