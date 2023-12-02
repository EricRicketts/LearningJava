package org.example;

public class SumDigitChallenge {

    public static int sumDigits(int number) {
        if (number < 0) return -1;
        int sumOfDigits = 0;
        int digit = 0;
        int powerOfTen = String.valueOf(number).length() - 1;

        // we have to subtract one from the powerOfTen because
        // we will waste the first iteration through the loop,
        // example if number = 125 (3 digits) then Math.power(10, 3) = 1000
        // 125 / 10000 = 0 then we subtract one from the power of ten so
        // next time 125 / Math.pow(10, 2) = 125 / 100 = 1;
        while (powerOfTen >= 0) {
            digit = (int) (number / Math.pow(10, powerOfTen));
            sumOfDigits += digit;
            number = (int) (number % Math.pow(10, powerOfTen));
            powerOfTen -= 1;
        }
        return sumOfDigits;
    }

    public static int sumDigitsInstructorSolution(int number) {
        if (number < 0) return -1;
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }
}
