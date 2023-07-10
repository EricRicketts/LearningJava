package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecimalComparator {
    private static List<String> convertNumbersToStrings(double firstNumber, double secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        String firstNumberString = Double.toString(firstNumber);
        String secondNumberString = Double.toString(secondNumber);
        return Arrays.asList(firstNumberString, secondNumberString);
    }

    private static boolean notTheSameLengthAndEqualToOrLongerThanFiveCharacters(
            String firstNumberString, String secondNumberString, int expectedStringLength
    ) {
        boolean notSameLength = firstNumberString.length() != secondNumberString.length();
        boolean bothEqualToOrLongerThanFiveCharacters =
                firstNumberString.length() >= expectedStringLength &&
                        secondNumberString.length() >= expectedStringLength;

        return notSameLength && bothEqualToOrLongerThanFiveCharacters;
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int expectedStringLength = 5;
        boolean equalToThreeDecimalPlaces = false;

        if ((int) Math.signum(firstNumber) == (int) Math.signum(secondNumber)) {
            List<String> numbersAsStrings = convertNumbersToStrings(firstNumber, secondNumber);
            String firstNumberString = numbersAsStrings.get(0), secondNumberString = numbersAsStrings.get(1);

            if (notTheSameLengthAndEqualToOrLongerThanFiveCharacters(
                    firstNumberString, secondNumberString, expectedStringLength))
            {
                firstNumberString = firstNumberString.substring(0, expectedStringLength);
                secondNumberString = secondNumberString.substring(0, expectedStringLength);
            }
            equalToThreeDecimalPlaces = firstNumberString.equals(secondNumberString);
        }
        return equalToThreeDecimalPlaces;
    }
}