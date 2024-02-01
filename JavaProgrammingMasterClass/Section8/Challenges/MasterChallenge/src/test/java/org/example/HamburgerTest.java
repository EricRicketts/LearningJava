package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HamburgerTest {

    private Hamburger burger;

    @BeforeEach
    public void setUp() {
        burger = new Hamburger("Large");
    }

    @Test
    public void testHamburgerSize() {
        Assertions.assertEquals("Large", burger.getSize());
    }

    @Test
    public void testHamburgerPrice() {
        Assertions.assertEquals(10.99, burger.getPrice());
    }

    @Test
    public void testEquals() {
        Hamburger otherBurger = new Hamburger("Large");
        Assertions.assertEquals(burger, otherBurger);
    }
}
