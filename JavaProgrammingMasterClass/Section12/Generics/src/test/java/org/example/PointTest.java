package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointTest {

    private Double xCoord;
    private Double yCoord;
    private Point point;

    @BeforeEach
    public void setUp() {
        xCoord = 44.4882; // 36.0636, 37.8855;
        yCoord = -110.5916; // -112.1079, -119.5360;
        point = new Point(xCoord, yCoord);
    }

    @Test
    public void testGetXAndSetCoord() {
        Double newXCoord = 36.0636;
        Assertions.assertEquals(xCoord, point.getxCoord());
        point.setxCoord(newXCoord);
        Assertions.assertEquals(newXCoord, point.getxCoord());
    }

    @Test
    public void testGetYAndSetCoord() {
        Double newYCoord = -112.1079;
        Assertions.assertEquals(yCoord, point.getyCoord());
        point.setyCoord(newYCoord);
        Assertions.assertEquals(newYCoord, point.getyCoord());
    }

    @Test
    public void testRender() {
        List<Double> expected = new ArrayList<>(Arrays.asList(xCoord, yCoord));
        List<Double> results = point.render();
        Assertions.assertEquals(expected, results);
    }

}
