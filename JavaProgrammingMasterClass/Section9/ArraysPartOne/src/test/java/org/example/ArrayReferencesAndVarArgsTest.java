package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReferencesAndVarArgsTest {

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }

    private static List<String> printText(String... args) {
        List<String> captureInput = new ArrayList<>();
        Collections.addAll(captureInput, args);

        return captureInput;
    }
    int[] myIntegerArray, anotherArray;
    String[] inputStrings;

    @BeforeEach
    public void setUp() {
        myIntegerArray = new int[5];
        anotherArray = myIntegerArray;
        inputStrings = "Hello World Again".split("\\s+");
    }

    @Test
    public void testArrayReferencesIdentical() {
        Assertions.assertEquals(myIntegerArray, anotherArray);
    }

    @Test
    public void testArrayReferencesDifferent() {
        int[] integerArray = new int[5];
        Assertions.assertNotEquals(myIntegerArray, integerArray);
    }

    @Test
    public void testChangeOneArrayChangeTheOther() {
        myIntegerArray[0] = 5;
        Assertions.assertArrayEquals(new int[]{5, 0, 0, 0, 0}, anotherArray);
    }

    @Test
    public void testMethodArgumentsPassedByReference() {
        int[] expected = new int[]{0, 2, 0, 0, 0};
        modifyArray(myIntegerArray);
        Assertions.assertArrayEquals(expected, myIntegerArray);
        Assertions.assertArrayEquals(expected, anotherArray);
    }

    @Test
    public void testVarArgsArrayInput() {
        List<String> expected = new ArrayList<>(){{add("Hello"); add("World"); add("Again");}};
        List<String> results = printText(inputStrings);

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testVarArgsMultipleStringInput() {
        List<String> expected = new ArrayList<>(){{add("Hello"); add("World"); add("Again");}};
        List<String> results = printText("Hello", "World", "Again");

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void TestVarArgsOneStringInput() {
        List<String> expected = new ArrayList<>(){{add("Hello");}};
        List<String> results = printText("Hello");

        Assertions.assertEquals(expected, results);
    }
}
