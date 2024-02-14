package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal defaultMeal, meal;
    Object[] expected, results;
    double expectedPrice, resultantPrice;
    String expectedList, resultantList;

    @BeforeEach
    public void setUp() {
        defaultMeal = new Meal();
        meal = new Meal(
                new Hamburger("Large"),
                new Item("Medium", "Drink", "Coke"),
                new Item("Medium", "Side", "Fries"));
        meal.setFirstTopping(new Item("", "Topping", "Cheese"));
        meal.setSecondTopping(new Item("", "Topping", "Ketchup"));
        meal.setThirdTopping(new Item("", "Topping", "Mustard"));
    }

    @Test
    public void testDefaultMealItems() {
        expected = new Object[]{
                new Hamburger("Medium"),
                new Item("Small", "Drink", "Coke"),
                new Item("Small", "Side", "Fries")
        };
        results = new Object[]{
                defaultMeal.getHamburger(),
                defaultMeal.getDrink(),
                defaultMeal.getSide()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testDefaultMealPrice() {
        expectedPrice = 9.99 + 2.99 + 2.99;
        resultantPrice = defaultMeal.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }

    @Test
    public void testDefaultMealPrintItemizedList() {
        expectedList = """
                Medium Hamburger $9.99
                Small Coke $2.99
                Small Fries $2.99
                Total $15.97
                """;
        resultantList = defaultMeal.printItemizedList();
        Assertions.assertEquals(expectedList, resultantList);
    }

    @Test
    public void testMealItems() {
        expected = new Object[]{
            new Hamburger("Large"),
            new Item("Medium", "Drink", "Coke"),
            new Item("Medium", "Side", "Fries"),
            new Item("", "Topping", "Cheese"),
            new Item("", "Topping", "Ketchup"),
            new Item("", "Topping", "Mustard")
        };
        results = new Object[]{
            meal.getHamburger(),
            meal.getDrink(),
            meal.getSide(),
            meal.getFirstTopping(),
            meal.getSecondTopping(),
            meal.getThirdTopping()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testTotalPrice() {
        expectedPrice = 10.99 + (1.50 + 1.00 + 1.00) + 4.99 + 4.99;
        resultantPrice = meal.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }

    @Test
    public void testPrintItemizedList() {
    }
}
