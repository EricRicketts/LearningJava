package org.example;

import java.util.List;

public class GreatestCommonDivisor {

    public static boolean isValid(int number) {
        return number >= 10;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (!isValid(first) || !isValid(second)) return -1;
        int greatestCommonFactor = 1, largerNumber = first, smallerNumber = second;

        if (second > first) {
            largerNumber = second;
            smallerNumber = first;
        }

        for (int number = 2; number <= smallerNumber; number++) {
            if ((largerNumber % number == 0) && (smallerNumber % number == 0)) {
                greatestCommonFactor = number;
            }
        }

        return greatestCommonFactor;
    }
}
