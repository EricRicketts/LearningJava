package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeluxeMealTest {

    private DeluxeMeal smallestDeluxeMeal, largestDeluxeMeal;

    @BeforeEach
    public void setUp() {
        smallestDeluxeMeal = new DeluxeMeal("Cheese");
        largestDeluxeMeal = new DeluxeMeal(
                "Cheese", "Lettuce", "Tomatoes",
                "Ketchup", "Mayonnaise"
        );
    }

    @Test
    public void testMealPrices() {
        double expectedPrice = 15.99;
        DeluxeMeal[] meals = new DeluxeMeal[]{smallestDeluxeMeal, largestDeluxeMeal};
        for (DeluxeMeal meal : meals) {
            Assertions.assertEquals(expectedPrice, meal.getPrice());
        }
    }

    @Test
    public void testBurgersFromMeals() {
        Object[] expectedBurgerTypesAndPrices = new Object[]{"Deluxe", "Deluxe", 0.00, 0.00};
        Object[] resultantBurgerTypesAndPrices = new Object[]{
                smallestDeluxeMeal.getBurger().getType(), largestDeluxeMeal.getBurger().getType(),
                smallestDeluxeMeal.getBurger().getPrice(), largestDeluxeMeal.getBurger().getPrice()
        };
        Assertions.assertArrayEquals(expectedBurgerTypesAndPrices, resultantBurgerTypesAndPrices);
    }

    @Test
    public void testDrinksForMeals() {
        Object[] expectedDrinkTypesSizesAndPrices = new Object[]{
                "Coke", "Coke", 0.00, 0.00, "Large", "Large"
        };
        Object[] resultantDrinkTypesSizesAndPrices = new Object[]{
                smallestDeluxeMeal.getDrink().getType(), largestDeluxeMeal.getDrink().getType(),
                smallestDeluxeMeal.getDrink().getPrice(), largestDeluxeMeal.getDrink().getPrice(),
                smallestDeluxeMeal.getDrink().getSize(), largestDeluxeMeal.getDrink().getSize()
        };
        Assertions.assertArrayEquals(expectedDrinkTypesSizesAndPrices, resultantDrinkTypesSizesAndPrices);
    }

    @Test
    public void testToppings() {
        Object[][] expectedToppings = new Object[][]{
                {"Cheese"}, {"Cheese", "Lettuce", "Tomatoes", "Ketchup", "Mayonnaise"},
                {0.00}, {0.00, 0.00, 0.00, 0.00, 0.00}
        };
        Object[][] resultantToppings = new Object[][]{
                {smallestDeluxeMeal.getFirstTopping().getType()},
                {
                    largestDeluxeMeal.getFirstTopping().getType(), largestDeluxeMeal.getSecondTopping().getType(),
                    largestDeluxeMeal.getThirdTopping().getType(), largestDeluxeMeal.getFourthTopping().getType(),
                    largestDeluxeMeal.getFifthTopping().getType()
                },
                {smallestDeluxeMeal.getFirstTopping().getPrice()},
                {
                    largestDeluxeMeal.getFirstTopping().getPrice(), largestDeluxeMeal.getSecondTopping().getPrice(),
                    largestDeluxeMeal.getThirdTopping().getPrice(), largestDeluxeMeal.getFourthTopping().getPrice(),
                    largestDeluxeMeal.getFifthTopping().getPrice()
                },
        };
        for (int index = 0; index < expectedToppings.length; index++) {
            Object[] expected = expectedToppings[index];
            Object[] result = resultantToppings[index];
            Assertions.assertArrayEquals(expected, result);
        }
    }
}
