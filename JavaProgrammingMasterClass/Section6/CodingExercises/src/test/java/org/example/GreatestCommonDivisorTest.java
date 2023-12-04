package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCommonDivisorTest {

    @Test
    public void testInValidFirstParameter() {
        Assertions.assertEquals(
                -1,
                GreatestCommonDivisor.getGreatestCommonDivisor(9, 18)
        );
    }

    @Test
    public void testInvalidSecondParameter() {
        Assertions.assertEquals(
                -1,
                GreatestCommonDivisor.getGreatestCommonDivisor(18, 9)
        );
    }

    @Test
    public void testFifteenAndTwentyFive() {
        Assertions.assertEquals(
                5,
                GreatestCommonDivisor.getGreatestCommonDivisor(25, 15)
        );
    }

    @Test
    public void testTwelveAndThirty() {
        Assertions.assertEquals(
                6,
                GreatestCommonDivisor.getGreatestCommonDivisor(12, 30)
        );
    }

    @Test
    public void testOneFiftyThreeAndEightyOne() {
        Assertions.assertEquals(
                9,
                GreatestCommonDivisor.getGreatestCommonDivisor(153, 81)
        );
    }

    @Test
    public void testTwelveAndSixty() {
        Assertions.assertEquals(
                12,
                GreatestCommonDivisor.getGreatestCommonDivisor(12, 60)
        );
    }

    @Test
    public void testTwoLargeNumbers() {
        Assertions.assertEquals(
                36,
                GreatestCommonDivisor.getGreatestCommonDivisor(1044, 10404)
        );
    }

    @Test
    public void testTwoIdenticalNumbers() {
        Assertions.assertEquals(
                36,
                GreatestCommonDivisor.getGreatestCommonDivisor(36, 36)
        );
    }

    @Test
    public void testCourseData() {
        List<Integer> firstNumbers = new ArrayList<>(Arrays.asList(
                25, 12, 81, 132, 20, -20,
                20, -20, 10, 1010, 18, 9,
                961, 1155, 14, 21, 12, 14
        ));
        List<Integer> secondNumbers = new ArrayList<>(Arrays.asList(
                15, 30, 153, 1573, 15, 15,
                -15, -15, 35, 10, 9, 18,
                1271, 1089, 18, 30, 16, 21
        ));
        List<Integer> gcds = new ArrayList<>(Arrays.asList(
                5, 6, 9, 11, 5, -1,
                -1, -1, 5, 10, -1, -1,
                31, 33, 2, 3, 4, 7
        ));
        for (int index = 0; index < gcds.size(); index++) {
            int firstNumber = firstNumbers.get(index);
            int secondNumber = secondNumbers.get(index);
            int gcd = gcds.get(index);
            Assertions.assertEquals(
                    gcd,
                    GreatestCommonDivisor.getGreatestCommonDivisor(firstNumber, secondNumber)
            );
        }
    }

}
