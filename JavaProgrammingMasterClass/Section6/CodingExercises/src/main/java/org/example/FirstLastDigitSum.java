package org.example;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int remainingNumber = number;
        int digit = 0, lastDigit = 0, firstDigit = 0;
        while (remainingNumber > 0) {
            digit = remainingNumber % 10;
            if (remainingNumber == number) lastDigit = digit;
            remainingNumber = remainingNumber / 10;
            if (remainingNumber == 0) firstDigit = digit;
        }
        return firstDigit + lastDigit;
    }
}
/*
    252

    digit = 252 % 10 = 2
    if (remainingNumber = number) lastDigit = digit
    remainingNumber = 252 / 10 = 25

    25
    digit = 25 % 10 = 5
    remainingNumber = 25 / 10 = 2

    2
    digit = 2 % 10 = 2
    remainingNumber = 2 / 10 = 0
    if (remainingNumber = 0) firstDigit = digit
*/
