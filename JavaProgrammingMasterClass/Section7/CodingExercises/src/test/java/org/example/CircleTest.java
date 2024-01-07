package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircleTest {

    Circle circle;
    double expected, result;

    @BeforeEach
    public void setUp() {
        circle = new Circle(3.75);
    }

    @Test
    public void testGetCircleRadius() {
        expected = 3.75;
        result = circle.getRadius();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetCircleArea() {
        expected = 44.178646691106465;
        result = circle.getArea();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCourseData() {
        List<Double> radiusList = new ArrayList<>(Arrays.asList(-5.0, -1.0, 0.0, 1.0, 3.0, 8.0));
        List<Double> areaList = new ArrayList<>(
                Arrays.asList(
                    0.0, 0.0, 0.0,
                    3.141592653589793, 28.274333882308138, 201.06192982974676
                )
        );

        for (int index = 0; index < radiusList.size(); index++) {
            expected = areaList.get(index);
            double radius = radiusList.get(index);
            circle = new Circle(radius);
            result = circle.getArea();
            Assertions.assertEquals(expected, result);
        }
    }
}
