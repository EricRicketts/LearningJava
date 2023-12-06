package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberToWordsTest {

    String expected;
    @Test
    public void testGetDigitCount() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                0, 123, -12, 5200
        ));
        List<Integer> numberOfDigitsList = new ArrayList<>(Arrays.asList(
                1, 3, -1, 4
        ));
        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            int numberOfDigits = numberOfDigitsList.get(index);
            Assertions.assertEquals(
                    numberOfDigits,
                    NumberToWords.getDigitCount(number)
            );
        }
    }

    @Test
    public void testReverse() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -121, 1212, 1234, 100
        ));
        List<Integer> reversedNumbers = new ArrayList<>(Arrays.asList(
                -121, 2121, 4321, 1
        ));

        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            int reversedNumber = reversedNumbers.get(index);
            Assertions.assertEquals(
                    reversedNumber,
                    NumberToWords.reverse(number)
            );
        }
    }

    @Test
    public void testOneTwoThreeFour() {
        expected = "One Two Three Four";
        Assertions.assertEquals(
                expected,
                NumberToWords.getNumberToWords(1234)
        );
    }

    @Test
    public void testOneZeroOneZero() {
        expected = "One Zero One Zero";
        Assertions.assertEquals(
                expected,
                NumberToWords.getNumberToWords(1010)
        );
    }

    @Test
    public void TestOneZeroZeroZero() {
        expected = "One Zero Zero Zero";
        Assertions.assertEquals(
                expected,
                NumberToWords.getNumberToWords(1000)
        );
    }

    @Test
    public void testNegativeOneTwo() {
        expected = "Invalid Value";
        Assertions.assertEquals(
                expected,
                NumberToWords.getNumberToWords(-12)
        );
    }

    @Test
    public void testCourseDataForGetDigitCount() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                11, 0, 1, 7,
                101, -222, 1010, 100,
                123321, 10000, 37273, -37273,
                1132273
        ));
        List<Integer> answers = new ArrayList<>(Arrays.asList(
                2, 1, 1, 1,
                3, -1, 4, 3,
                6, 5, 5, -1,
                7
        ));

        for (int index = 0; index < answers.size(); index++) {
            int number = numbers.get(index);
            int answer = answers.get(index);
            Assertions.assertEquals(
                    answer,
                    NumberToWords.getDigitCount(number)
            );
        }
    }

    @Test
    public void testCourseDataForReverse() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                0, 5, -2, -1,
                24, 23, 107, 208,
                -2521, 12345, 123, 323323,
                157
        ));
        List<Integer> answers = new ArrayList<>(Arrays.asList(
                0, 5, -2, -1,
                42, 32, 701, 802,
                -1252, 54321, 321, 323323,
                751
        ));

        for (int index = 0; index < answers.size(); index++) {
            int number = numbers.get(index);
            int answer = answers.get(index);
            Assertions.assertEquals(
                    answer,
                    NumberToWords.reverse(number)
            );
        }
    }
}
