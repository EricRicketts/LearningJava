package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeluxeMealTest {

    private DeluxeMeal deluxeMeal;

    @BeforeEach
    public void setUp() {
        deluxeMeal = new DeluxeMeal();
    }

    @Test
    public void testBurgerDrinkAndSideItem() {
        Object[] expected = new Object[]{"Large", "LargeCoke", "LargeFries"};
        Object[] results = new Object[]{
                deluxeMeal.getHamburger().size(),
                String.join("", deluxeMeal.getDrink().size(), deluxeMeal.getDrink().type()),
                String.join("", deluxeMeal.getSideItem().size(), deluxeMeal.getSideItem().type())
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testPriceInvariantWithOneAndFiveToppings() {
        double[] expectedPrices = new double[]{19.99, 19.99, 19.99, 19.99, 19.99};
        double[] resultantPrices = new double[5];
        deluxeMeal.setFirstTopping(new Item("Cheese"));
        resultantPrices[0] = deluxeMeal.getPrice();
        deluxeMeal.setSecondTopping(new Item("Tomatoes"));
        resultantPrices[1] = deluxeMeal.getPrice();
        deluxeMeal.setThirdTopping(new Item("Lettuce"));
        resultantPrices[2] = deluxeMeal.getPrice();
        deluxeMeal.setFourthTopping(new Item("Ketchup"));
        resultantPrices[3] = deluxeMeal.getPrice();
        deluxeMeal.setFifthTopping(new Item("Mustard"));
        resultantPrices[4] = deluxeMeal.getPrice();

        Assertions.assertArrayEquals(expectedPrices, resultantPrices);
    }
}
