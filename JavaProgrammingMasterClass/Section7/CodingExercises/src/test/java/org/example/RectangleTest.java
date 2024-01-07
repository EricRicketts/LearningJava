package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        rectangle = new Rectangle(5, 10);
    }

    @Test
    public void testGetWidthOfRectangle() {
        Assertions.assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void testGetLengthOfRectangle() {
        Assertions.assertEquals(10, rectangle.getLength());
    }

    @Test
    public void testGetAreaOfRectangle() {
        Assertions.assertEquals(50, rectangle.getArea());
    }

    @Test
    public void testCourseData() {
        List<Double> widthList = new ArrayList<>(Arrays.asList(
                -5.0, 5.0, -5.0, 0.0, 1.0, 5.25, 2.15
        ));
        List<Double> lengthList = new ArrayList<>(Arrays.asList(
                1.0, -1.0, -1.0, 0.0, 3.0, 3.5, 4.75
        ));
        List<Double> areaList = new ArrayList<>(Arrays.asList(
                0.0, 0.0, 0.0, 0.0, 3.0, 18.375, 10.2125
        ));
        for (int index = 0; index < widthList.size(); index++) {
            double width = widthList.get(index);
            double length = lengthList.get(index);
            double area = areaList.get(index);
            rectangle = new Rectangle(width, length);
            Assertions.assertEquals(area, rectangle.getArea());
        }
    }
}
