package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastDigitSumTest {

    @Test
    public void testCourseExampleData() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                252, 257, 0, 5, -10
        ));
        List<Integer> results = new ArrayList<>(Arrays.asList(
                4, 9, 0, 10, -1
        ));
        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            int result = results.get(index);
            Assertions.assertEquals(
                    result,
                    FirstLastDigitSum.sumFirstAndLastDigit(number)
            );
        }
    }

    @Test
    public void testCourseData() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -5, 0, 5, 7, 11,
                10, 101, -222, 257, 3322,
                123321, 777, 154, 275, 37273,
                99, 81
        ));
        List<Integer> results = new ArrayList<>(Arrays.asList(
                -1, 0, 10, 14, 2,
                1, 2, -1, 9, 5,
                2, 14, 5, 7, 6,
                18, 9
        ));

        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            int result = results.get(index);
            Assertions.assertEquals(
                    result,
                    FirstLastDigitSum.sumFirstAndLastDigit(number)
            );
        }
    }
}
