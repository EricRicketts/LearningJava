package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    private int[] array, expected;

    @Test
    public void testReverseOneElementArray() {
        array = new int[]{1};
        expected = new int[]{1};
        ReverseArray.reverse(array);

        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseEvenArray() {
        array = new int[]{1, 2, 3, 4};
        expected = new int[]{4, 3, 2, 1};
        ReverseArray.reverse(array);

        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseOddArray() {
        array = new int[]{1, 2, 3, 4, 5};
        expected = new int[]{5, 4, 3, 2, 1};
        ReverseArray.reverse(array);

        Assertions.assertArrayEquals(expected, array);
    }
}
