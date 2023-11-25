package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondsAndMinutesChallengeTest {

    private final String errorMinutesAndSeconds = "The minutes given must be greater than or equal to zero and the " +
                    "seconds given must be less than a minute and greater than zero.";
    private String expected = "";

    @Test
    public void testNegativeSeconds() {
        String errorSecondsOnly = "The seconds given must be greater than or equal to zero.";
        Assertions.assertEquals(
            errorSecondsOnly,
            SecondsAndMinutesChallenge.getDuration(-1)
        );
    }

    @Test
    public void testNegativeMinutes() {
        Assertions.assertEquals(
            errorMinutesAndSeconds,
            SecondsAndMinutesChallenge.getDuration(-1, 55)
        );
    }

    @Test
    public void testSecondsGreaterThanFiftyNine() {
        Assertions.assertEquals(
            errorMinutesAndSeconds,
            SecondsAndMinutesChallenge.getDuration(3, 60)
        );
    }

    @Test
    public void testSecondsLessThanZeroInSecondArgument() {
        Assertions.assertEquals(
            errorMinutesAndSeconds,
            SecondsAndMinutesChallenge.getDuration(5, -2)
        );
    }

    @Test
    public void testOneHour() {
        expected = "1h 0m 0s";
        Assertions.assertEquals(
            expected,
            SecondsAndMinutesChallenge.getDuration(3600)
        );
    }

    @Test
    public void testOneMinute() {
        expected = "0h 1m 0s";
        Assertions.assertEquals(
            expected,
            SecondsAndMinutesChallenge.getDuration(60)
        );
    }

    @Test
    public void testFiftyNineMinutes() {
        expected = "0h 59m 0s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(59, 0)
        );
    }

    @Test
    public void testSixtyOneMinutesFifteenSeconds() {
        expected = "1h 1m 15s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(61, 15)
        );
    }

    @Test
    public void testOneHundredThirtyFiveMinutesTwentySeconds() {
        expected = "2h 15m 20s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(135, 20)
        );
    }

    @Test
    public void testOneHourTwentyMinutesTenSecondsInSeconds() {
        expected = "1h 20m 10s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(4810)
        );
    }

    @Test
    public void testFiftyThreeMinutesThirtyThreeSecondsInSeconds() {
        expected = "0h 53m 33s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(3213)
        );
    }

    @Test
    public void testThreeHoursSevenMinutesFortyFiveSecondsInSeconds() {
        expected = "3h 7m 45s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(11_265)
        );
    }

    @Test
    public void testInstructorDataForSeconds() {
        expected = "1h 5m 45s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(3945)
        );
    }

    @Test
    public void testInstructorDataForMinutesAndSeconds() {
        expected = "1h 5m 45s";
        Assertions.assertEquals(
                expected,
                SecondsAndMinutesChallenge.getDuration(65, 45)
        );
    }
}
