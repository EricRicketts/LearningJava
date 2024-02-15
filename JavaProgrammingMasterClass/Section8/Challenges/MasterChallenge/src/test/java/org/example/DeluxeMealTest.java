package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DeluxeMealTest {

    private DeluxeMeal deluxeMeal;

    @BeforeEach
    public void setUp() {
        deluxeMeal = new DeluxeMeal(
                new Item("Large", "Drink", "Pepsi"),
                new Item("Large", "Side", "Fries")
        );
        List<Item> desiredToppings = new ArrayList<>();
        desiredToppings.add(new Item("", "Topping", "Cheese"));
        desiredToppings.add(new Item("", "Topping", "Lettuce"));
        desiredToppings.add(new Item("", "Topping", "Tomatoes"));
        desiredToppings.add(new Item("", "Topping", "Ketchup"));
        desiredToppings.add(new Item("", "Topping", "Mayonnaise"));
        deluxeMeal.setAllToppings(desiredToppings);
    }

    @Test
    public void testTotalPrice() {
        Assertions.assertEquals(17.99, deluxeMeal.getPrice());
    }

    @Test
    public void testPrintItemizedList() {
        String expected = """
                Deluxe Hamburger $17.99
                Cheese $0.00
                Lettuce $0.00
                Tomatoes $0.00
                Ketchup $0.00
                Mayonnaise $0.00
                Large Pepsi $0.00
                Large Fries $0.00
                Total $17.99
                """;
        String result = deluxeMeal.printItemizedList();
        Assertions.assertEquals(expected, result);
    }
}
