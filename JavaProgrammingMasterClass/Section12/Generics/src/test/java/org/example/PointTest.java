package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointTest {

    private static Double originalXCoord = 44.4882;
    private static Double originalYCoord = -110.5916;
    private Point point;

    @BeforeEach
    public void setUp() {
        point = new Point(originalXCoord, originalYCoord);
    }

    @Test
    public void testGetXAndSetCoord() {
        Double newXCoord = 34.8913;
        Assertions.assertEquals(originalXCoord, point.getxCoord());
        point.setxCoord(newXCoord);
        Assertions.assertEquals(newXCoord, point.getxCoord());
    }

    @Test
    public void testGetYAndSetCoord() {
        Double newYCoord = 30.1122;
        Assertions.assertEquals(originalYCoord, point.getyCoord());
        point.setyCoord(newYCoord);
        Assertions.assertEquals(newYCoord, point.getyCoord());
    }

    @Test
    public void testRender() {
        List<Double> expected = new ArrayList<>(Arrays.asList(originalXCoord, originalYCoord));
        List<Double> results = point.render();
        Assertions.assertEquals(expected, results);
    }

}
