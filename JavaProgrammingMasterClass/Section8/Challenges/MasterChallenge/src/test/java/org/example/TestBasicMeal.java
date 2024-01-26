package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBasicMeal {

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
                new Item("Cheese", 1.50));
        thirdBasicMeal = new BasicMeal(new BasicHamburger(), mediumCoke,
                new Item("Cheese", 1.50), new Item("Ketchup", 1.00));
        fourthBasicMeal = new BasicMeal(new BasicHamburger(), mediumCoke,
                new Item("Cheese", 1.50), new Item("Ketchup", 1.00),
                new Item("Mustard", 1.00));
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
}
