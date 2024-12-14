package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MealTest {

    private Meal regularMeal, reducedMeal, toppingsMeal;
    private String results;
    private List<String> expectedItems;

    @BeforeEach
    public void setUp() {
        regularMeal = new Meal();
        reducedMeal = new Meal(0.68);
        toppingsMeal = new Meal();
        toppingsMeal.addToppings("Ketchup", "Mayo", "Bacon", "Cheddar");
    }

    @Test
    public void testRegularMeal() {
        results = regularMeal.toString();
        expectedItems = List.of(
                "burger", "regular $5.00", "drink", "coke $1.50",
                "side", "fries $2.00", "Total Due: $8.50"
        );
        for(String item : expectedItems) {
            assertTrue(results.contains(item));
        }
    }

    @Test
    public void testReducedMeal() {
        results = reducedMeal.toString();
        expectedItems = List.of(
            "burger", "regular $3.40", "drink", "coke $1.02",
            "side", "fries $1.36", "Total Due: $5.78"
        );
        for(String item : expectedItems) {
            assertTrue(results.contains(item));
        }
    }

    @Test
    public void testToppingsMeal() {
        results = toppingsMeal.toString();
        String expected = "foo";
        expectedItems = List.of(
            "burger", "regular $5.00", "drink", "coke $1.50",
            "side", "fries $2.00", "Total Due: $10.00",
            "TOPPING        KETCHUP $0.00", "TOPPING           MAYO $0.00",
            "TOPPING          BACON $1.50"
        );
        for(String item : expectedItems) {
            assertTrue(results.contains(item));
        }
    }
}
