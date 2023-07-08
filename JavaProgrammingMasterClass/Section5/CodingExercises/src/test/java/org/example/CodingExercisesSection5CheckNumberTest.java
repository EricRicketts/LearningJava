package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodingExercisesSection5CheckNumberTest {
    @Test
    public void testForZero() {
        Assertions.assertEquals("zero", CodingExercisesSection5.checkNumber(0));
    }

    @Test
    public void testForPositive() {
        Assertions.assertEquals("positive", CodingExercisesSection5.checkNumber(1));
    }

    @Test
    public void testForNegative() {
        Assertions.assertEquals("negative", CodingExercisesSection5.checkNumber(-1));
    }
}
