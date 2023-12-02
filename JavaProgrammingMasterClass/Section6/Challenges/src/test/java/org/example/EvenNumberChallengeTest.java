package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumberChallengeTest {

    @Test
    public void testEvenNumberChallenge() {
        int loopEnd = 20;
        int number = 5;
        List<Integer> expected = new ArrayList<>(Arrays.asList(
                6, 8, 10, 12, 14, 16, 18, 20
        ));
        List<Integer> evenNumbers = new ArrayList<>();
        while (number <= loopEnd) {
            if (EvenNumberChallenge.isEvenNumber(number)) evenNumbers.add(number);
            number += 1;
        }
        Assertions.assertEquals(
                expected,
                evenNumbers
        );
    }

    @Test
    public void testFindFiveEvenNumbers() {
        int loopLimit = 20;
        int allNumbersTested = 0;
        int evenNumbersFound = 0;
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 8, 10, 12, 14));
        List<Integer> evenNumbers = new ArrayList<>();

        int number = 5;
        while (evenNumbersFound <= loopLimit) {
            if (evenNumbersFound >= 5) break;
            if (EvenNumberChallenge.isEvenNumber(number)) {
                evenNumbers.add(number);
                evenNumbersFound += 1;
            }
            allNumbersTested += 1;
            number += 1;
        }

        Assertions.assertEquals(
                expected,
                evenNumbers
        );
        Assertions.assertEquals(
                5,
                evenNumbersFound
        );
        Assertions.assertEquals(
                10,
                allNumbersTested
        );
    }
}
