package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastDigitCheckerTest {

    @Test
    public void testForIsValid() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -10, -1, 0, 9, 10,
                11, 999, 1000, 1001, 4528
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, false, true,
                true, true, true, false, false
        ));

        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    LastDigitChecker.isValid(number)
            );
        }
    }

    @Test
    public void testHasSameLastDigit() {
        List<Integer> firstNumbers = new ArrayList<>(Arrays.asList(
                41, 23, 65, 9, 1001
        ));
        List<Integer> secondNumbers = new ArrayList<>(Arrays.asList(
                22, 32, 45, 99, 700
        ));
        List<Integer> thirdNumbers = new ArrayList<>(Arrays.asList(
                71, 42, 77, 999, 800
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                true, true, true, false, false
        ));

        for (int index = 0; index < results.size(); index++) {
            int firstNumber = firstNumbers.get(index);
            int secondNumber = secondNumbers.get(index);
            int thirdNumber = thirdNumbers.get(index);
            boolean result = results.get(index);

            Assertions.assertEquals(
                    result,
                    LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber)
            );
        }
    }

    @Test
    public void testCourseDataForIsValid() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                9, 10, 11, -1, 23,
                41, 224, -411, 1081, 777,
                1001, 1000, 6272
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, true, true, false, true,
                true, true, false, false, true,
                false, true, false
        ));

        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    LastDigitChecker.isValid(number)
            );
        }
    }

    @Test
    public void testCourseDataForHasSameLastDigit() {
        List<Integer> firstNumbers = new ArrayList<>(Arrays.asList(
                9, 1, 15, 15, 10,
                11, -1, 23, 41, 22,
                -41, 10, 777, 1001, 62
        ));
        List<Integer> secondNumbers = new ArrayList<>(Arrays.asList(
                99, 1, 9, 10, 10,
                22, 11, 32, 22, 23,
                50, 11, 771, 771, 882
        ));
        List<Integer> thirdNumbers = new ArrayList<>(Arrays.asList(
                19, 2, 20, 9, 10,
                31, 11, 42, 71, 34,
                31, 81, 77, 77, 772
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, false, true,
                true, false, true, true, false,
                false, true, true, false, true
        ));

        for (int index = 0; index < results.size(); index++) {
            int firstNumber = firstNumbers.get(index);
            int secondNumber = secondNumbers.get(index);
            int thirdNumber = thirdNumbers.get(index);
            boolean result = results.get(index);

            Assertions.assertEquals(
                    result,
                    LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber)
            );
        }
   }
}