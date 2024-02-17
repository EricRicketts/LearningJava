package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPartOneTest {

    private final int[] firstIntArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final int[] secondIntArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] thirdIntArray;

    @BeforeEach
    public void setUp() {
        thirdIntArray = new int[]{5, 4, 3, 2, 1, 0};
    }

    @Test
    public void testArraysEqual() {
        Assertions.assertArrayEquals(firstIntArray, secondIntArray);
    }

    @Test
    public void testAccessArray() {
        Assertions.assertEquals(4, thirdIntArray[1]);
    }

    @Test
    public void testSetArrayElementValue() {
        int[] expected = new int[]{3, 10};
        int[] result = new int[2];
        result[0] = thirdIntArray[2];
        thirdIntArray[2] = 10;
        result[1] = thirdIntArray[2];

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayLength() {
        int thirdIntArrayLength = thirdIntArray.length;
        Assertions.assertEquals(0, thirdIntArray[thirdIntArrayLength - 1]);
    }

    @Test
    public void testNumericArraysInitializeToZero() {
        int[] intArr = new int[5];
        double[] doubleArr = new double[5];
        for (int index = 0; index < intArr.length; index++) {
            Assertions.assertEquals(0, intArr[index]);
            Assertions.assertEquals(0.00, doubleArr[index]);
        }
    }

    @Test
    public void testInitBooleanAndObjectArrays() {
        boolean[] booleanArr = new boolean[5];
        String[] stringArr = new String[5];
        for (int index = 0; index < stringArr.length; index++) {
            Assertions.assertFalse(booleanArr[index]);
            Assertions.assertNull(stringArr[index]);
        }
    }

    @Test
    public void testInitializeAnArrayWithALoop() {
        int[] intAry = new int[5];
        int[] expected = {0, 1, 2, 3, 4};
        for (int index = 0; index < intAry.length; index++) intAry[index] = index;

        Assertions.assertArrayEquals(expected, intAry);
    }

    @Test
    public void testEnhancedForLoop() {
        List<String> stringIntsList = new ArrayList<>();
        for (int element : thirdIntArray) {
            stringIntsList.add(String.valueOf(element));
        }
        List<String> expected = new ArrayList<>(){{
            add("5"); add("4"); add("3"); add("2"); add("1"); add("0");
        }};
        Assertions.assertEquals(expected, stringIntsList);
        Assertions.assertEquals("[5, 4, 3, 2, 1, 0]", Arrays.toString(thirdIntArray));
    }

    @Test
    public void testInstanceOfForArray() {
        Object objectVariable = thirdIntArray;
        Assertions.assertTrue(objectVariable instanceof int[]);
    }

    @Test
    public void testObjectArray () {
        Object[] expected = new Object[]{"Foo", 1, 2};
        Object[] objectAry = new Object[3];
        objectAry[0] = "Foo";
        objectAry[1] = 1;
        objectAry[2] = thirdIntArray;
        int[] ary = (int[]) objectAry[2];
        int fourthElement = ary[3];


        Object[] result = new Object[]{objectAry[0], objectAry[1], fourthElement};
    }
}
