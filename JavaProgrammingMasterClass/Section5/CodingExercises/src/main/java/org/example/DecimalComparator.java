package org.example;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int expectedStringLength = 5;
        boolean equalToThreeDecimalPlaces = false;
        if ((int) Math.signum(firstNumber) == (int) Math.signum(secondNumber)) {
            firstNumber = Math.abs(firstNumber);
            secondNumber = Math.abs(secondNumber);
            String firstNumberString = Double.toString(firstNumber);
            String secondNumberString = Double.toString(secondNumber);
            boolean notSameLength = firstNumberString.length() != secondNumberString.length();
            boolean bothLongerThanOrEqualToFiveCharacters =
                    firstNumberString.length() >= expectedStringLength &&
                    secondNumberString.length() >= expectedStringLength;
            if (notSameLength && bothLongerThanOrEqualToFiveCharacters) {
                firstNumberString = firstNumberString.substring(0, expectedStringLength);
                secondNumberString = secondNumberString.substring(0, expectedStringLength);
            }
            equalToThreeDecimalPlaces = firstNumberString.equals(secondNumberString);
        }
        return equalToThreeDecimalPlaces;
    }
}
/*
    algorithm
    1.  make sure the numbers are the same signs
    2.  Take the absolute value of the numbers to get rid of any "-" signs.
    3.  convert each number to a string
    4.  if strings have different lengths and both of length 5 or greater
    5.  find the longer string
    6.  substring it down to a length of 5 characters
    7.  compare the strings
*/
