package org.example;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverseOfNumber = 0;
        int copyOfNumber = number;
        int digit = 0;
        while (copyOfNumber > 0) {
            digit = copyOfNumber % 10;
            reverseOfNumber = (reverseOfNumber * 10) + digit;
            copyOfNumber = copyOfNumber / 10;
        }
        return (number == reverseOfNumber);
    }
}

/*
    1221
    digit = 1221 % 10 = 1
    reverseOfNumber = (0 * 10) + 1 = 1
    copyOfNumber = 1221 / 10 = 122

    122
    digit = 122 % 10 = 2
    reverseOfNumber = (1 * 10) + 2 = 12
    copyOfNumber = 122 / 10 = 12

    12
    digit = 12 % 10 = 2
    reverseOfNumber = (12 * 10) + 2 = 122
    copyOfNumber = 12 / 10 = 1

    1
    digit = 1 % 10 = 1
    reverseOfNumber = (122 * 10) + 1 = 1221
    copyOfNumber = 1 / 10 = 0
*/
