package org.example;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sumOfEvenDigits = 0, remainingNumber = number, digit = 0;
        while (remainingNumber > 0) {
            digit = remainingNumber % 10;
            if (digit % 2 == 0) sumOfEvenDigits += digit;
            remainingNumber = remainingNumber / 10;
        }
        return sumOfEvenDigits;
    }
}
