package org.example;

public class NumberToWords {

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;
        int digitCount = 0;
        while (number > 0) {
            digitCount = digitCount + 1;
            number = number / 10;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int numberAbsoluteValue = Math.abs(number);
        int numberOfDigits = getDigitCount(numberAbsoluteValue);
        for (int index = 0; index < numberOfDigits; index++) {
            int digit = numberAbsoluteValue % 10;
            if (index == numberOfDigits - 1) {
                reversedNumber = reversedNumber + digit;
            } else {
                reversedNumber = (reversedNumber + digit) * 10;
            }
            numberAbsoluteValue = numberAbsoluteValue / 10;
        }
        if (number < 0) reversedNumber = -1 * reversedNumber;
        return reversedNumber;
    }

    public static String getNumberToWords(int number) {
        int digitCount = getDigitCount(number);
        if (digitCount < 0) return "Invalid Value";
        int reversedNumber = reverse(number);
        String numberInWords = "";
        for (int index = 0; index < digitCount; index++) {
            int digit = reversedNumber % 10;
            numberInWords = numberInWords + switch(digit) {
                case 0 -> "Zero ";
                case 1 -> "One ";
                case 2 -> "Two ";
                case 3 -> "Three ";
                case 4 -> "Four ";
                case 5 -> "Five ";
                case 6 -> "Six ";
                case 7 -> "Seven ";
                case 8 -> "Eight ";
                case 9 -> "Nine ";
                default -> "Invalid Value";
            };
            reversedNumber = reversedNumber / 10;
        }
        numberInWords = numberInWords.substring(0, numberInWords.length() - 1);
        return numberInWords;
    }

    public static void numberToWords(int number) {
        int digitCount = getDigitCount(number);
        if (digitCount < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber = reverse(number);
        String numberInWords = "";
        for (int index = 0; index < digitCount; index++) {
            int digit = reversedNumber % 10;
            numberInWords = numberInWords + switch(digit) {
                case 0 -> "Zero ";
                case 1 -> "One ";
                case 2 -> "Two ";
                case 3 -> "Three ";
                case 4 -> "Four ";
                case 5 -> "Five ";
                case 6 -> "Six ";
                case 7 -> "Seven ";
                case 8 -> "Eight ";
                case 9 -> "Nine ";
                default -> "Invalid Value";
            };
            reversedNumber = reversedNumber / 10;
        }
        numberInWords = numberInWords.substring(0, numberInWords.length() - 1);
        System.out.println(numberInWords);
    }
}
/*
    1234 => 4321
    (0 + 4) * 10 = 40
    (40 + 3) * 10 = 430
    (430 + 2) * 10 = 4320
    (4320 + 1) = 4321
*/