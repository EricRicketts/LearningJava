package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void testLoadNumbers() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        List<Integer> numbers = App.addNumbersToList(6);
        Assertions.assertEquals(
                expected,
                numbers
        );
    }
}
