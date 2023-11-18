package org.example;

public class PositiveNegativeZero {
    public static String checkNumber(int number) {
        String sign = "";
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }
        return sign;
    }
}