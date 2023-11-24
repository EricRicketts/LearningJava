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
}
