package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal meal;
    private Object[] expected, results;

    @BeforeEach
    public void setUp() {
        HamburgerWithToppings hamburgerWithToppings =
                new HamburgerWithToppings("Medium", "Cheese");
        Drink drink = new Drink("Medium", "Coke");
        SideItem sideItem = new SideItem("Medium", "Onion Rings");
        meal = new Meal(hamburgerWithToppings, drink, sideItem);
    }

    @Test
    public void testAddTwoToppings() {
        meal.getHamburgerWithToppings().setSecondTopping(new Item("Ketchup"));
        meal.getHamburgerWithToppings().setThirdTopping(new Item("Mustard"));
        expected = new Object[]{
                new Item("Ketchup"), 1.00, new Item("Mustard"), 1.00
        };
        results = new Object[]{
                meal.getHamburgerWithToppings().getSecondTopping(),
                meal.getHamburgerWithToppings().getSecondTopping().getPrice(),
                meal.getHamburgerWithToppings().getThirdTopping(),
                meal.getHamburgerWithToppings().getThirdTopping().getPrice()
        };

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testChangeDrinkSize() {
        meal.changeDrinkSizeTo("Large");
        expected = new Object[]{
                new Drink("Large", "Coke"), 5.99
        };
        results = new Object[]{
                meal.getDrink(), meal.getDrink().getPrice()
        };

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testGetTotalPriceForMeal() {
        double expectedPrice = (9.99 + 1.50) + 4.99 + 4.99;
        double resultantPrice = meal.getPrice();

        Assertions.assertEquals(expectedPrice, resultantPrice);
    }

    @Test
    public void testItemizedMealList() {
        String expectedMealList =
                """
                        Medium Hamburger $9.99
                        Cheese $1.50
                        Medium Coke $4.99
                        Medium Onion Rings $4.99
                        Total: $21.47
                        """;
        String resultantMealList = meal.printItemizedList();

        Assertions.assertEquals(expectedMealList, resultantMealList);
    }
}
