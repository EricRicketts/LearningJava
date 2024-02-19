package org.example;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arySize) {
        System.out.println("Please enter your integer input:");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
       int[] ary = new int[arySize];
       for(int index = 0; index < arySize; index++) {
           ary[index] = scanner.nextInt();
       }
       return ary;
    }

    public static void printArray(int[] ary) {
        for (int index = 0; index < ary.length; index++) {
            System.out.println("Element " + index + " contents " + ary[index]);
        }
    }

    public static int[] sortIntegers(int[] ary) {
        int[] aryCopy = Arrays.copyOf(ary, ary.length);
        int aryLength = aryCopy.length;
        boolean swapped = false;
        for (int i = 0; i < aryLength - 1; i++) {
            for (int j = 0; j < aryLength - i - 1; j++) {
                if (aryCopy[j] < aryCopy[j + 1]) {
                    int temp = aryCopy[j];
                    aryCopy[j] = aryCopy[j + 1];
                    aryCopy[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return aryCopy;
    }
}
