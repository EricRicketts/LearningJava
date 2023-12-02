package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDigitSumTest {

    @Test
    public void testNineDigitNumber() {
        Assertions.assertEquals(
                20,
                EvenDigitSum.getEvenDigitSum(123456789)
        );
    }

    @Test
    public void testThreeDigitNumber() {
        Assertions.assertEquals(
                4,
                EvenDigitSum.getEvenDigitSum(252)
        );
    }

    @Test
    public void testNegativeNumber() {
        Assertions.assertEquals(
                -1,
                EvenDigitSum.getEvenDigitSum(-22)
        );
    }

    @Test
    public void testSingleDigitNumber() {
        Assertions.assertEquals(
                0,
                EvenDigitSum.getEvenDigitSum(9)
        );
    }

    @Test
    public void testCourseData() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                123456789, 2000, 252, 0, 605254,
                -10, 6688, -22, -468, 246824683,
                987612345
        ));
        List<Integer> results = new ArrayList<>(Arrays.asList(
                20, 2, 4, 0, 12,
                -1, 28, -1, -1, 40,
                20
        ));

        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            int result = results.get(index);
            Assertions.assertEquals(
                    result,
                    EvenDigitSum.getEvenDigitSum(number)
            );
        }
    }
}
