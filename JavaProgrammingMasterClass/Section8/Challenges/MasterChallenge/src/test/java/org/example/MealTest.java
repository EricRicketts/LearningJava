package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal defaultMeal, mealWithOneTopping,
    mealWithTwoToppings, mealWithThreeToppings;
    private Hamburger expectedHamburger, resultantHamburger;
    private Drink expectedDrink, resultantDrink;
    private SideItem expectedSideItem, resultantSideItem;
    private Item expectedFirstTopping, expectedSecondTopping, expectedThirdTopping,
        resultantFirstTopping, resultantSecondTopping, resultantThirdTopping;
    private Object[] expected, result;
    double expectedPrice, resultantPrice;

    @BeforeEach
    public void setUp() {
        defaultMeal = new Meal();
        mealWithOneTopping = new Meal("Large", "Large", "Pepsi",
                "Large", "Onion Rings", "Cheese");
        mealWithTwoToppings = new Meal("Medium", "Medium", "Coke",
                "Medium", "Fries", "Cheese", "Ketchup");
        mealWithThreeToppings = new Meal("Small", "Small", "Coke",
                "Small", "Fries", "Cheese",
                "Ketchup", "Mustard");
    }

    @Test
    public void testDefaultMealItemTypesAndSizes() {
        expectedHamburger = new Hamburger("Medium");
        expectedFirstTopping = new Item("Cheese");
        expectedSecondTopping = new Item("Ketchup");
        expectedThirdTopping = new Item("Mustard");

        expectedDrink = new Drink("Small", "Coke");
        expectedSideItem = new SideItem("Small", "Fries");

        resultantHamburger = defaultMeal.getBurgerOnly();
        resultantDrink = defaultMeal.getDrink();
        resultantSideItem = defaultMeal.getSideItem();

        resultantFirstTopping = defaultMeal.getBurger().getFirstTopping();
        resultantSecondTopping = defaultMeal.getBurger().getSecondTopping();
        resultantThirdTopping = defaultMeal.getBurger().getThirdTopping();

        expected = new Object[]{
                expectedHamburger, expectedDrink, expectedSideItem,
                expectedFirstTopping, expectedSecondTopping, expectedThirdTopping
        };
        result = new Object[]{
                resultantHamburger, resultantDrink, resultantSideItem,
                resultantFirstTopping, resultantSecondTopping, resultantThirdTopping
        };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testDefaultMealPrice() {
        expectedPrice = (9.99 + 1.50 + 1.00 + 1.00) + 2.99 + 2.99;
        resultantPrice = defaultMeal.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }

    @Test
    public void testMealWithOneTopping() {
        expectedHamburger = new Hamburger("Large");
        expectedDrink = new Drink("Large", "Pepsi");
        expectedSideItem = new SideItem("Large", "Onion Rings");
        expectedFirstTopping = new Item("Cheese");

        resultantHamburger = mealWithOneTopping.getBurgerOnly();
        resultantDrink = mealWithOneTopping.getDrink();
        resultantSideItem = mealWithOneTopping.getSideItem();
        resultantFirstTopping = mealWithOneTopping.getBurger().getFirstTopping();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem, expectedFirstTopping};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem, resultantFirstTopping};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMealWithOneToppingPrice() {
        expectedPrice = (10.99 + 1.50) + 5.99 + 5.99;
        resultantPrice = mealWithOneTopping.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }
    @Test
    public void testMealWithTwoTopping() {
        expectedHamburger = new Hamburger("Medium");
        expectedDrink = new Drink("Medium", "Coke");
        expectedSideItem = new SideItem("Medium", "Fries");
        expectedFirstTopping = new Item("Cheese");
        expectedSecondTopping = new Item("Ketchup");

        resultantHamburger = mealWithTwoToppings.getBurgerOnly();
        resultantDrink = mealWithTwoToppings.getDrink();
        resultantSideItem = mealWithTwoToppings.getSideItem();
        resultantFirstTopping = mealWithTwoToppings.getBurger().getFirstTopping();
        resultantSecondTopping = mealWithTwoToppings.getBurger().getSecondTopping();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem,
                        expectedFirstTopping, expectedSecondTopping};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem,
                        resultantFirstTopping, resultantSecondTopping};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMealWithTwoToppingsPrice() {
        expectedPrice = (9.99 + 1.50 + 1.00) + 4.99 + 4.99;
        resultantPrice = mealWithTwoToppings.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }

    @Test
    public void testMealWithThreeTopping() {
        expectedHamburger = new Hamburger("Small");
        expectedDrink = new Drink("Small", "Coke");
        expectedSideItem = new SideItem("Small", "Fries");
        expectedFirstTopping = new Item("Cheese");
        expectedSecondTopping = new Item("Ketchup");
        expectedThirdTopping = new Item("Mustard");

        resultantHamburger = mealWithThreeToppings.getBurgerOnly();
        resultantDrink = mealWithThreeToppings.getDrink();
        resultantSideItem = mealWithThreeToppings.getSideItem();
        resultantFirstTopping = mealWithThreeToppings.getBurger().getFirstTopping();
        resultantSecondTopping = mealWithThreeToppings.getBurger().getSecondTopping();
        resultantThirdTopping = mealWithThreeToppings.getBurger().getThirdTopping();

        expected = new Object[]{expectedHamburger, expectedDrink, expectedSideItem,
                        expectedFirstTopping, expectedSecondTopping, expectedThirdTopping};
        result = new Object[]{resultantHamburger, resultantDrink, resultantSideItem,
                        resultantFirstTopping, resultantSecondTopping, resultantThirdTopping};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testMealWithThreeToppingsPrice() {
        expectedPrice = (7.99 + 1.50 + 1.00 + 1.00) + 2.99 + 2.99;
        resultantPrice = mealWithThreeToppings.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }
}
