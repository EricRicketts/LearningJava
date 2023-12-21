package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointTest {

    @Test
    public void testNonIrrationalDistance() {
        Point p = new Point(3, 4);
        Assertions.assertEquals(5.0, p.distance());
    }

    @Test
    public void testDistanceBetweenTwoPointsPointFormat() {
        Point p = new Point(4, 5);
        Point p1 = new Point(1, 1);
        Assertions.assertEquals(5.0, p.distance(p1));
    }

    @Test
    public void testDistanceBetweenTwoPointsCoordinateFormat() {
        Point p = new Point(4, 5);
        Assertions.assertEquals(5.0, p.distance(1, 1));
    }

    @Test
    public void testGetAndSetX() {
        Point p = new Point();
        Assertions.assertEquals(0, p.getX());
        p.setX(5);
        Assertions.assertEquals(5, p.getX());
    }

    @Test
    public void testGetAndSetY() {
        Point p = new Point();
        Assertions.assertEquals(0, p.getY());
        p.setY(5);
        Assertions.assertEquals(5, p.getY());
    }

    @Test
    public void testCourseDataDistanceCoordinateFormat() {
        List<Integer> x1Data = new ArrayList<>(Arrays.asList(
                0, -1, -3,
                5, -4, 11,
                17, 9, 1
        ));
        List<Integer> y1Data = new ArrayList<>(Arrays.asList(
                0, 1, -4,
                7, 3, -3,
                1, 5, 3
        ));
        List<Integer> x2Data = new ArrayList<>(Arrays.asList(
                0, 1, 3,
                -1, 5, 5,
                1, -3, 6
        ));
        List<Integer> y2Data = new ArrayList<>(Arrays.asList(
                0, -1, 4,
                2, -4, 7,
                -2, -7, 1
        ));
        List<Double> distances = new ArrayList<>(Arrays.asList(
                0.0, Math.sqrt(8), 10.0,
                Math.sqrt(61), Math.sqrt(130), Math.sqrt(136),
                Math.sqrt(265), Math.sqrt(288), Math.sqrt(29)
        ));

        for (int index = 0; index < distances.size(); index++) {
            int x1 = x1Data.get(index);
            int y1 = y1Data.get(index);
            int x2 = x2Data.get(index);
            int y2 = y2Data.get(index);
            double distance = distances.get(index);
            Point p1 = new Point(x1, y1);
            Assertions.assertEquals(
                    distance,
                    p1.distance(x2, y2)
            );
        }
    }

    @Test
    public void testCourseDataDistanceFromOrigin() {
        List<Integer> xData = new ArrayList<>(Arrays.asList(
                -1, 2, 3,
                0, 4, -4,
                17, 9, 6
        ));
        List<Integer> yData = new ArrayList<>(Arrays.asList(
                -1, -2, 4,
                0, 3, 3,
                17, 5, 5
        ));
        List<Double> distances = new ArrayList<>(Arrays.asList(
                Math.sqrt(2), Math.sqrt(8), 5.0,
                0.0, 5.0, 5.0,
                Math.sqrt(578), Math.sqrt(106), Math.sqrt(61)
        ));

        for (int index = 0; index < distances.size(); index++) {
            int x = xData.get(index);
            int y = yData.get(index);
            double distance = distances.get(index);
            Point p = new Point(x, y);

            Assertions.assertEquals(distance, p.distance());
        }
    }
}
