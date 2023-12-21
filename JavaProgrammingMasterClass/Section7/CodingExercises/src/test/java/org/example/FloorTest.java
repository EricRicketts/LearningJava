package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FloorTest {

    double invalidDimension = -1;
    @Test
    public void testWidthLessThanZero() {
        Floor floor = new Floor(invalidDimension, 1.0);
        Assertions.assertEquals(0.0, floor.width());
    }

    @Test
    public void testLengthLessThanZero() {
        Floor floor = new Floor(1.0, invalidDimension);
        Assertions.assertEquals(0.0, floor.length());
    }

    @Test
    public void testArea() {
        Floor floor = new Floor(1.5, 4.5);
        Assertions.assertEquals(6.75, floor.getArea());
    }
}
