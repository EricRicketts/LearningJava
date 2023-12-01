package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumThreeAndFiveChallengeTest {

    @Test
    public void testSumThreeAndFiveChallenge() {
        Assertions.assertEquals(
                33,
                SumThreeAndFiveChallenge.sumMultiplesOfThreeOrFive(1, 10)
        );
        Assertions.assertEquals(
                1350,
                SumThreeAndFiveChallenge.sumMultiplesOfThreeOrFive(100, 125)
        );
        Assertions.assertEquals(
                225,
                SumThreeAndFiveChallenge.sumMultiplesOfThreeAndFive(100, 120)
        );
        Assertions.assertEquals(
                225,
                SumThreeAndFiveChallenge.sumMultiplesOfThreeAndFive(0, 75)
        );
    }
}
