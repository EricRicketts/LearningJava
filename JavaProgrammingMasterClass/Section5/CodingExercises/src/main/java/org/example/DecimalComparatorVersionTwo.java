package org.example;

public class DecimalComparatorVersionTwo {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        String stringOne = String.valueOf(firstNumber);
        String stringTwo = String.valueOf(secondNumber);
        int stringOneLength = stringOne.length();
        int stringTwoLength = stringTwo.length();
        int decimalIndexStringOne = stringOne.indexOf(".");
        int decimalIndexStringTwo = stringTwo.indexOf(".");
        String decimalsStringOne = stringOne.substring(decimalIndexStringOne + 1, stringOneLength);
        String decimalsStringTwo = stringTwo.substring(decimalIndexStringTwo + 1, stringTwoLength);

        int shortestDecimalLength = Math.min(Math.min(decimalsStringOne.length(), decimalsStringTwo.length()), 3);
        stringOne = stringOne.substring(0, decimalIndexStringOne) +
                stringOne.substring(decimalIndexStringOne, decimalIndexStringOne + shortestDecimalLength + 1);
        stringTwo = stringTwo.substring(0, decimalIndexStringTwo) +
                stringTwo.substring(decimalIndexStringTwo, decimalIndexStringTwo + shortestDecimalLength + 1);

        return stringOne.equals(stringTwo);
    }
}
