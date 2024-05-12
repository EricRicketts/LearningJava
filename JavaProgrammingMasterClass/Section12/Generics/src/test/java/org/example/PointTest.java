package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointTest {

    private Double latitude;
    private Double longitude;
    private Point point;

    @BeforeEach
    public void setUp() {
        latitude = 44.4882; // 36.0636, 37.8855;
        longitude = -110.5916; // -112.1079, -119.5360;
        point = new Point(latitude, longitude);
    }

    @Test
    public void testGetAndSetLatitude() {
        Double newLatitude = 36.0636;
        Assertions.assertEquals(latitude, point.getLatitude());
        point.setLatitude(newLatitude);
        Assertions.assertEquals(newLatitude, point.getLatitude());
    }

    @Test
    public void testGetAndSetLongitude() {
        Double newLongitude = -112.1079;
        Assertions.assertEquals(longitude, point.getLongitude());
        point.setLongitude(newLongitude);
        Assertions.assertEquals(newLongitude, point.getLongitude());
    }

    @Test
    public void testRender() {
        List<Double> expected = new ArrayList<>(Arrays.asList(latitude, longitude));
        List<Double> results = point.render();
        Assertions.assertEquals(expected, results);
    }

}
