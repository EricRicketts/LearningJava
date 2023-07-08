package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MegaBytesConverterTest {

    private final List<Integer> kbValues = Arrays.asList(2500, -1024, 5000);
    private final List<String> expectedValues = Arrays.asList(
            "2500 KB = 2 MB and 452 KB",
            "Invalid Value",
            "5000 KB = 4 MB and 904 KB"
    );

    @Test
    public void testMegaBytesToKiloBytesConverter() {
        for (int index = 0; index < kbValues.size(); index++) {
            int kbValue = kbValues.get(index);
            String result = MegaBytesConverter.printMegaBytesAndKiloBytes(kbValue);
            String expected = expectedValues.get(index);
            Assertions.assertEquals(expected, result);
        }
    }
}
