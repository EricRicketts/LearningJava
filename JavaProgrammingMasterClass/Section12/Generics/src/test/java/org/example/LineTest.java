package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LineTest {

    private Double[] latitudes;
    private Double[] longitudes;
    private Line line;

    @BeforeEach
    public void setUp() {
        latitudes = new Double[]{47.2160, 35.1556, 29.1566};
        longitudes = new Double[]{-95.2348, -90.0659, -89.2495};
        line = new Line(new Double[][]{
                {latitudes[0], longitudes[0]},
                {latitudes[1], longitudes[1]},
                {latitudes[2], longitudes[2]}
        });
    }

    @Test
    public void testRenderPoint() {
        Point expected = new Point(35.1556, -90.0659);
        Point results = line.renderPoint(1);
        Assertions.assertEquals(expected.getLatitude(), results.getLatitude());
        Assertions.assertEquals(expected.getLongitude(), results.getLongitude());
    }

    @Test
    public void testRenderLine() {
        int index = 0;
        for (Point point : line.render()) {
            Double latitude = latitudes[index];
            Double longitude = longitudes[index];
            Double lineLatitude = point.getLatitude();
            Double lineLongitude = point.getLongitude();
            Assertions.assertEquals(latitude, lineLatitude);
            Assertions.assertEquals(longitude, lineLongitude);
            index += 1;
        }
    }
}
