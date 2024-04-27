package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LineTest {

    private Double[] xCoords;
    private Double[] yCoords;
    private List<Point> points = new ArrayList<>();
    private Line line;

    @BeforeEach
    public void setUp() {
        xCoords = new Double[]{47.2160, 35.1556, 29.1566};
        yCoords = new Double[]{-95.2348, -90.0659, -89.2495};
        for (int index = 0; index < 3; index++) {
            points.add(new Point(xCoords[index], yCoords[index]));
        }
        line = new Line(points);
    }

    @Test
    public void testRenderPoint() {
        Point expected = new Point(35.1556, -90.0659);
        Point results = line.renderPoint(1);
        Assertions.assertEquals(expected.getxCoord(), results.getxCoord());
        Assertions.assertEquals(expected.getyCoord(), results.getyCoord());
    }

    @Test
    public void testRenderLine() {
        int index = 0;
        for (Point point : line.render()) {
            Double xCoord = xCoords[index];
            Double yCoord = yCoords[index];
            Double lineXCoord = point.getxCoord();
            Double lineYCoord = point.getyCoord();
            Assertions.assertEquals(xCoord, lineXCoord);
            Assertions.assertEquals(yCoord, lineYCoord);
            index += 1;
        }
    }
}
