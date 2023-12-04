package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorPrinter {

    public static List<Integer> getFactors(int number) {
        if (number < 1) return new ArrayList<>(Arrays.asList(-1));
        List<Integer> factors = new ArrayList<>();

        for (int factor = 1; factor <= number / 2; factor++) {
            if (number % factor == 0) factors.add(factor);
        }
        factors.add(number);

        return factors;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        List<Integer> factors = new ArrayList<>();
        StringBuilder stringOfFactors = new StringBuilder();

        for (int factor = 1; factor <= number / 2; factor++) {
            if (number % factor == 0) {
                factors.add(factor);
                String factorString = factor + " ";
                stringOfFactors.append(factorString);
            }
        }
        factors.add(number);
        stringOfFactors.append(number);

        System.out.println(stringOfFactors);
    }
}
