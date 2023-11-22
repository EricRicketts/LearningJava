package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InchesToCentimeterChallengeTest {

    @Test
    public void testOneInch() {
        Assertions.assertEquals(
                2.54,
                InchesToCentimetersChallenge.toCentimeters(1)
        );
    }

    @Test
    public void testOneFoot() {
        Assertions.assertEquals(
                30.48,
                InchesToCentimetersChallenge.toCentimeters(1, 0)
        );
    }

    @Test
    public void testThreeFeetSevenInches() {
        Assertions.assertEquals(
                109.22,
                InchesToCentimetersChallenge.toCentimeters(3, 7)
        );
    }
}
