package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
