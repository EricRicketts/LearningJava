package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DecimalComparatorVersionTwoTest {
    @Nested
    public class DecimalComparatorVersionTwoTrueCompares {
        @Test
        public void testThreeDigitDecimalPlacesPositiveNumbers() {
            Assertions.assertTrue(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(3.175, 3.175));
        }

        @Test
        public void testThreeDigitDecimalPlacesNegativeNumbers() {
            Assertions.assertTrue(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(-3.175, -3.175));
        }

        @Test
        public void testFourAndThreeDigitDecimalPlaces() {
            Assertions.assertTrue(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(3.1756, 3.175));
        }

        @Test
        public void testFourAndThreeDigitDecimalPlacesNegativeNumbers() {
            Assertions.assertTrue(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        }

        @Test
        public void testSingleDigitDecimalPlace() {
            Assertions.assertTrue(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(3.0, 3.0));
        }
    }

    @Nested
    public class DecimalComparatorVersionTwoFalseCompares {
        @Test
        public void testLastDigitOfTheThreeDecimalPlacesDoNoMatch() {
            Assertions.assertFalse(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(3.175, 3.176));
        }

        @Test
        public void testLastDigitOfTheThreeDecimalPlacesDoNoMatchNegativeNumbers() {
            Assertions.assertFalse(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(-3.175, -3.176));
        }

        @Test
        public void testSignsDifferButDecimalsMatch() {
            Assertions.assertFalse(DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        }
    }
}
