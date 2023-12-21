package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarpetTest {

    @Test
    public void testCarpetCostLessThanZero() {
        Carpet carpet = new Carpet(-1.5);
        Assertions.assertEquals(0.0, carpet.cost());
    }

    @Test
    public void testCarpetCostMoreThanZero() {
        double cost = 4.35;
        Carpet carpet = new Carpet(cost);
        Assertions.assertEquals(cost, carpet.cost());
    }
}
