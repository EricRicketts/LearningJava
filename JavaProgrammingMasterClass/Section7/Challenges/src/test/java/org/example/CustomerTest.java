package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomerTest {

    final String DEFAULT_NAME = "Default Name";
    final double DEFAULT_CREDIT_LIMIT = 0.00;
    final String DEFAULT_EMAIL = "default@example.com";
    final String FIRST_CUSTOMER_NAME = "Elmer Fudd";
    final double FIRST_CUSTOMER_CREDIT_LIMIT = 10_000.00;
    final String FIRST_CUSTOMER_EMAIL = "elmer.fudd@warnerbros.com";
    final String SECOND_CUSTOMER_NAME = "Daffy Duck";
    final double SECOND_CUSTOMER_CREDIT_LIMIT = 20_000.00;
    final String SECOND_CUSTOMER_EMAIL = "daffy.duck@warnerbros.com";

    private static Customer firstCustomer;
    private static Customer secondCustomer;
    private static Customer thirdCustomer;
    @BeforeAll
    public void setup() {
        firstCustomer = new Customer(
                FIRST_CUSTOMER_NAME,
                FIRST_CUSTOMER_CREDIT_LIMIT,
                FIRST_CUSTOMER_EMAIL
        );
        secondCustomer = new Customer(
                SECOND_CUSTOMER_NAME,
                SECOND_CUSTOMER_EMAIL
        );
        thirdCustomer = new Customer();
    }

    @Test
    public void testFirstCustomer() {
        List<Object> expectations = new ArrayList<>(Arrays.asList(
                FIRST_CUSTOMER_NAME,
                FIRST_CUSTOMER_CREDIT_LIMIT,
                FIRST_CUSTOMER_EMAIL)
        );
        List<Object> results = new ArrayList<>(Arrays.asList(
                firstCustomer.getName(), firstCustomer.getCreditLimit(), firstCustomer.getEmail()
        ));

        for (int index = 0; index < results.size(); index++) {
            Object expected = expectations.get(index);
            Object result = results.get(index);
            Assertions.assertEquals(expected, result);
        }
    }

    @Test
    public void testSecondCustomer() {
        List<Object> expectations = new ArrayList<>(Arrays.asList(
                SECOND_CUSTOMER_NAME,
                SECOND_CUSTOMER_CREDIT_LIMIT,
                SECOND_CUSTOMER_EMAIL)
        );
        List<Object> results = new ArrayList<>(Arrays.asList(
                secondCustomer.getName(), secondCustomer.getCreditLimit(), secondCustomer.getEmail()
        ));

        for (int index = 0; index < results.size(); index++) {
            Object expected = expectations.get(index);
            Object result = results.get(index);
            Assertions.assertEquals(expected, result);
        }
    }

    @Test
    public void testThirdCustomer() {
        List<Object> expectations = new ArrayList<>(Arrays.asList(
                DEFAULT_NAME,
                DEFAULT_CREDIT_LIMIT,
                DEFAULT_EMAIL)
        );
        List<Object> results = new ArrayList<>(Arrays.asList(
                thirdCustomer.getName(), thirdCustomer.getCreditLimit(), thirdCustomer.getEmail()
        ));

        for (int index = 0; index < results.size(); index++) {
            Object expected = expectations.get(index);
            Object result = results.get(index);
            Assertions.assertEquals(expected, result);
        }
    }
}
