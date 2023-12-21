package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComplexNumberTest {

    ComplexNumber one;
    ComplexNumber number;

    @BeforeEach
    public void setUp() {
        one = new ComplexNumber(1.0, 1.0);
        number = new ComplexNumber(2.5, -1.5);
    }

    @Test
    public void testAddRealAndImaginaryParts() {
        one.add(1, 1);
        Assertions.assertEquals(2.0, one.getReal());
        Assertions.assertEquals(2.0, one.getImaginary());
    }

    @Test
    public void testSubtractComplexNumber() {
        one = new ComplexNumber(2.0, 2.0);
        one.subtract(number);
        Assertions.assertEquals(-0.50, one.getReal());
        Assertions.assertEquals(3.50, one.getImaginary());
    }

    @Test
    public void testSubtractOneFromNumber() {
        one = new ComplexNumber(-0.50, 3.50);
        number.subtract(one);
        Assertions.assertEquals(3.00, number.getReal());
        Assertions.assertEquals(-5.00, number.getImaginary());
    }

    @Test
    public void testSubtractRealAndImaginaryParts() {
        number.subtract(1.0, 1.0);
        Assertions.assertEquals(1.50, number.getReal());
        Assertions.assertEquals(-2.50, number.getImaginary());
    }

    @Test
    public void testAddComplexNumber() {
        one.add(number);
        Assertions.assertEquals(3.50, one.getReal());
        Assertions.assertEquals(-0.50, one.getImaginary());
    }
}
