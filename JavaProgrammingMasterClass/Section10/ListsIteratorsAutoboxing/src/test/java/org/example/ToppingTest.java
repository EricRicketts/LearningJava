package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.text.DecimalFormat;

public class ToppingTest {

    @Test
    public void testToppingEnum() {
        DecimalFormat df = new DecimalFormat("0.00");
        String results = "";
        String expected = "MUSTARD : $1.00\n" +
                "KETCHUP : $1.00\n" +
                "MAYONNAISE : $1.00\n" +
                "TOMATO : $1.00\n" +
                "LETTUCE : $1.00\n" +
                "PICKLES : $1.00\n" +
                "ONIONS : $1.00\n" +
                "BACON : $1.50\n" +
                "CHEDDAR : $1.50\n" +
                "AMERICAN : $1.50\n" +
                "MOZZARELLA : $1.50\n" +
                "PROVOLONE : $1.50\n";

        for (Topping topping : Topping.values()) {
            results += topping.name() + " : $" + df.format(topping.getPrice()) + "\n";
        }

        Assertions.assertEquals(expected, results);
    }
}
