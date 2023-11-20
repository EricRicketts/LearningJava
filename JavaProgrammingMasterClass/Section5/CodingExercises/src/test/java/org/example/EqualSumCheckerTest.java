package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualSumCheckerTest {

    @Test
    public void testThreeOnes() {
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
    }

    @Test
    public void testOneOneTwo() {
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
    }

    @Test
    public void testOneNegativeOneZero() {
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1, -1, 0));
    }

    @Test
    public void testCasesFromCourse() {
        List<Integer> firstArguments = new ArrayList<>(Arrays.asList(
                1, 1, 0, 2, 1, 21, 0, -1, 1, 1, -1
            )
        );

        List<Integer> secondArguments = new ArrayList<>(Arrays.asList(
                1, 1, -2, 0, 2, 21, 1, 0, -1, 1, -1
            )
        );

        List<Integer> expectedSums = new ArrayList<>(Arrays.asList(
                1, 2, -2, 2, -1, 42, 1, -1, 0, -1, -2
            )
        );

        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, true, true, true, false, true,
                true, true, true, false, true
            )
        );

        for (int index = 0; index < expectedSums.size(); index++) {
            int firstArgument = firstArguments.get(index);
            int secondArgument = secondArguments.get(index);
            int expectedSum = expectedSums.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                result, EqualSumChecker.hasEqualSum(firstArgument, secondArgument, expectedSum)
            );
        }
    }
}
