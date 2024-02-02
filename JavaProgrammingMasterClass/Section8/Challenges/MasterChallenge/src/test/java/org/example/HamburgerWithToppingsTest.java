package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class HamburgerWithToppingsTest {

    private HamburgerWithToppings burgerWithNoToppings;
    private HamburgerWithToppings firstBurgerWithToppings;
    private HamburgerWithToppings secondBurgerWithToppings;
    private HamburgerWithToppings thirdBurgerWithToppings;
    private String[] expectedSizeAndToppingTypes, resultantSizeAndToppingTypes;
    private Object[] expected, result;

    @BeforeEach
    public void setUp() {
        burgerWithNoToppings = new HamburgerWithToppings("Medium");
        firstBurgerWithToppings = new HamburgerWithToppings("Small", "Cheese");
        secondBurgerWithToppings = new HamburgerWithToppings("Medium", "Cheese",
                "Ketchup");
        thirdBurgerWithToppings = new HamburgerWithToppings("Large", "Cheese",
                "Ketchup", "Mustard");
    }

    @Test
    public void testBurgerWithNoToppings() {
        String expectedBurgerSize = "Medium";
        double expectedBurgerPrice = 9.99;
        String resultantBurgerSize = burgerWithNoToppings.getBurger().getSize();
        double resultantBurgerPrice = burgerWithNoToppings.getPrice();

        expected = new Object[]{expectedBurgerSize, expectedBurgerPrice};
        result = new Object[]{resultantBurgerSize, resultantBurgerPrice};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testFirstBurgerSizeAndToppingTypes() {
        expectedSizeAndToppingTypes = new String[]{"Small", "Cheese"};
        resultantSizeAndToppingTypes = new String[]{
                firstBurgerWithToppings.getBurger().getSize(), firstBurgerWithToppings.getFirstTopping().getType()
        };

        Assertions.assertArrayEquals(expectedSizeAndToppingTypes, resultantSizeAndToppingTypes);
    }

    @Test
    public void testFirstBurgerTotalPrice() {
        Assertions.assertEquals((7.99 + 1.50), firstBurgerWithToppings.getPrice());
    }

    @Test
    public void testSecondBurgerSizeAndToppingTypes() {
        expectedSizeAndToppingTypes = new String[]{"Medium", "Cheese", "Ketchup"};
        resultantSizeAndToppingTypes = new String[]{
                secondBurgerWithToppings.getBurger().getSize(), secondBurgerWithToppings.getFirstTopping().getType(),
                secondBurgerWithToppings.getSecondTopping().getType()
        };
        Assertions.assertArrayEquals(expectedSizeAndToppingTypes, resultantSizeAndToppingTypes);
    }

    @Test
    public void testSecondBurgerTotalPrice() {
        Assertions.assertEquals((9.99 + 1.50 + 1.00), secondBurgerWithToppings.getPrice());
    }

    @Test
    public void testThirdBurgerSizeAndToppingTypes() {
        expectedSizeAndToppingTypes = new String[]{"Large", "Cheese", "Ketchup", "Mustard"};
        resultantSizeAndToppingTypes = new String[]{
                thirdBurgerWithToppings.getBurger().getSize(), thirdBurgerWithToppings.getFirstTopping().getType(),
                thirdBurgerWithToppings.getSecondTopping().getType(),
                thirdBurgerWithToppings.getThirdTopping().getType()
        };
        Assertions.assertArrayEquals(expectedSizeAndToppingTypes, resultantSizeAndToppingTypes);
    }

    @Test
    public void testThirdBurgerTotalPrice() {
        Assertions.assertEquals((10.99 + 1.50 + 1.00 + 1.00), thirdBurgerWithToppings.getPrice());
    }

    @Test
    public void testAddOneToppingToBurgerWithNoToppings() {
        burgerWithNoToppings.setFirstTopping(new Item("Cheese"));
        expected = new Object[]{"Medium", "Cheese", (9.99 + 1.50)};
        result = new Object[]{
                burgerWithNoToppings.getBurger().getSize(),
                burgerWithNoToppings.getFirstTopping().getType(),
                burgerWithNoToppings.getPrice()
        };
        Assertions.assertArrayEquals(expected, result);
    }
}
