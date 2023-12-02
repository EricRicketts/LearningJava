package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberPalindromeTest {

    @Test
    public void testFirstPalindrome() {
        Assertions.assertTrue(NumberPalindrome.isPalindrome(1221));
    }

    @Test
    public void testFirstNonPalindrome() {
        Assertions.assertFalse(NumberPalindrome.isPalindrome(11212));
    }

    @Test
    public void testNegativePalindrome() {
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-1331));
    }

    @Test
    public void testSingleDigitNumber() {
        Assertions.assertTrue(NumberPalindrome.isPalindrome(7));
    }

    @Test
    public void testZerosInNumber() {
        Assertions.assertTrue(NumberPalindrome.isPalindrome(707));
    }

    @Test
    public void testCourseData() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                11, 10, 101, -222, 25,
                33, 123321, 777, 15, 75,
                37273, 21232, 21312, 213312, 21345312
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                true, false, true, true, false,
                true, true, true, false, false,
                true, false, true, true, false
        ));
        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    NumberPalindrome.isPalindrome(number)
            );
        }
    }
}
