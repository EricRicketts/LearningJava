package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal defaultMeal, mealWithOneTopping,
    mealWithTwoToppings, mealWithThreeToppings;
    private HamburgerWithToppings expectedHamburger, resultantHamburger;
    private Drink expectedDrink, resultantDrink;
    private SideItem expectedSideItem, resultantSideItem;
    private Object[] expected, result;

    @BeforeEach
    public void setUp() {
        defaultMeal = new Meal();
        mealWithOneTopping = new Meal("Large", "Medium", "Pepsi",
                "Large", "Onion Rings", "Cheese");
        mealWithTwoToppings = new Meal("Small", "Large", "Coke",
                "Medium", "Fries", "Cheese", "Ketchup");
        mealWithThreeToppings = new Meal("Small", "Small", "Coke",
                "Small", "Fries", "Cheese",
                "Ketchup", "Mustard");
    }

    @Test
    public void testDefaultMeal() {
        expectedHamburger = new HamburgerWithToppings("Medium", "Cheese",
                "Ketchup", "Mustard");
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
    public void testMealWithOneTopping() {
        expectedHamburger = new HamburgerWithToppings("Large", "Cheese");
        expectedDrink = new Drink("Medium", "Pepsi");
        expectedSideItem = new SideItem("Large", "Onion Rings");

        resultantHamburger = mealWithOneTopping.getBurger();
        resultantDrink = mealWithOneTopping.getDrink();
        resultantSideItem = mealWithOneTopping.getSideItem();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMealWithTwoTopping() {
        expectedHamburger = new HamburgerWithToppings("Small", "Cheese",
                "Ketchup");
        expectedDrink = new Drink("Large", "Coke");
        expectedSideItem = new SideItem("Medium", "Fries");

        resultantHamburger = mealWithTwoToppings.getBurger();
        resultantDrink = mealWithTwoToppings.getDrink();
        resultantSideItem = mealWithTwoToppings.getSideItem();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMealWithThreeTopping() {
        expectedHamburger = new HamburgerWithToppings("Small", "Cheese",
                "Ketchup", "Mustard");
        expectedDrink = new Drink("Small", "Coke");
        expectedSideItem = new SideItem("Small", "Fries");

        resultantHamburger = mealWithThreeToppings.getBurger();
        resultantDrink = mealWithThreeToppings.getDrink();
        resultantSideItem = mealWithThreeToppings.getSideItem();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem};
        Assertions.assertArrayEquals(expected, result);
    }
}
