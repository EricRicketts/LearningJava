package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HamburgerWithToppingsTest {

    private HamburgerWithToppings firstBurgerWithToppings;
    private HamburgerWithToppings secondBurgerWithToppings;
    private HamburgerWithToppings thirdBurgerWithToppings;
    private String[] expectedSizeAndToppingTypes, resultantSizeAndToppingTypes;

    @BeforeEach
    public void setUp() {
        firstBurgerWithToppings = new HamburgerWithToppings("Small", "Cheese");
        secondBurgerWithToppings = new HamburgerWithToppings("Medium", "Cheese",
                "Ketchup");
        thirdBurgerWithToppings = new HamburgerWithToppings("Large", "Cheese",
                "Ketchup", "Mustard");
    }

    @Test
    public void testFirstBurgerSize() {
        Assertions.assertEquals("Small", firstBurgerWithToppings.getSize());
    }

    @Test
    public void testFirstBurgerPrice() {
        Assertions.assertEquals(7.99, firstBurgerWithToppings.getPrice());
    }

    @Test
    public void testFirstBurgerFirstToppingType() {
        Assertions.assertEquals("Cheese", firstBurgerWithToppings.getFirstTopping().getType());
    }

    @Test
    public void testFirstBurgerFirstToppingPrice() {
        Assertions.assertEquals(1.50, firstBurgerWithToppings.getFirstTopping().getPrice());
    }

    @Test
    public void testFirstBurgerTotalPrice() {
        Assertions.assertEquals((7.99 + 1.50), firstBurgerWithToppings.getTotalPrice());
    }

    @Test
    public void testSecondBurgerSizeAndToppingTypes() {
        expectedSizeAndToppingTypes = new String[]{"Medium", "Cheese", "Ketchup"};
        resultantSizeAndToppingTypes = new String[]{
                secondBurgerWithToppings.getSize(), secondBurgerWithToppings.getFirstTopping().getType(),
                secondBurgerWithToppings.getSecondTopping().getType()
        };
        Assertions.assertArrayEquals(expectedSizeAndToppingTypes, resultantSizeAndToppingTypes);
    }

    @Test
    public void testSecondBurgerTotalPrice() {
        Assertions.assertEquals((9.99 + 1.50 + 1.00), secondBurgerWithToppings.getTotalPrice());
    }

    @Test
    public void testThirdBurgerSizeAndToppingTypes() {
        expectedSizeAndToppingTypes = new String[]{"Large", "Cheese", "Ketchup", "Mustard"};
        resultantSizeAndToppingTypes = new String[]{
                thirdBurgerWithToppings.getSize(), thirdBurgerWithToppings.getFirstTopping().getType(),
                thirdBurgerWithToppings.getSecondTopping().getType(),
                thirdBurgerWithToppings.getThirdTopping().getType()
        };
        Assertions.assertArrayEquals(expectedSizeAndToppingTypes, resultantSizeAndToppingTypes);
    }

    @Test
    public void testThirdBurgerTotalPrice() {
        Assertions.assertEquals((10.99 + 1.50 + 1.00 + 1.00), thirdBurgerWithToppings.getTotalPrice());
    }
}
