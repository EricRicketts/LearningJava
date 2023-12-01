package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberChallengeTest {

    @Test
    public void testPrimeNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                0, 1, 2, 3, 4,
                5, 6, 7, 8, 9,
                10, 11, 12, 13, 14,
                15, 16, 17, 18, 19
            )
        );
        List<Boolean> isPrimeResults = new ArrayList<>(Arrays.asList(
                false, false, true, true, false,
                true, false, true, false, false,
                false, true, false, true, false,
                false, false, true, false, true
            )
        );
        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            boolean isPrime = isPrimeResults.get(index);
            Assertions.assertEquals(
                    isPrime,
                    PrimeNumberChallenge.isPrime(number)
            );
        }
    }

    @Test
    public void testFindPrimeNumbersInRange() {
        Assertions.assertEquals(
                3,
                PrimeNumberChallenge.findPrimeNumbersInRange(1, 5)
        );
        Assertions.assertEquals(
                2,
                PrimeNumberChallenge.findPrimeNumbersInRange(600, 610)
        );
        Assertions.assertEquals(
                1,
                PrimeNumberChallenge.findPrimeNumbersInRange(695, 702)
        );
        Assertions.assertEquals(
                0,
                PrimeNumberChallenge.findPrimeNumbersInRange(798, 808)
        );
        Assertions.assertEquals(
                3,
                PrimeNumberChallenge.findPrimeNumbersInRange(900, 1_000)
        );
    }
}
