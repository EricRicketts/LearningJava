package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Nested
    public class TestTrueLeapYears {
        @Test
        public void testSixteenHundred() {
            Assertions.assertTrue(LeapYear.isLeapYear(1600));
        }

        @Test
        public void testTwoThousand() {
            Assertions.assertTrue(LeapYear.isLeapYear(2000));
        }

        @Test
        public void testTwoThousandFourHundred() {
            Assertions.assertTrue(LeapYear.isLeapYear(2400));
        }
    }

    @Nested
    public class TestFalseLeapYears {
        @Test
        public void testNegativeNumber() {
            Assertions.assertFalse(LeapYear.isLeapYear(-1600));
        }

        @Test
        public void testTwentySeventeen() {
            Assertions.assertFalse(LeapYear.isLeapYear(2017));
        }

        @Test
        public void testSeventeenHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(1700));
        }

        @Test
        public void testEighteenHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(1800));
        }

        @Test
        public void testNineteenHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(1900));
        }

        @Test
        public void testTwoThousandOneHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(2100));
        }

        @Test
        public void testTwoThousandTwoHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(2200));
        }

        @Test
        public void testTwoThousandThreeHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(2300));
        }

        @Test
        public void testTwoThousandFiveHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(2500));
        }

        @Test
        public void testTwoThousandSixHundred() {
            Assertions.assertFalse(LeapYear.isLeapYear(2600));
        }
    }
}
