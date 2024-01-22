package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriesTest {

    Object[] expected, result;

    @Test
    public void testSmallFries() {
        expected = new Object[]{"French Fries", 6.99, "Small"};
        SmallFries smallFries = new SmallFries();
        result = new Object[]{smallFries.getType(), smallFries.getPrice(), smallFries.getSize()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMediumFries() {
        expected = new Object[]{"French Fries", 8.99, "Medium"};
        MediumFries mediumFries = new MediumFries();
        result = new Object[]{mediumFries.getType(), mediumFries.getPrice(), mediumFries.getSize()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testLargeFries() {
        expected = new Object[]{"French Fries", 9.99, "Large"};
        LargeFries largeFries = new LargeFries();
        result = new Object[]{largeFries.getType(), largeFries.getPrice(), largeFries.getSize()};
        Assertions.assertArrayEquals(expected, result);
    }
}
