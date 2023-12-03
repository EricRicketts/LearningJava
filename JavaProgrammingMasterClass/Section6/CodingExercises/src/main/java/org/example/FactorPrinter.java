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
}
