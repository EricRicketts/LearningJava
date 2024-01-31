package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HamburgerWithExtraToppingsTest {

    private HamburgerWithToppings firstBurger;
    private HamburgerWithToppings secondBurger;
    private HamburgerWithToppings thirdBurger;
    private Object[] expected, result;

    @BeforeEach
    public void setUp() {
        firstBurger = new HamburgerWithToppings("Small", 7.99,
               "Cheese", 1.50);
        secondBurger = new HamburgerWithToppings("Medium", 9.99,
                "Cheese", 1.50, "Ketchup", 1.00);
        thirdBurger = new HamburgerWithToppings("Large", 10.99,
                "Cheese", 1.50, "Ketchup", 1.00,
                "Mustard", 1.00);
    }

    @Test
    public void testFirstBurger() {
        expected = new Object[]{new Hamburger("Small", 7.99),
                new Item("Cheese", 1.50), (7.99 + 1.50)};
        result = new Object[]{new Hamburger(firstBurger.getSize(), firstBurger.getPrice()),
                firstBurger.getFirstTopping(), firstBurger.getTotalPrice()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecondBurger() {
        expected = new Object[]{new Hamburger("Medium", 9.99),
                new Item("Cheese", 1.50), new Item("Ketchup", 1.00), (9.99 + 1.50 + 1.00)};
        result = new Object[]{new Hamburger(secondBurger.getSize(), secondBurger.getPrice()),
                secondBurger.getFirstTopping(), secondBurger.getSecondTopping(), secondBurger.getTotalPrice()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testThirdBurger() {
        expected = new Object[]{new Hamburger("Large", 10.99),
                new Item("Cheese", 1.50), new Item("Ketchup", 1.00),
                new Item("Mustard", 1.00), (10.99 + 1.50 + 1.00 + 1.00)};
        result = new Object[]{new Hamburger(thirdBurger.getSize(), thirdBurger.getPrice()),
                thirdBurger.getFirstTopping(), thirdBurger.getSecondTopping(),
                thirdBurger.getThirdTopping(), thirdBurger.getTotalPrice()};
        Assertions.assertArrayEquals(expected, result);
    }
}
