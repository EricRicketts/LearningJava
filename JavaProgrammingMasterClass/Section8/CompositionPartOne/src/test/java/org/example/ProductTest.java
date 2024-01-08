package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductTest {

    Product product;

    @BeforeEach
    public void setUp() {
        product = new Product("XR30", "ACME");
    }

    @Test
    public void testIntFieldsInitializeToZero() {
        List<Integer> intProductFields = new ArrayList<>(Arrays.asList(
                product.getWidth(), product.getHeight(), product.getDepth()
        ));
        for (int intProductFieldInitialization : intProductFields) {
            Assertions.assertEquals(0, intProductFieldInitialization);
        }
    }
}
