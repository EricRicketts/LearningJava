package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrinksTest {

    Object[] expected, result;

    @Test
    public void testSmallCoke() {
        expected = new Object[]{"Coke", "Small", 4.99};
        SmallCoke smallCoke = new SmallCoke();
        result = new Object[]{smallCoke.getType(), smallCoke.getSize(), smallCoke.getPrice()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMediumCoke() {
        expected = new Object[]{"Coke", "Medium", 6.99};
        MediumCoke mediumCoke = new MediumCoke();
        result = new Object[]{mediumCoke.getType(), mediumCoke.getSize(), mediumCoke.getPrice()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testLargeCoke() {
        expected = new Object[]{"Coke", "Large", 7.99};
        LargeCoke largeCoke = new LargeCoke();
        result = new Object[]{largeCoke.getType(), largeCoke.getSize(), largeCoke.getPrice()};
        Assertions.assertArrayEquals(expected, result);
    }
}
