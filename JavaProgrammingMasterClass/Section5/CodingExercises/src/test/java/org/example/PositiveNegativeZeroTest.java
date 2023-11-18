package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveNegativeZeroTest {
    @Test
    public void testForZero() {
        Assertions.assertEquals("zero", PositiveNegativeZero.checkNumber(0));
    }

    @Test
    public void testForPositive() {
        Assertions.assertEquals("positive", PositiveNegativeZero.checkNumber(1));
    }

    @Test
    public void testForNegative() {
        Assertions.assertEquals("negative", PositiveNegativeZero.checkNumber(-1));
    }

    @Test
    public void testCasesFromCourse() {
        int[] values = new int[]{1, 3278, -1, -14, 0};
        String[] answers =
                new String[]{"positive", "positive", "negative", "negative", "zero"};
        for (int index = 0; index < values.length; index++) {
            int value = values[index];
            String answer = answers[index];
            Assertions.assertEquals(answer, PositiveNegativeZero.checkNumber(value));
        }
    }
}
