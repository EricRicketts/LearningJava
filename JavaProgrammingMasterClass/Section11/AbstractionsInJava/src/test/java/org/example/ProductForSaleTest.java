package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ProductForSaleTest {

    private ProductForSale trousers, shirt, shoes;
    private String expected, results;

    @BeforeEach
    public void setUp() {
        trousers = new Trousers("Chinos", "Relaxed and flexible", 64.00);
        shirt = new Shirt("Overshirt", "Weather versatile", 25.99);
        shoes = new Shoes("Oxford", "Comfortable and casual", 34.50);
    }

    @Test
    public void testTrousers() {
        expected = "Trousers (Chinos) Description: Relaxed and flexible Price: 64.00";
        results = trousers.showDetails();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testShirt() {
        expected = "Shirt (Overshirt) Description: Weather versatile Price: 25.99";
        results = shirt.showDetails();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testShoes() {
        expected = "Shoes (Oxford) Description: Comfortable and casual Price: 34.50";
        results = shoes.showDetails();
        Assertions.assertEquals(expected, results);
    }

}
