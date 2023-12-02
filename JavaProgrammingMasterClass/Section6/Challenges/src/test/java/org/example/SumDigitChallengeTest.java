package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumDigitChallengeTest {

    @Test
    public void testOneHundredTwentyFive() {
        Assertions.assertEquals(
                8,
                SumDigitChallenge.sumDigits(125)
        );
    }

    @Test
    public void testOneThousand() {
        Assertions.assertEquals(
                1,
                SumDigitChallenge.sumDigits(1_000)
        );
    }

    @Test
    public void testNegativeNumber() {
        Assertions.assertEquals(
                -1,
                SumDigitChallenge.sumDigits(-15)
        );
    }

    @Test
    public void testSingleDigitNumber() {
        Assertions.assertEquals(
                8,
                SumDigitChallenge.sumDigits(8)
        );
    }

    @Test
    public void testLargeNumber() {
        Assertions.assertEquals(
                25,
                SumDigitChallenge.sumDigits(167_308)
        );
    }
}
