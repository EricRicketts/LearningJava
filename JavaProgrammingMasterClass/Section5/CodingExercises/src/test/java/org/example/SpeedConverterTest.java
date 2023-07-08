package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SpeedConverterTest {

    private final List<Double> kmValues = Arrays.asList(1.5D, 10.25D, -5.6D, 25.42D, 75.114D);
    @Test
    public void testToMilesPerHour() {
        List<Long> expected = Arrays.asList(1L, 6L, -1L, 16L, 47L);
        for (int index = 0; index < kmValues.size(); index++) {
            double kmValue = kmValues.get(index);
            long resultantValue = SpeedConverter.toMilesPerHour(kmValue);
            long expectedValue = expected.get(index);
            Assertions.assertEquals(expectedValue, resultantValue);
        }
    }

    @Test
    public void testPrintConversion() {
        List<String> expected = Arrays.asList(
            "1.5 km/h = 1 mi/h",
            "10.25 km/h = 6 mi/h",
            "Invalid Value",
            "25.42 km/h = 16 mi/h",
            "75.114 km/h = 47 mi/h"
        );
        for (int index = 0; index < kmValues.size(); index++) {
            double kmValue = kmValues.get(index);
            String resultantValue = SpeedConverter.printConversion(kmValue);
            String expectedValue = expected.get(index);
            Assertions.assertEquals(expectedValue, resultantValue);
        }
    }
}
