package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DecimalComparatorTest {
    @Nested
    public class DecimalComparatorTrueCompares {
        @Test
        public void testFourAndThreeDigitDecimalPlaces() {
            Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        }

        @Test
        public void testSingleDigitDecimalPlace() {
            Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        }
    }

    @Nested
    public class DecimalComparatorFalseCompares {
        @Test
        public void testLastDigitOfTheThreeDecimalPlacesDoNoMatch() {
            Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        }

        @Test
        public void testSignsDifferButDecimalsMatch() {
            Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        }
    }
}
