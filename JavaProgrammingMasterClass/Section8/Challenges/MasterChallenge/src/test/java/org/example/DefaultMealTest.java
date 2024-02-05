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
                new HamburgerWithToppings("Medium").getBurger(), new Drink("Small", "Coke"),
                new SideItem("Small", "Fries")
        };
        Object[] results = new Object[]{
                defaultMeal.getHamburgerWithToppings().getBurger(), defaultMeal.getDrink(),
                defaultMeal.getSideItem()
        };
        Assertions.assertArrayEquals(expected, results);
    }
}
