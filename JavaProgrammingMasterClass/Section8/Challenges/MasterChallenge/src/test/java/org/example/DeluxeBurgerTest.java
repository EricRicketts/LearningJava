package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeluxeBurgerTest {

    private DeluxeBurger firstDeluxeBurger;
    private DeluxeBurger secondDeluxeBurger;
    private DeluxeBurger thirdDeluxeBurger;

    private Object[] expected, result;

    @BeforeEach
    public void setUp() {
        firstDeluxeBurger = new DeluxeBurger("Small Deluxe", 8.99, "Ketchup");
        secondDeluxeBurger = new DeluxeBurger("Medium Deluxe", 10.99,
                "Ketchup","Mustard");
        thirdDeluxeBurger = new DeluxeBurger("Small Deluxe", 11.99,
                "Ketchup", "Mustard", "Mayonnaise");
    }

    @Test
    public void testFirstBurgerNameAndType() {
        expected = new Object[]{"Small Deluxe", 8.99};
        result = new Object[]{firstDeluxeBurger.getType(), firstDeluxeBurger.getPrice()};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testFirstBurgerFirstTopping() {
        expected = new Object[]{"Ketchup", 0.00};
        result = new Object[]{
                firstDeluxeBurger.firstTopping.getType(),
                firstDeluxeBurger.firstTopping.getPrice()
        };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecondBurgerSecondTopping() {
        expected = new Object[]{"Mustard", 0.00};
        result = new Object[]{
                secondDeluxeBurger.secondTopping.getType(),
                secondDeluxeBurger.secondTopping.getPrice()
        };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testThirdBurgerThirdTopping() {
        expected = new Object[]{"Mayonnaise", 0.00};
        result = new Object[]{
                thirdDeluxeBurger.thirdTopping.getType(),
                thirdDeluxeBurger.thirdTopping.getPrice()
        };
        Assertions.assertArrayEquals(expected, result);
    }
}
