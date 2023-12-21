package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testCarpetingFloorMaterialsCost() {
        List<Double> widths = new ArrayList<>(Arrays.asList(2.75, 5.40));
        List<Double> lengths = new ArrayList<>(Arrays.asList(4.00, 4.50));
        List<Double> perAreaCosts = new ArrayList<>(Arrays.asList(3.50, 1.50));
        List<Double> totalCosts = new ArrayList<>(Arrays.asList(38.50, 36.45));

        for (int index = 0; index < totalCosts.size(); index++) {
            double width = widths.get(index);
            double length = lengths.get(index);
            double perAreaCost = perAreaCosts.get(index);
            double totalCost = totalCosts.get(index);

            Carpet carpet = new Carpet(perAreaCost);
            Floor floor = new Floor(width, length);
            Assertions.assertEquals(
                    totalCost,
                    new Calculator(floor, carpet).getTotalCost()
            );
        }
    }

    @Test
    public void testCourseData() {
        List<Double> widths = new ArrayList<>(Arrays.asList(
                5.50, 4.75, 2.00,
                6.00, 5.00, 2.50
        ));
        List<Double> lengths = new ArrayList<>(Arrays.asList(
                3.50, 2.50, 3.00,
                8.00, 4.00, 6.00
        ));
        List<Double> perAreaCosts = new ArrayList<>(Arrays.asList(
                1.50, 1.25, 0.75,
                2.15, 2.00, 3.50
        ));
        List<Double> totalCosts = new ArrayList<>(Arrays.asList(
                28.875, 14.84375, 4.50,
                103.20, 40.00, 52.50
        ));

        for (int index = 0; index < totalCosts.size(); index++) {
            double width = widths.get(index);
            double length = lengths.get(index);
            double perAreaCost = perAreaCosts.get(index);
            double totalCost = totalCosts.get(index);

            Carpet carpet = new Carpet(perAreaCost);
            Floor floor = new Floor(width, length);
            Calculator calculator = new Calculator(floor, carpet);
            double result = Math.round(calculator.getTotalCost() * 100_000.00) / 100_000.00;
            Assertions.assertEquals(
                    totalCost,
                    result
            );
        }
    }
}
