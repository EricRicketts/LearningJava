package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenericItemTest {

    private GenericItem genericItem;
    String expected, result;
    @BeforeEach
    void setUp() {
        genericItem = new GenericItem("Soft Drink", 4.99);
    }

    @Test
    public void testType() {
        expected = "Soft Drink";
        result = genericItem.getType();
        Assertions.assertEquals(expected, result);
        genericItem.setType("Beer");
        expected = "Beer";
        result = genericItem.getType();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPrice() {
        double expected = 4.99;
        double result = genericItem.getPrice();
        Assertions.assertEquals(expected, result);
        genericItem.setPrice(5.99);
        expected = 5.99;
        result = genericItem.getPrice();
        Assertions.assertEquals(expected, result);
    }
}
