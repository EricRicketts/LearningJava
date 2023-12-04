package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberToWordsTest {

    @Test
    public void testGetDigitCount() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                0, 123, -12, 5200
        ));
        List<Integer> numberOfDigitsList = new ArrayList<>(Arrays.asList(
                1, 3, -1, 4
        ));
        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            int numberOfDigits = numberOfDigitsList.get(index);
            Assertions.assertEquals(
                    numberOfDigits,
                    NumberToWords.getDigitCount(number)
            );
        }
    }
}
