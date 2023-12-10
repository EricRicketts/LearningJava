package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestPrimeTest {

    @Test
    public void testLargestPrimeOfZero() {
        Assertions.assertEquals(
                -1,
                LargestPrime.getLargestPrime(0)
        );
    }

    @Test
    public void testLargestPrimeOfOne() {
        Assertions.assertEquals(
                -1,
                LargestPrime.getLargestPrime(1)
        );
    }

    @Test
    public void testLargestPrimeOfNegativeNumber() {
        Assertions.assertEquals(
                -1,
                LargestPrime.getLargestPrime(-10)
        );
    }

    @Test
    public void testLargestPrimeOfTwentyOne() {
        Assertions.assertEquals(
                7,
                LargestPrime.getLargestPrime(21)
        );
    }

    @Test
    public void testLargestPrimeOfFortyFive() {
        Assertions.assertEquals(
                5,
                LargestPrime.getLargestPrime(45)
        );
    }

    @Test
    public void testLargestPrimeOfTwoHundredAndSeventeen() {
        Assertions.assertEquals(
                31,
                LargestPrime.getLargestPrime(217)
        );
    }

    @Test
    public void testLargestPrimeOfThirtySeven() {
        Assertions.assertEquals(
                37,
                LargestPrime.getLargestPrime(37)
        );
    }

    @Test
    public void testLargestPrimeOfOneHundredAndSeventyFour() {
        Assertions.assertEquals(
                97,
                LargestPrime.getLargestPrime(582)
        );
    }

    @Test
    public void testCourseData() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(
                21, 7, 1, 217, -1,
                0, -10, 1147, 31, 2,
                45, 199, 3127, 16, 12
        ));
        List<Integer> largestPrimeList = new ArrayList<>(Arrays.asList(
                7, 7, -1, 31, -1,
                -1, -1, 37, 31, 2,
                5, 199, 59, 2, 3
        ));
        for (int index = 0; index < numberList.size(); index++) {
            int number = numberList.get(index);
            int largestPrime = largestPrimeList.get(index);
            Assertions.assertEquals(
                    largestPrime,
                    LargestPrime.getLargestPrime(number)
            );
        }
    }
}
