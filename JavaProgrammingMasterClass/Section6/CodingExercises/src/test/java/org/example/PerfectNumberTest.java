package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectNumberTest {

    @Test
    public void testNumberLessThanOne() {
        Assertions.assertEquals(
                false,
                PerfectNumber.isPerfectNumber(-1)
        );
    }

    @Test
    public void testSix() {
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(6));
    }

    @Test
    public void testTwentyEight() {
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(28));
    }

    @Test
    public void testOne() {
        Assertions.assertFalse(PerfectNumber.isPerfectNumber(1));
    }

    @Test
    public void testFourHundredNinetySix() {
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(496));
    }

    @Test
    public void testEightyOne() {
        Assertions.assertFalse(PerfectNumber.isPerfectNumber(81));
    }

    @Test
    public void testCourseData() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                6, 9, 28, 496, 33550336,
                0, 10, 1147, 31, 2,
                8128, 199, 3127
        ));
        List<Boolean> answers = new ArrayList<>(Arrays.asList(
                true, false, true, true, true,
                false, false, false, false, false,
                true, false, false
        ));

        for (int index = 0; index < answers.size(); index++) {
            int number = numbers.get(index);
            boolean answer = answers.get(index);
            Assertions.assertEquals(
                    answer,
                    PerfectNumber.isPerfectNumber(number)
            );
        }
    }
}
