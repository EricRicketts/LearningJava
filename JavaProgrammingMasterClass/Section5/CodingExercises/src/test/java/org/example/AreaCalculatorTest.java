package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaCalculatorTest {

    private double expected = 0.0;

    @Test
    public void testInvalidEntryForCircleArea() {
        expected = -1.0;
        Assertions.assertEquals(
                expected,
                AreaCalculator.area(-1)
        );
    }

    @Test
    public void testInvalidEntryForFirstArgumentRectangleArea() {
        expected = -1.0;
        Assertions.assertEquals(
                expected,
                AreaCalculator.area(-1.0, 4.0)
        );
    }

    @Test
    public void testInvalidEntryForSecondArgumentRectangleArea() {
        expected = -1.0;
        Assertions.assertEquals(
                expected,
                AreaCalculator.area(5.0, -1.0)
        );
    }

    @Test
    public void testInvalidEntryForBothArgumentsRectangleArea() {
        expected = -1.0;
        Assertions.assertEquals(
                expected,
                AreaCalculator.area(-2.0, -1.0)
        );
    }

    @Test
    public void testExampleDataForCircleArea() {
        expected = 78.53981633974483;
        Assertions.assertEquals(
                expected,
                AreaCalculator.area(5.0)
        );
    }

    @Test
    public void testExampleDataForRectangleArea() {
        expected = 20.0;
        Assertions.assertEquals(
                expected,
                AreaCalculator.area(5.0, 4.0)
        );
    }

    @Test
    public void testCourseTestCasesForCircleArea() {
        List<Double> radii = new ArrayList<>(Arrays.asList(
                -2.0, -8.5, -20.75, -100.25, -443.6223,
                0.0, 1.0, 2.0,
                8.5, 20.75, 100.25,
                63.354, 11.325, 18.671
            )
        );
        List<Double> results = new ArrayList<>(Arrays.asList(
                -1.0, -1.0, -1.0, -1.0, -1.0,
                0.0, 3.141592653589793, 12.566370614359172,
                226.98006922186255, 1352.6519869112553, 31573.20251811827,
                12609.502532643584, 402.92692928156737, 1095.1788057211527
            )
        );
        for (int index = 0; index < radii.size(); index++) {
            double radius = radii.get(index);
            double result = results.get(index);
            Assertions.assertEquals(
                    result,
                    AreaCalculator.area(radius)
            );
        }
    }

    @Test
    public void testCourseTestCasesForRectangleArea() {
        List<Double> firstSides = new ArrayList<>(Arrays.asList(
                0.0, 10.0, 2.0, 1.75, -1.0, 1.0, -1.0, 4.265
            )
        );
        List<Double> secondSides = new ArrayList<>(Arrays.asList(
                0.0, 5.0, 6.25, 5.5, 5.0, -5.0, -5.0, 8.387
            )
        );
        List<Double> results = new ArrayList<>(Arrays.asList(
                0.0, 50.0, 12.5, 9.625, -1.0, -1.0, -1.0, 35.770555
            )
        );
        for (int index = 0; index < firstSides.size(); index++) {
            double firstSide = firstSides.get(index);
            double secondSide = secondSides.get(index);
            double result = results.get(index);
            Assertions.assertEquals(
                    result,
                    AreaCalculator.area(firstSide, secondSide)
            );
        }
    }

}
