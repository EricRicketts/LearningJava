package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorPrinterTest {

    @Test
    public void testFactorsOfSix() {
        List<Integer> factors = new ArrayList<>(Arrays.asList(1, 2, 3, 6));
        Assertions.assertEquals(
                factors,
                FactorPrinter.getFactors(6)
        );
    }
}
