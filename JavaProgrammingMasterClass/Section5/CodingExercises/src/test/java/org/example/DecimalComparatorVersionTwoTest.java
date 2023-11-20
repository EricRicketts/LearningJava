package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        @Test
        public void testCasesFromCourse() {
            List<Double> firstArguments = new ArrayList<>(Arrays.asList(
                    0.0, 3.1756, 3.1756, 3.1756, 3.175, 3.175,
                   -3.1756, -3.1756, -3.1756, -3.175, -3.175,
                   -3.1756, 3.1756, 3.176, 3.174, 3.175,
                   -3.1756, 3.175, -3.175, 4.0
                )
           );
            List<Double> secondArguments = new ArrayList<>(Arrays.asList(
                    0.0, 3.1757, 3.1755, 3.175, 3.1757, 3.175,
                   -3.1757, -3.1755, -3.175, -3.1757, -3.175,
                    3.1757, -3.1755, 3.175, 3.175, 3.176,
                    3.175, -3.1757, 3.175, 5.0
                )
            );
            List<Boolean> expected = new ArrayList<>(Arrays.asList(
                    true, true, true, true, true,
                    true, true, true, true, true,
                    true, false, false, false, false,
                    false, false, false, false, false
                )
            );
            for (int index = 0; index < firstArguments.size(); index++) {
                double firstArgument = firstArguments.get(index);
                double secondArgument = secondArguments.get(index);
                boolean expect = expected.get(index);
                Assertions.assertEquals(
                        expect,
                        DecimalComparatorVersionTwo.areEqualByThreeDecimalPlaces(firstArgument, secondArgument)
                );
            }
        }
    }
}
