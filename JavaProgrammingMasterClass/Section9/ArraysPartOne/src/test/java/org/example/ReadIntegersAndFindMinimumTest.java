package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReadIntegersAndFindMinimumTest {

    private final int[] expected = {100, 89, 10, 5, 33};

    @Test
    public void testReadIntegers() {
        String input = "100, 89, 10, 5, 33";
        int[] results = MinimumElement.readIntegers(input);

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testFindMinimum() {
        Assertions.assertEquals(5, MinimumElement.findMinimum(expected));
    }

}
