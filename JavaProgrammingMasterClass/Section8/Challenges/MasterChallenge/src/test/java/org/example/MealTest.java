package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal defaultMeal, meal;
    Hamburger expectedHamburger, resultantHamburger;
    Drink expectedDrink, resultantDrink;
    SideItem expectedSideItem, resultantSideItem;
    private Object[] expected, result;

    @BeforeEach
    public void setUp() {
        defaultMeal = new Meal();
        meal = new Meal("Large", "Medium", "Pepsi",
                "Large", "Onion Rings");
    }

    @Test
    public void testDefaultMeal() {
        expectedHamburger = new Hamburger("Medium");
        expectedDrink = new Drink("Small", "Coke");
        expectedSideItem = new SideItem("Small", "Fries");

        resultantHamburger = defaultMeal.getBurger();
        resultantDrink = defaultMeal.getDrink();
        resultantSideItem = defaultMeal.getSideItem();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMeal() {
        expectedHamburger = new Hamburger("Large");
        expectedDrink = new Drink("Medium", "Pepsi");
        expectedSideItem = new SideItem("Large", "Onion Rings");

        resultantHamburger = meal.getBurger();
        resultantDrink = meal.getDrink();
        resultantSideItem = meal.getSideItem();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem};
        Assertions.assertArrayEquals(expected, result);
    }
}
