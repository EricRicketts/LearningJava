package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntEqualityPrinterTest {

    String expected = "";

    final String InvalidInput = "Invalid Value";
    @Test
    public void testInvalidFirstValue() {
        Assertions.assertEquals(
                InvalidInput,
                IntEqualityPrinter.returnEqual(-1, 3, 2)
        );
    }

    @Test
    public void testInvalidSecondValue() {
        Assertions.assertEquals(
                InvalidInput,
                IntEqualityPrinter.returnEqual(3, -1, 2)
        );
    }

    @Test
    public void testInvalidThirdValue() {
        Assertions.assertEquals(
                InvalidInput,
                IntEqualityPrinter.returnEqual(3, 2, -1)
        );
    }

    @Test
    public void testAllEqual() {
        expected = "All numbers are equal";
        Assertions.assertEquals(
                expected,
                IntEqualityPrinter.returnEqual(1, 1, 1)
        );
    }

    @Test
    public void testNotAllEqual() {
        expected = "Neither all are equal or different";
        Assertions.assertEquals(
                expected,
                IntEqualityPrinter.returnEqual(1, 1, 2)
        );
    }

    @Test
    public void testAllDifferent() {
        expected = "All numbers are different";
        Assertions.assertEquals(
                expected,
                IntEqualityPrinter.returnEqual(1, 2, 3)
        );
    }

    @Test
    public void testCourseData() {
        List<List<Integer>> inputs = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1),
                Arrays.asList(2, 1, 1), Arrays.asList(1, 2, 3), Arrays.asList(21, 21, 21),
                Arrays.asList(0, 1, 2), Arrays.asList(-1, 1, 1), Arrays.asList(1, -1, 1),
                Arrays.asList(1, 1, -1), Arrays.asList(-1, -1, 1), Arrays.asList(1, 1, -1),
                Arrays.asList(1, -1, -1), Arrays.asList(-1, -1, -1)
            )
        );

        List<String> results = new ArrayList<>(Arrays.asList(
                "All numbers are equal", "Neither all are equal or different", "Neither all are equal or different",
                "Neither all are equal or different", "All numbers are different", "All numbers are equal",
                "All numbers are different", "Invalid Value", "Invalid Value",
                "Invalid Value", "Invalid Value", "Invalid Value",
                "Invalid Value", "Invalid Value"
            )
        );

        for (int index = 0; index < inputs.size(); index++) {
            List<Integer> input = inputs.get(index);
            String result = results.get(index);
            Assertions.assertEquals(
                    result,
                    IntEqualityPrinter.returnEqual(input.get(0), input.get(1), input.get(2))
            );
        }
    }
}
