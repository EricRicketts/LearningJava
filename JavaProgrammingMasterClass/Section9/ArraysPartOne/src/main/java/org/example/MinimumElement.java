package org.example;

import java.util.Scanner;

public class MinimumElement {

    public static int[] readIntegers() {
        Scanner input = new Scanner(System.in);
        String lineOfInput = input.nextLine();
        String[] integerValues = lineOfInput.split(",");
        int numberOfIntegers = integerValues.length;;

        int[] integers = new int[numberOfIntegers];
        for (int index = 0; index < numberOfIntegers; index++) {
            String trimmedInput = integerValues[index].trim();
            integers[index] = Integer.parseInt(trimmedInput);
        }

        return integers;
    }

    public static int[] readIntegers(String input) {
        String[] integerValues = input.split(",");
        int numberOfIntegers = integerValues.length;

        int[] integers = new int[numberOfIntegers];
        for (int index = 0; index < numberOfIntegers; index++) {
            String trimmedInput = integerValues[index].trim();
            integers[index] = Integer.parseInt(trimmedInput);
        }

        return integers;
    }

    public static int findMinimum(int... integers) {
        int minimum = Integer.MAX_VALUE;
        for (int integer : integers) {
            if (integer < minimum) minimum = integer;
        }

        return minimum;
    }

    private static int findMin(int[] integers) {
        int minimum = Integer.MAX_VALUE;
        for (int integer : integers) {
            if (integer < minimum) minimum = integer;
        }

        return minimum;
    }

    private static int readInteger() {
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    private static int[] readElements(int numberOfIntegers) {
        Scanner input = new Scanner(System.in);
        int[] integerArray = new int[numberOfIntegers];
        for (int index = 0; index < numberOfIntegers; index++) {
            integerArray[index] = input.nextInt();
        }

        return integerArray;
    }
}
