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

    @Test
    public void testCasesFromCourseForToMilesPerHour() {
        double[] values = new double[]{-1.0, -10.0, 0.0, 5.0, 15.25, 55.75, 100.0, 60.5};
        long[] answers = new long[]{-1, -1, 0, 3, 9, 35, 62, 38};
        for (int index = 0; index < values.length; index++) {
            double value = values[index];
            long answer = answers[index];
            Assertions.assertEquals(answer, SpeedConverter.toMilesPerHour(value));
        }
    }

    @Test
    public void testCasesFromCourseForPrintConversion() {
        double[] values = new double[]{-2.0, -25.0, 0.0, 2.0, 1.25, 95.75, 100.4, 10.25};
        String[] answers = new String[]{
            "Invalid Value", "Invalid Value", "0.0 km/h = 0 mi/h",
                "2.0 km/h = 1 mi/h", "1.25 km/h = 1 mi/h", "95.75 km/h = 60 mi/h",
                "100.4 km/h = 62 mi/h", "10.25 km/h = 6 mi/h"
        };
        for (int index = 0; index < values.length; index++) {
            double value = values[index];
            String answer = answers[index];
            Assertions.assertEquals(answer, SpeedConverter.printConversion(value));
        }
    }
}
