package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        List<String> finalNumericStrings = new ArrayList<>(2);
        List<String> originalNumericStrings = new ArrayList<>(Arrays.asList(
                String.valueOf(firstNumber), String.valueOf(secondNumber)));
        List<Integer> decimalIndices = new ArrayList<>(Arrays.asList(
                originalNumericStrings.get(0).indexOf("."),
                originalNumericStrings.get(1).indexOf(".")
        ));

        List<String> decimalValues = new ArrayList<>(Arrays.asList(
            originalNumericStrings.get(0).substring(decimalIndices.get(0) + 1),
            originalNumericStrings.get(1).substring(decimalIndices.get(1) + 1)
        ));

        int shortestDecimalLength = Math.min(
                Math.min(decimalValues.get(0).length(), decimalValues.get(1).length()), 3);

        // construct the final string representation for each number concatenate the beginning of each
        // number to the decimal point and then from the decimal point to the end of the number
        for (int index = 0; index < originalNumericStrings.size(); index++) {
            String finalNumericString = originalNumericStrings.get(index).substring(0, decimalIndices.get(index)) +
                    originalNumericStrings.get(index).substring(decimalIndices.get(index),
                            decimalIndices.get(index) + shortestDecimalLength + 1);
            finalNumericStrings.add(finalNumericString);
        }
        return finalNumericStrings.get(0).equals(finalNumericStrings.get(1));
    }
}
