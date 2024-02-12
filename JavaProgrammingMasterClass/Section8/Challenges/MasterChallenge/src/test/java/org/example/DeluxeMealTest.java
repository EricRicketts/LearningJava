package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DeluxeMealTest {

    private DeluxeMeal deluxeMeal;

    @BeforeEach
    public void setUp() {
       deluxeMeal = new DeluxeMeal();
       deluxeMeal.setFirstTopping(new Item("Cheese"));
       deluxeMeal.setSecondTopping(new Item("Tomatoes"));
       deluxeMeal.setThirdTopping(new Item("Lettuce"));
    }

    @Test
    public void testBurgerDrinkAndSideItem() {
        Object[] expected = new Object[]{"Large", "LargeCoke", "LargeFries", "Cheese", "Tomatoes", "Lettuce"};
        Object[] results = new Object[]{
                deluxeMeal.getHamburger().size(),
                String.join("", deluxeMeal.getDrink().size(), deluxeMeal.getDrink().type()),
                String.join("", deluxeMeal.getSideItem().size(), deluxeMeal.getSideItem().type()),
                deluxeMeal.getFirstTopping().type(),
                deluxeMeal.getSecondTopping().type(),
                deluxeMeal.getThirdTopping().type()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testPriceInvariantWithOneAndFiveToppings() {
        double[] expectedPrices = new double[]{19.99, 19.99, 19.99};
        double[] resultantPrices = new double[3];
        resultantPrices[0] = deluxeMeal.getPrice();
        deluxeMeal.setFourthTopping(new Item("Ketchup"));
        resultantPrices[1] = deluxeMeal.getPrice();
        deluxeMeal.setFifthTopping(new Item("Mustard"));
        resultantPrices[2] = deluxeMeal.getPrice();

        Assertions.assertArrayEquals(expectedPrices, resultantPrices);
    }
}
