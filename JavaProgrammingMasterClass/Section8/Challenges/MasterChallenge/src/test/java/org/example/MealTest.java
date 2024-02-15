package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        expectedPrice = 10.99 + (1.50 + 1.00 + 1.00) + 4.99 + 4.99;
        expectedList = "Large Hamburger $10.99\n" +
                "Cheese $1.50\n" + "Ketchup $1.00\n" + "Mustard $1.00\n" +
                "Medium Coke $4.99\n" + "Medium Fries $4.99\n" +
                String.format("Total $%.2f\n", expectedPrice);
        resultantList = meal.printItemizedList();
        Assertions.assertEquals(expectedList, resultantList);
    }

    @Test
    public void testChangeDrinkSize() {
        expected = new Object[]{
                new Item("Medium", "Drink", "Coke"),
                new Item("Large", "Drink", "Coke"),
        };
        List<Item> resultantDrinkList = new ArrayList<>();
        resultantDrinkList.add(meal.getDrink());
        meal.changeDrinkSizeTo("Large");
        resultantDrinkList.add(meal.getDrink());

        Assertions.assertArrayEquals(expected, resultantDrinkList.toArray());
    }
}
