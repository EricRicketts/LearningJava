package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class BasicMealTest {

    private BasicMeal firstBasicMeal, secondBasicMeal, thirdBasicMeal, fourthBasicMeal;
    private Hamburger expectedBurger, resultantBurger;
    private SideItem expectedDrink, resultantDrink;
    private Item expectedFirstTopping, expectedSecondTopping, expectedThirdTopping,
        resultantFirstTopping, resultantSecondTopping, resultantThirdTopping;
    private Object[] expected, result;

    @BeforeEach
    public void setUp() {
        firstBasicMeal = new BasicMeal();
        secondBasicMeal = new BasicMeal(
                "Small", "Small",
                "Coke", "Cheese"
        );
        thirdBasicMeal = new BasicMeal(
                "Medium", "Medium", "Coke",
                "Cheese", "Ketchup"
        );
        fourthBasicMeal = new BasicMeal(
                "Large", "Large", "Coke",
                "Cheese", "Ketchup", "Mustard"
        );
    }

    @Test
    public void testFirstBasicMeal() {
        expectedBurger = new Hamburger("Medium", 9.99);
        expectedDrink = new SideItem("Coke", 6.99, "Medium");

        resultantBurger = firstBasicMeal.getBurger();
        resultantDrink = firstBasicMeal.getDrink();

        expected = new Object[]{expectedBurger, expectedDrink};
        result = new Object[]{resultantBurger, resultantDrink};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecondBasicMeal() {
        expectedBurger = new Hamburger("Small", 7.99);
        expectedDrink = new SideItem("Coke", 4.99, "Small");
        expectedFirstTopping = new Item("Cheese", 1.50);

        resultantBurger = secondBasicMeal.getBurger();
        resultantDrink = secondBasicMeal.getDrink();
        resultantFirstTopping = secondBasicMeal.getFirstTopping();

        expected = new Object[]{expectedBurger, expectedDrink, expectedFirstTopping};
        result = new Object[]{resultantBurger, resultantDrink, resultantFirstTopping};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testThirdBasicMeal() {
        expectedBurger = new Hamburger("Medium", 9.99);
        expectedDrink = new SideItem("Coke", 6.99, "Medium");
        expectedFirstTopping = new Item("Cheese", 1.50);
        expectedSecondTopping = new Item("Ketchup", 1.00);

        resultantBurger = thirdBasicMeal.getBurger();
        resultantDrink = thirdBasicMeal.getDrink();
        resultantFirstTopping = thirdBasicMeal.getFirstTopping();
        resultantSecondTopping = thirdBasicMeal.getSecondTopping();

        expected = new Object[]{expectedBurger, expectedDrink,
                expectedFirstTopping, expectedSecondTopping};
        result = new Object[]{resultantBurger, resultantDrink,
                resultantFirstTopping, resultantSecondTopping};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testFourthBasicMeal() {
        expectedBurger = new Hamburger("Large", 10.99);
        expectedDrink = new SideItem("Coke", 7.99, "Large");
        expectedFirstTopping = new Item("Cheese", 1.50);
        expectedSecondTopping = new Item("Ketchup", 1.00);
        expectedThirdTopping = new Item("Mustard", 1.00);

        resultantBurger = fourthBasicMeal.getBurger();
        resultantDrink = fourthBasicMeal.getDrink();
        resultantFirstTopping = fourthBasicMeal.getFirstTopping();
        resultantSecondTopping = fourthBasicMeal.getSecondTopping();
        resultantThirdTopping = fourthBasicMeal.getThirdTopping();

        expected = new Object[]{expectedBurger, expectedDrink,
                expectedFirstTopping, expectedSecondTopping, expectedThirdTopping};
        result = new Object[]{resultantBurger, resultantDrink,
                resultantFirstTopping, resultantSecondTopping, resultantThirdTopping};
        Assertions.assertArrayEquals(expected, result);
    }
}
