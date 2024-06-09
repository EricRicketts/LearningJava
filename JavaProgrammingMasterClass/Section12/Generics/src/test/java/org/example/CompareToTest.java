package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareToTest {

    private String expected, results;
    private static Integer five = 5;
    private static Integer[] otherIntegers = {0, 5, 10};
    private static String banana = "banana";
    private static String[] fruits = {"apple", "banana", "pear", "BANANA"};

    @Test
    public void testComparingIntegers() {
        expected = """
                1 means 5 greater than 0
                0 means 5 equal to 5
                -1 means 5 less than 10
                """;
        results = "";
        for (Integer value : otherIntegers) {
            int compareResult = five.compareTo(value);
            switch (compareResult) {
                case (0) -> results += "0 means 5 equal to 5" + "\n";
                case (1) -> results += "1 means 5 greater than 0" + "\n";
                case (-1) -> results += "-1 means 5 less than 10" + "\n";
                default -> results += "unknown value";
            };
        }
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testCompareStrings() {
        String expected = """
                greater than 0 means banana greater than apple
                equal to 0 means banana equal to banana
                less than 0 means banana less than pear
                greater than 0 means banana greater than BANANA
                """;
        String results = "";
        for (String fruit : fruits) {
            int compareResult = banana.compareTo(fruit);
                if (compareResult < 0) {
                    results = results.concat("less than 0 means " + banana + " less than " + fruit + "\n");
                } else if (compareResult == 0) {
                    results = results.concat("equal to 0 means " + banana + " equal to " + fruit + "\n");
               } else results = results.concat("greater than 0 means " + banana + " greater than " + fruit + "\n");
            }
        Assertions.assertEquals(expected, results);
        }
    }