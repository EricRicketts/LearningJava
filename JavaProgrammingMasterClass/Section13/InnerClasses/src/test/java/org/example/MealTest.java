package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MealTest {

    private Meal regularMeal, reducedCostMeal, toppingsMeal;
    private String results;
    private List<String> expectedItems;

    @BeforeEach
    public void setUp() {
        regularMeal = new Meal();
    }

    @Test
    public void testRegularMeal() {
        String expected = """
                    burger        regular $5.00
                     drink           coke $1.50
                      side          fries $2.00
                               Total Due: $8.50
                """;
        expectedItems = List.of(
                "burger        regular $5.00",
                "drink           coke $1.50",
                "side          fries $2.00",
                "Total Due: $8.50"
                );
        String results = regularMeal.toString();
        for(String item : expectedItems) {
            assertTrue(results.contains(item));
        }
    }
}
