package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarpetTest {

    @Test
    public void testCarpetCostLessThanZero() {
        Carpet carpet = new Carpet(-1.5);
        Assertions.assertEquals(0.0, carpet.getCost());
    }

    @Test
    public void testCarpetCostMoreThanZero() {
        double cost = 4.35;
        Carpet carpet = new Carpet(cost);
        Assertions.assertEquals(cost, carpet.getCost());
    }

    @Test
    public void testCourseData() {
        List<Double> costsPerArea = new ArrayList<>(Arrays.asList(
                0.0, -1.0, 1.0, 3.34,
                7.5, 5.0, 4.0, 1.5,
                4.5, 12.75, 6.3
        ));

        for (int index = 0; index < costsPerArea.size(); index++) {
            double costPerArea = costsPerArea.get(index);
            double expected = costPerArea < 0 ? 0.0 : costPerArea;

            Carpet carpet = new Carpet(costsPerArea.get(index));
            Assertions.assertEquals(expected, carpet.getCost());
        }
    }
}
