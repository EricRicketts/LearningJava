package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 500.00);
        customer.addTransaction(100.15);
        customer.addTransaction(-200.30);
        customer.addTransaction(50.45);
    }

    @Test
    public void testGetName() {
        String expected = "John";
        String results = customer.getName();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetTransactions() {
        ArrayList<Double> allTransactions = customer.getTransactions();
        double[] expected = {500.00, 100.15, -200.30, 50.45};
        int numberOfTransactions = allTransactions.size();

        for (int i = 0; i < numberOfTransactions; i++) {
            Double expectedTransaction = expected[i];
            Double resultantTransaction = allTransactions.get(i);
            Assertions.assertEquals(expectedTransaction, resultantTransaction);
        }
    }

}
