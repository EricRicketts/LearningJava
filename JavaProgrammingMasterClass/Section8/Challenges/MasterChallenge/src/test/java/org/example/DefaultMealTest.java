package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultMealTest {

    private DefaultMeal defaultMeal;

    @BeforeEach
    public void setUp() {
        defaultMeal = new DefaultMeal();
    }

    @Test
    public void testBurgerAndDrink() {
        Object[][] expectedBurgerOrDrinkArr = new Object[][]{
                {"Basic Hamburger", 9.99, "No Size"}, {"Coke", 6.99, "Medium"}
        };
        Object[][] resultantBurgerOrDrinkArr = new Object[][]{
                {defaultMeal.getBurger().getType(), defaultMeal.getBurger().getPrice(), "No Size"},
                {defaultMeal.getDrink().getType(), defaultMeal.getDrink().getPrice(), defaultMeal.getDrink().getSize()}
        };
        for (int index = 0; index < expectedBurgerOrDrinkArr.length; index++) {
            Object[] expectedBurgerOrDrink = expectedBurgerOrDrinkArr[index];
            Object[] resultantBurgerOrDrink = resultantBurgerOrDrinkArr[index];
            Assertions.assertArrayEquals(expectedBurgerOrDrink, resultantBurgerOrDrink);
        }
    }

    @Test
    public void testToppings() {
        Object[][] expectedToppingsArr = new Object[][]{
                {"Cheese", 1.50}, {"Ketchup", 1.00}, {"Mustard", 1.00}
        };
        Object[][] resultantToppingsArr = new Object[][]{
                {defaultMeal.getFirstTopping().getType(), defaultMeal.getFirstTopping().getPrice()},
                {defaultMeal.getSecondTopping().getType(), defaultMeal.getSecondTopping().getPrice()},
                {defaultMeal.getThirdTopping().getType(), defaultMeal.getThirdTopping().getPrice()}
        };
        Assertions.assertArrayEquals(expectedToppingsArr, resultantToppingsArr);
    }
}
