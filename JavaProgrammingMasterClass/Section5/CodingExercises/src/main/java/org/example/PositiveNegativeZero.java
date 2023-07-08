package org.example;

public class PositiveNegativeZero {
    public static String checkNumber(int number) {
        String sign = "zero";
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        }
        return sign;
    }
}