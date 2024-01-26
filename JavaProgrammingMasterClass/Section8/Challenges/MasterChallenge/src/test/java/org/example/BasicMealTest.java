package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicMealTest {

    private BasicMeal firstBasicMeal;
    private BasicMeal secondBasicMeal;
    private BasicMeal thirdBasicMeal;
    private BasicMeal fourthBasicMeal;
    private SideItem mediumCoke;

    @BeforeEach
    public void setUp() {
        mediumCoke = new SideItem("Coke", 6.99, "Medium");
        firstBasicMeal = new BasicMeal();
        secondBasicMeal = new BasicMeal(new BasicHamburger(), mediumCoke,
                "Cheese");
        thirdBasicMeal = new BasicMeal(new BasicHamburger(), mediumCoke,
                "Cheese","Ketchup");
        fourthBasicMeal = new BasicMeal(new BasicHamburger(), mediumCoke,
                "Cheese", "Ketchup", "Mustard");
    }

    @Test
    public void testAllHamburgersAndDrinks() {
        Item expectedHamburger = new BasicHamburger();
        Item expectedDrink = mediumCoke;
        Object[][] allResults = new Object[][]{
                {firstBasicMeal.getBurger(), firstBasicMeal.getDrink()},
                {secondBasicMeal.getBurger(), secondBasicMeal.getDrink()},
                {thirdBasicMeal.getBurger(), thirdBasicMeal.getDrink()},
                {fourthBasicMeal.getBurger(), fourthBasicMeal.getDrink()},
        };
        for (Object[] hamburgerAndDrink : allResults) {
            Hamburger resultHamburger = (Hamburger) hamburgerAndDrink[0];
            SideItem resultDrink = (SideItem) hamburgerAndDrink[1];
            Assertions.assertArrayEquals(
                    new Object[]{
                            expectedHamburger.getType(), expectedHamburger.getPrice(),
                            expectedDrink.getType(), expectedDrink.getPrice()
                    },
                    new Object[]{
                            resultHamburger.getType(), resultHamburger.getPrice(),
                            resultDrink.getType(), resultDrink.getPrice()
                    }
            );
        }
    }

    @Test
    public void testAllPrices() {
        double burgerAndDrink = (9.99 + 6.99);
        double[] expectedPrices = new double[]{
                burgerAndDrink, (burgerAndDrink + 1.50),
                (burgerAndDrink + 1.50 + 1.00), (burgerAndDrink + 1.50 + 1.00 + 1.00)
        };
        double[] resultantPrices = new double[]{
                firstBasicMeal.getPrice(), secondBasicMeal.getPrice(),
                thirdBasicMeal.getPrice(), fourthBasicMeal.getPrice()
        };
        Assertions.assertArrayEquals(expectedPrices, resultantPrices);
    }

    @Test
    public void testToppings() {
        String[][] expectedToppings = new String[][]{
                {"Cheese"}, {"Cheese", "Ketchup"}, {"Cheese", "Ketchup", "Mustard"}
        };
        String[][] resultantToppings = new String[][]{
                {secondBasicMeal.getFirstTopping().getType()},
                {thirdBasicMeal.getFirstTopping().getType(), thirdBasicMeal.getSecondTopping().getType()},
                {
                    fourthBasicMeal.getFirstTopping().getType(), fourthBasicMeal.getSecondTopping().getType(),
                    fourthBasicMeal.getThirdTopping().getType()
                }
        };
        Assertions.assertArrayEquals(expectedToppings, resultantToppings);
    }
}
