package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WallTest {

    private Wall firstWall;
    private Wall secondWall;
    private double expected;

    @BeforeEach
    public void setUp() {
        firstWall = new Wall();
        secondWall = new Wall(5.5, 10.0);
    }

    @Test
    public void testGetWidthNoArgumentsConstructor() {
        // a double field should initialize to zero
        expected = 0.0;
        Assertions.assertEquals(expected, firstWall.getWidth());
    }

    @Test
    public void testGetHeightNoArgumentsConstructor() {
        // a double field should initialize to zero
        expected = 0.0;
        Assertions.assertEquals(expected, firstWall.getHeight());
    }

    @Test
    public void testGetAreaNoArgumentsConstructor() {
        // since both width and height initialize to zero, area should be zero
        expected = 0.0;
        Assertions.assertEquals(expected, firstWall.getArea());
    }

    @Test
    public void testGetWidthConstructorWithArguments() {
        expected = 5.5;
        Assertions.assertEquals(expected, secondWall.getWidth());
    }

    @Test
    public void testGetHeightConstructorWithArguments() {
        expected = 10.0;
        Assertions.assertEquals(expected, secondWall.getHeight());
    }

    @Test
    public void testGetAreaConstructorWithArguments() {
        expected = 55.0;
        Assertions.assertEquals(expected, secondWall.getArea());
    }

    @Test
    public void testWidthLessThanZero() {
        expected = 0.0;
        firstWall.setWidth(-1.5);
        Assertions.assertEquals(expected, firstWall.getWidth());
    }

    @Test
    public void testHeightLessThanZero() {
        expected = 0.0;
        firstWall.setHeight(-0.5);
        Assertions.assertEquals(expected, firstWall.getHeight());
    }

    @Test
    public void testSetValidWidth() {
        expected = 2.25;
        firstWall.setWidth(expected);
        Assertions.assertEquals(expected, firstWall.getWidth());
    }

    @Test
    public void testSetValidHeight() {
        expected = 9.25;
        firstWall.setHeight(expected);
        Assertions.assertEquals(expected, firstWall.getHeight());
    }

    @Test
    public void testInvalidWidthConstructorCall() {
        Wall wall = new Wall(-0.5, 10.0);
        expected = 0.0;
        Assertions.assertEquals(expected, wall.getWidth());
    }

    @Test
    public void testInvalidHeightConstructorCall() {
        Wall wall = new Wall(10.0, -0.001);
        expected = 0.0;
        Assertions.assertEquals(expected, wall.getHeight());
    }

    @Test
    public void testCourseData() {
        List<Double> widths = new ArrayList<>(Arrays.asList(
                -1.25, 1.125, -1.125,
                0.0, 2.34, 4.5,
                1.75, 8.0, 6.0
        ));
        List<Double> heights = new ArrayList<>(Arrays.asList(
                -1.25, -1.0, 1.0,
                1.25, 0.0, 2.0,
                1.75, 7.0, 5.0
        ));
        List<Double> areas = new ArrayList<>(Arrays.asList(
                0.0, 0.0, 0.0,
                0.0, 0.0, 9.0,
                3.0625, 56.0, 30.0
        ));

        for (int index = 0; index < areas.size(); index++) {
            double width = widths.get(index);
            double height = heights.get(index);
            double area = areas.get(index);
            Wall wall = new Wall(width, height);

            Assertions.assertEquals(area, wall.getArea());
        }
    }
}
