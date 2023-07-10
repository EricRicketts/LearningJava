package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecimalComparatorVersionTwo {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        List<String> numberOfDecimalsForEachNumber = new ArrayList<>();
        String firstNumberString = String.valueOf(firstNumber), secondNumberString = String.valueOf(secondNumber);
        int decimalIndexFirstNumberString = firstNumberString.indexOf(".");
        int decimalIndexSecondNumberString= secondNumberString.indexOf(".");

        // find the number of decimals for the string representation of each number
        String decimalsFirstNumberString =
                firstNumberString.substring(decimalIndexFirstNumberString + 1);
        String decimalsSecondNumberString =
                secondNumberString.substring(decimalIndexSecondNumberString + 1);

        // find the least of amount of decimals compare the first number, second number, and 3
        int shortestDecimalLength = Math.min(
                Math.min(decimalsFirstNumberString.length(), decimalsSecondNumberString.length()),
                3);

        // construct the final string representation for each number concatenate the beginning of each
        // number to the decimal point and then from the decimal point to the end of the number
        firstNumberString = firstNumberString.substring(0, decimalIndexFirstNumberString) +
                firstNumberString.substring(decimalIndexFirstNumberString,
                        decimalIndexFirstNumberString + shortestDecimalLength + 1);

        secondNumberString = secondNumberString.substring(0, decimalIndexSecondNumberString) +
                secondNumberString.substring(decimalIndexSecondNumberString,
                        decimalIndexSecondNumberString + shortestDecimalLength + 1);

        return firstNumberString.equals(secondNumberString);
    }
}
