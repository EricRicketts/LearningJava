package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOddRangeTest {

    @Test
    public void testIsOdd() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -10, -1, 0, 1, 2,
                3, 10, 5, 7, 22,
                97
            )
        );
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, true, false,
                true, false, true, true, false,
                true
            )
        );
        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    SumOddRange.isOdd(number)
            );
        }
    }

    @Test
    public void testOddRanges() {
        List<Integer> starts = new ArrayList<>(Arrays.asList(
                -10, 2, 5, 20
        ));
        List<Integer> ends = new ArrayList<>(Arrays.asList(
                2, -10, 3, 30
        ));
        List<Integer> sums = new ArrayList<>(Arrays.asList(
                -1, -1, -1, 125
        ));
        for (int index = 0; index < ends.size(); index++) {
            int start = starts.get(index);
            int end = ends.get(index);
            int sum = sums.get(index);
            Assertions.assertEquals(
                    sum,
                    SumOddRange.sumOdd(start, end)
            );
        }
    }

    @Test
    public void testCourseDataForIsOdd() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -5, -1, 24, 4, 7, 3, 23, 107, 208, 11
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, false, true, true, true, true, false, true
        ));
        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    SumOddRange.isOdd(number)
            );
        }
    }

    @Test
    public void testOddSums() {
        List<Integer> starts = new ArrayList<>(Arrays.asList(
                1, 10, 1, 100, 10, 13, 10, -4, -15, 1, 2
        ));
        List<Integer> ends = new ArrayList<>(Arrays.asList(
                11, 20, 100, 1_000, 10, 13, 5, 6, -10, -5, 7
        ));
        List<Integer> sums = new ArrayList<>(Arrays.asList(
                36, 75, 2_500, 247_500, 0, 13, -1, -1, -1, -1, 15
        ));
        for (int index = 0; index < sums.size(); index++) {
            int start = starts.get(index);
            int end = ends.get(index);
            int sum = sums.get(index);
            Assertions.assertEquals(
                    sum,
                    SumOddRange.sumOdd(start, end)
            );
        }
    }
}
