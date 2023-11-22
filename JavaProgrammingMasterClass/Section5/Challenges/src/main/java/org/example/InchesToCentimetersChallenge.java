package org.example;

public class InchesToCentimetersChallenge {

    static final double inchToCentimeter = 2.54;

    static final int feetToInches = 12;

    public static double toCentimeters(int inches) {
        return inches * inchToCentimeter;
    }

    public static double toCentimeters(int feet, int inches) {
        int inchesFromFeet = feet * feetToInches;
        int totalInches = inchesFromFeet + inches;

        return toCentimeters(totalInches);
    }
}
