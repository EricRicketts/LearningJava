package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal defaultMeal;
    Object[] expected, results;

    @BeforeEach
    public void setUp() {
        defaultMeal = new Meal();
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
        double expectedPrice = 9.99 + 2.99 + 2.99;
        double resultantPrice = defaultMeal.getPrice();
        Assertions.assertEquals(expectedPrice, resultantPrice);
    }

    @Test
    public void testDefaultMealPrintItemizedList() {
        String expectedList = """
                Medium Hamburger $9.99
                Small Coke $2.99
                Small Fries $2.99
                Total $15.97
                """;
        String resultantList = defaultMeal.printItemizedList();
        Assertions.assertEquals(expectedList, resultantList);
    }
}
