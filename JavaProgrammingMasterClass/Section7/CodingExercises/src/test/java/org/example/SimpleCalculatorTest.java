package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCalculatorTest {

    private static SimpleCalculator calculator;

    @BeforeAll
    public static void oneTimeSetup() {
        calculator = new SimpleCalculator();
    }

    @BeforeEach
    public void setUp() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
    }

    @Test
    public void testAddition() {
        Assertions.assertEquals(
                9.0,
                calculator.getAdditionResult()
        );
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(
                1.0,
                calculator.getSubtractionResult()
        );
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(
                20.0,
                calculator.getMultiplicationResult()
        );
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(
                1.25,
                calculator.getDivisionResult()
        );
    }

    @Test
    public void testZeroDivision() {
        calculator.setSecondNumber(0);
        Assertions.assertEquals(
                0,
                calculator.getDivisionResult()
        );
    }

    @Test
    public void testCourseDataForDivision() {
        List<Double> firstNumbers = new ArrayList<>(Arrays.asList(
                0.0, 2.34, -1.25,
                1.75, 1.125, 4.5
        ));
        List<Double> secondNumbers = new ArrayList<>(Arrays.asList(
                1.25, 0.0, -1.25,
                1.75, -1.0, 2.0
        ));
        List<Double> results = new ArrayList<>(Arrays.asList(
                0.0, 0.0, 1.0,
                1.0, -1.125, 2.25
        ));

        for (int index = 0; index < results.size(); index++) {
            calculator.setFirstNumber(firstNumbers.get(index));
            calculator.setSecondNumber(secondNumbers.get(index));
            Double result = results.get(index);

            Assertions.assertEquals(
                    result,
                    calculator.getDivisionResult()
            );
        }
    }

    @Test
    public void testCourseDataForMultiplication() {
        List<Double> firstNumbers = new ArrayList<>(Arrays.asList(
                0.0, 2.34, -1.25,
                1.75, 1.125, 0.0
        ));
        List<Double> secondNumbers = new ArrayList<>(Arrays.asList(
                1.25, 0.0, -1.25,
                1.75, -1.0, -4.11
        ));
        List<Double> results = new ArrayList<>(Arrays.asList(
                0.0, 0.0, 1.5625,
                3.0625, -1.125, -0.0
        ));

        for (int index = 0; index < results.size(); index++) {
            calculator.setFirstNumber(firstNumbers.get(index));
            calculator.setSecondNumber(secondNumbers.get(index));
            double result = results.get(index);

            Assertions.assertEquals(
                    result,
                    calculator.getMultiplicationResult()
            );
        }
    }

    @Test
    public void testCourseDataForSubtraction() {
        List<Double> firstNumbers = new ArrayList<>(Arrays.asList(
                0.0, 2.34, -1.25,
                5.75, 1.125, -1.0
        ));
        List<Double> secondNumbers = new ArrayList<>(Arrays.asList(
                1.25, 0.0, -1.25,
                3.25, 4.125, 1.0
        ));
        List<Double> results = new ArrayList<>(Arrays.asList(
                -1.25, 2.34, 0.0,
                2.5, -3.0, -2.0
        ));

        for (int index = 0; index < results.size(); index++) {
            calculator.setFirstNumber(firstNumbers.get(index));
            calculator.setSecondNumber(secondNumbers.get(index));
            Double result = results.get(index);

            Assertions.assertEquals(
                    result,
                    calculator.getSubtractionResult()
            );
        }
    }

    @Test
    public void testCourseDataForAddition() {
        List<Double> firstNumbers = new ArrayList<>(Arrays.asList(
                0.0, 2.34, 1.25,
                5.75, 1.125, -1.0
        ));
        List<Double> secondNumbers = new ArrayList<>(Arrays.asList(
                1.25, 0.0, 1.25,
                3.25, 4.125, 1.0
        ));
        List<Double> results = new ArrayList<>(Arrays.asList(
                1.25, 2.34, 2.5,
                9.0, 5.25, 0.0
        ));

        for (int index = 0; index < results.size(); index++) {
            calculator.setFirstNumber(firstNumbers.get(index));
            calculator.setSecondNumber(secondNumbers.get(index));
            Double result = results.get(index);

            Assertions.assertEquals(
                    result,
                    calculator.getAdditionResult()
            );
        }
    }
}
