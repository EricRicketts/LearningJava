package org.example;

public class NumberToWords {

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        return Integer.toString(number).length();
    }
}
