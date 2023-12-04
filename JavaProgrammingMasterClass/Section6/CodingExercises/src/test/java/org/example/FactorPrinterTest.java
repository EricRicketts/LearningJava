package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class FactorPrinterTest {

    List<Integer> factors;

    @Test
    public void testFactorsOfNegativeFour() {
        factors = new ArrayList<>(asList(-1));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(-4)
        );
    }

    @Test
    public void testFactorsOfZero() {
        factors = new ArrayList<>(asList(-1));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(0)
        );
    }

    @Test
    public void testFactorsOfSix() {
        factors = new ArrayList<>(asList(1, 2, 3, 6));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(6)
        );
    }

    @Test
    public void testFactorsOfOne() {
        factors = new ArrayList<>(asList(1));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(1)
        );
    }

    @Test
    public void testFactorsOfTwo() {
        factors = new ArrayList<>(asList(1, 2));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(2)
        );
    }

    @Test
    public void testFactorsOfEleven() {
        factors = new ArrayList<>(asList(1, 11));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(11)
        );
    }

    @Test
    public void testFactorsOfThirtyTwo() {
        factors = new ArrayList<>(asList(1, 2, 4, 8, 16, 32));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(32)
        );
    }

    @Test
    public void testFactorsOfTen() {
        factors = new ArrayList<>(asList(1, 2, 5, 10));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(10)
        );
    }

    @Test
    public void testCourseData() {
        List<List<Integer>> answers = new ArrayList<>();
        Integer[][] answerElements = {
                {1, 2, 5, 10},
                {-1},
                {1},
                {1, 2},
                {1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120},
                {1, 11, 121},
                {1, 3, 9, 27, 81},
                {1, 5, 25},
                {1, 31},
                {1, 2, 4, 8, 16, 32},
                {1, 2, 4, 17, 34, 68},
                {1, 3, 5, 9, 15, 45},
                {1, 2, 3, 4, 6, 12},
                {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024},
                {1, 2, 3, 5, 6, 10, 15, 17, 30, 34, 51, 85, 102, 170, 255, 510}
            };
        for (int index = 0; index < answerElements.length; index++) {
            List<Integer> listElement = Arrays.asList(answerElements[index]);
            answers.add(listElement);
        }
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, -1, 1, 2, 120,
                121, 81, 25, 31, 32,
                68, 45, 12, 1024, 510
        ));

        for (int index = 0; index < answers.size(); index++) {
            List<Integer> answer = answers.get(index);
            int number = numbers.get(index);
            Assertions.assertEquals(
                    answer,
                    FactorPrinter.getFactors(number)
            );
        }
    }
}
