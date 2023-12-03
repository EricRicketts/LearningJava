package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharedDigitTest {

    @Test
    public void testTwelveAndTwentyThree() {
        Assertions.assertTrue(SharedDigit.hasSharedDigit(12, 23));
    }

    @Test
    public void testNineAndNinetyNine() {
        Assertions.assertFalse(SharedDigit.hasSharedDigit(9, 99));
    }

    @Test
    public void testFifteenAndFiftyFive() {
        Assertions.assertTrue(SharedDigit.hasSharedDigit(15, 55));
    }

    @Test
    public void testCourseData() {
        List<Integer> firstIntegers = new ArrayList<>(Arrays.asList(
                9, 9, 100, 10, 19,
                99, 12, 12, 12, 12,
                12, 44, 77, 12, 14,
                15, 21, 13, 0, -10
        ));
        List<Integer> secondIntegers = new ArrayList<>(Arrays.asList(
                9, 99, 10, 100, 99,
                9, 23, 13, 21, 23,
                42, 14, 77, 43, 44,
                55, 12, 37, 0, 11
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, false, true,
                false, true, true, true, true,
                true, true, true, false, true,
                true, true, true, false, false
        ));

        for (int index = 0; index < results.size(); index++) {
            int firstInteger = firstIntegers.get(index);
            int secondInteger = secondIntegers.get(index);
            boolean result = results.get(index);

            Assertions.assertEquals(
                    result,
                    SharedDigit.hasSharedDigit(firstInteger, secondInteger)
            );
        }
    }
}
