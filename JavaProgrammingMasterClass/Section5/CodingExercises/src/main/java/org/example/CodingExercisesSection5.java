package org.example;

public class CodingExercisesSection5 {
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