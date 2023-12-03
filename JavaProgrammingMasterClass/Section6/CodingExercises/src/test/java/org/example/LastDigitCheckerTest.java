package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastDigitCheckerTest {

    @Test
    public void testForIsValid() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                -10, -1, 0, 9, 10,
                11, 999, 1000, 1001, 4528
        ));
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, false, true,
                true, true, true, false, false
        ));

        for (int index = 0; index < results.size(); index++) {
            int number = numbers.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    LastDigitChecker.isValid(number)
            );
        }
    }
}
