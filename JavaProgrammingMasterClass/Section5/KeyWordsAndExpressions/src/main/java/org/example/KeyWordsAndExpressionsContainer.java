package org.example;

public class KeyWordsAndExpressionsContainer {
    // note there is no constructor needed for this class
    // if a class has no constructor, Java creates a no
    // argument constructor for a given class
    public double convertMiToKm(double miles) {
        double conversionFactor = 1.609344;
        return miles * conversionFactor;
    }
}
