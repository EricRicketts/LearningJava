package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountTest {

    private final String DEFAULT_ACCOUNT_NUMBER = "000000";
    private final double DEFAULT_ACCOUNT_BALANCE = 0.0;
    private final String DEFAULT_ACCOUNT_CUSTOMER_NAME = "Default Name";
    private final String DEFAULT_ACCOUNT_CUSTOMER_EMAIL = "default@example.com";
    private final String DEFAULT_ACCOUNT_CUSTOMER_PHONE = "(000) 000-0000";
    private final String FIRST_ACCOUNT_NUMBER = "123456";
    private final double FIRST_ACCOUNT_BALANCE = 1000.00;
    private final String FIRST_ACCOUNT_CUSTOMER_NAME = "Elmer Fudd";
    private final String FIRST_ACCOUNT_CUSTOMER_EMAIL = "elmer.fudd@warnerbros.com";
    private final String FIRST_ACCOUNT_CUSTOMER_PHONE = "(123) 456-7890";
    private final String SECOND_ACCOUNT_CUSTOMER_NAME = "Daffy Duck";
    private final String SECOND_ACCOUNT_CUSTOMER_EMAIL = "daffy.duck@warnerbros.com";
    private final String SECOND_ACCOUNT_CUSTOMER_PHONE = "(987) 654-3210";
    private Account firstAccount, secondAccount, thirdAccount;

    @BeforeEach
    public void oneTimeSetup() {
        firstAccount = new Account("123456", 1000.00, "Elmer Fudd",
                "elmer.fudd@warnerbros.com", "(123) 456-7890");
        secondAccount = new Account(
                "Daffy Duck",
                "daffy.duck@warnerbros.com",
                "(987) 654-3210");
        thirdAccount = new Account();
    }

    @Test
    public void testFirstAccount() {
        List<String> expectations = new ArrayList<>(Arrays.asList(
                DEFAULT_ACCOUNT_NUMBER, SECOND_ACCOUNT_CUSTOMER_NAME,
                SECOND_ACCOUNT_CUSTOMER_EMAIL, SECOND_ACCOUNT_CUSTOMER_PHONE)
        );
        List<String> results = new ArrayList<>(Arrays.asList(
                secondAccount.getNumber(), secondAccount.getCustomerName(),
                secondAccount.getCustomerEmail(), secondAccount.getCustomerPhone())
        );
        for (int index = 0; index < results.size(); index++) {
            String expected = expectations.get(index);
            String result = results.get(index);
            Assertions.assertEquals(expected, result);
        }
        Assertions.assertEquals(
                DEFAULT_ACCOUNT_BALANCE,
                secondAccount.getBalance()
        );
    }
    @Test
    public void testThirdAccount() {
        List<String> expectations = new ArrayList<>(Arrays.asList(
                DEFAULT_ACCOUNT_NUMBER, DEFAULT_ACCOUNT_CUSTOMER_NAME,
                DEFAULT_ACCOUNT_CUSTOMER_EMAIL, DEFAULT_ACCOUNT_CUSTOMER_PHONE)
        );
        List<String> results = new ArrayList<>(Arrays.asList(
                thirdAccount.getNumber(), thirdAccount.getCustomerName(),
                thirdAccount.getCustomerEmail(), thirdAccount.getCustomerPhone())
        );
        for (int index = 0; index < results.size(); index++) {
            String expected = expectations.get(index);
            String result = results.get(index);
            Assertions.assertEquals(expected, result);
        }
        Assertions.assertEquals(
                DEFAULT_ACCOUNT_BALANCE,
                thirdAccount.getBalance()
        );
    }

    @Test
    public void testSecondAccount() {
        List<String> expectations = new ArrayList<>(Arrays.asList(
                DEFAULT_ACCOUNT_NUMBER, SECOND_ACCOUNT_CUSTOMER_NAME,
                SECOND_ACCOUNT_CUSTOMER_EMAIL, SECOND_ACCOUNT_CUSTOMER_PHONE)
        );
        List<String> results = new ArrayList<>(Arrays.asList(
                secondAccount.getNumber(), secondAccount.getCustomerName(),
                secondAccount.getCustomerEmail(), secondAccount.getCustomerPhone())
        );
        for (int index = 0; index < results.size(); index++) {
            String expected = expectations.get(index);
            String result = results.get(index);
            Assertions.assertEquals(expected, result);
        }
        Assertions.assertEquals(
                DEFAULT_ACCOUNT_BALANCE,
                secondAccount.getBalance()
        );
    }
}
