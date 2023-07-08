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
}
