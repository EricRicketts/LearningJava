package org.example;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumOfFactors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }

        return sumOfFactors == number;
    }
}
