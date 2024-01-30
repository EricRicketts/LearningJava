package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MealTest {

    private Meal meal;

   @BeforeEach
   public void setUp() {
       meal = new Meal("Medium", "Medium", "Coke");
   }

   @Test
    public void testBurger() {
        Hamburger expectedBurger = new Hamburger("Medium", 9.99);
        Hamburger resultantBurger = meal.getBurger();
       Assertions.assertEquals(expectedBurger, resultantBurger);
   }

   @Test
    public void testDrink() {
       SideItem expectedDrink = new SideItem("Coke", 6.99, "Medium");
       SideItem resultantDrink = meal.getDrink();
       Assertions.assertEquals(expectedDrink, resultantDrink);
   }

   @Test
    public void testPrice() {
       double expectedPrice = (9.99 + 6.99);
       double resultantPrice = meal.getPrice();
       Assertions.assertEquals(expectedPrice, resultantPrice);
   }
}
