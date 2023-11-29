package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberInWordTest {

    @Test
    public void testBaseIntegers() {
        // note the test data includes all the test cases run when the course tested my code
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -15, -5, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 22
            )
        );
        List<String> numericWords = new ArrayList<>(Arrays.asList(
            "OTHER", "OTHER", "OTHER",
            "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
            "SIX", "SEVEN", "EIGHT", "NINE", "OTHER", "OTHER", "OTHER"
            )
        );
        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            String numericWord = numericWords.get(index);
            Assertions.assertEquals(
                    numericWord,
                    NumberInWord.returnNumberInWord(number)
            );
        }
    }
}
