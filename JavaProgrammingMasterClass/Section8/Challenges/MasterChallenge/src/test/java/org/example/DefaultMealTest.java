package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultMealTest {

    private Meal defaultMeal;

    @BeforeEach
    public void setUp() {
        defaultMeal = new Meal();
    }

    @Test
    public void testMealComponents() {
        Object[] expected = new Object[]{
                new Hamburger("Medium"), new Drink("Small", "Coke"),
                new SideItem("Small", "Fries")
        };
        Object[] results = new Object[]{
                defaultMeal.getHamburger(), defaultMeal.getDrink(),
                defaultMeal.getSideItem()
        };
        Assertions.assertArrayEquals(expected, results);
    }
}
