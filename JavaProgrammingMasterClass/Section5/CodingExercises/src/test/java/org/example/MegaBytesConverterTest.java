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

    @Test
    public void testCasesFromCourse() {
        int[] values = new int[]{-1024, -1, -2050, 0, 1024, 2050, 3000};
        String[] answers = new String[]{
            "Invalid Value", "Invalid Value", "Invalid Value",
                "0 KB = 0 MB and 0 KB", "1024 KB = 1 MB and 0 KB",
                "2050 KB = 2 MB and 2 KB", "3000 KB = 2 MB and 952 KB"
        };
        for (int index = 0; index < values.length; index++) {
            int value = values[index];
            String answer = answers[index];
            Assertions.assertEquals(answer, MegaBytesConverter.printMegaBytesAndKiloBytes(value));
        }
    }
}
