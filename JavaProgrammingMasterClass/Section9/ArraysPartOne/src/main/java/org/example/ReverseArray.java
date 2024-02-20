package org.example;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {
        int arrayLength = array.length;
        int lastIndex = array.length - 1;
        int halfLength = (arrayLength / 2);
        for (int index = 0; index < halfLength; index++) {
            int temp = array[index];
            array[index] = array[lastIndex - index];
            array[lastIndex - index] = temp;
        }
    }
}
