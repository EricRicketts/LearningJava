package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinutesToYearsAndDaysCalculatorTest {

    String expected = "";

    @Test
    public void testInvalidInput() {
        expected = "Invalid Value";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(-1)
        );
    }

    @Test
    public void testMinutesForOneYear() {
        expected = "525600 min = 1 y and 0 d";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(525600)
        );
    }

    @Test
    public void testMinutesForTwoYears() {
        expected = "1051200 min = 2 y and 0 d";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(1051200)
        );
    }

    @Test
    public void testOneYearAndTwentyFiveDays() {
        expected = "561600 min = 1 y and 25 d";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(561600)
        );
    }

    @Test
    public void testTwoYearsAndTwoHundredAndSixtyFiveDays() {
        expected = "1432800 min = 2 y and 265 d";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(1_432_800)
        );
    }

    @Test
    public void testTwoYearsAndTwoHundredAndSixtyFiveDaysWithRemainder() {
        // one extra day is 60 * 24 = 1_440 minutes subtract 1 for 1439
        // add this to 1,432,800
        expected = "1434239 min = 2 y and 265 d";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(1_434_239)
        );
    }

    @Test
    public void testTwoYearsAndTwoHundredAndSixtySixDays() {
        expected = "1434240 min = 2 y and 266 d";
        Assertions.assertEquals(
                expected,
                MinutesToYearsAndDaysCalculator.returnYearsAndDays(1_434_240)
        );
    }

    @Test
    public void testCourseTestData() {
        List<Long> minutesList = new ArrayList<Long>(Arrays.asList(
                -525600L, -1440L, -60L,
                0L, 1440L, 525600L,
                1051200L, 581760L, 527040L,
                561600L, 1788480L, 3152160L
            )
        );
        List<String> results = new ArrayList<>(Arrays.asList(
                "Invalid Value", "Invalid Value", "Invalid Value",
                "0 min = 0 y and 0 d", "1440 min = 0 y and 1 d", "525600 min = 1 y and 0 d",
                "1051200 min = 2 y and 0 d", "581760 min = 1 y and 39 d", "527040 min = 1 y and 1 d",
                "561600 min = 1 y and 25 d", "1788480 min = 3 y and 147 d", "3152160 min = 5 y and 364 d"
            )
        );

        for (int index = 0; index < minutesList.size(); index++) {
            long minutes = minutesList.get(index);
            String result = results.get(index);
            Assertions.assertEquals(
                    result,
                    MinutesToYearsAndDaysCalculator.returnYearsAndDays(minutes)
            );
        }
    }
}
