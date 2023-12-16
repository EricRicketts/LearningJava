package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private final BankAccount bankAccount = new BankAccount();
    @BeforeEach
    public void setUp() {
        bankAccount.setNumber(101491);
        bankAccount.setCustomerName("Eric Ricketts");
        bankAccount.setCustomerEmail("eric_ricketts@icloud.com");
        bankAccount.setCustomerPhone("919-449-5529");
        bankAccount.setBalance(1000);
    }

    @Test
    public void testGetAndSetAccountNumber() {
        Assertions.assertEquals(
                101491,
                bankAccount.getNumber()
        );
        bankAccount.setNumber(222345);
        Assertions.assertEquals(
                222345,
                bankAccount.getNumber()
        );
    }

    @Test
    public void testGetAndSetCustomerName() {
        Assertions.assertEquals(
                "Eric Ricketts",
                bankAccount.getCustomerName()
        );
        bankAccount.setCustomerName("Elmer Fudd");
        Assertions.assertEquals(
                "Elmer Fudd",
                bankAccount.getCustomerName()
        );
    }

    @Test
    public void testGetAndSetCustomerEmail() {
        Assertions.assertEquals(
                "eric_ricketts@icloud.com",
                bankAccount.getCustomerEmail()
        );
        bankAccount.setCustomerEmail("ewricketts@icloud.com");
        Assertions.assertEquals(
                "ewricketts@icloud.com",
                bankAccount.getCustomerEmail()
        );
    }

    @Test
    public void testGetAndSetCustomerPhone() {
        Assertions.assertEquals(
                "919-449-5529",
                bankAccount.getCustomerPhone()
        );
        bankAccount.setCustomerPhone("703-451-0235");
        Assertions.assertEquals(
                "703-451-0235",
                bankAccount.getCustomerPhone()
        );
    }

    @Test
    public void testGetAndSetBalance() {
        Assertions.assertEquals(
                1000.0,
                bankAccount.getBalance()
        );
        bankAccount.setBalance(1500.50);
        Assertions.assertEquals(
                1500.50,
                bankAccount.getBalance()
        );
    }

    @Test
    public void testDeposit() {
        Assertions.assertEquals(
                1000.0,
                bankAccount.getBalance()
        );
        Assertions.assertEquals(
                150.50,
                bankAccount.deposit(150.50)
        );
        Assertions.assertEquals(
                1150.50,
                bankAccount.getBalance()
        );
    }

    @Test
    public void testOverWithdrawn() {
        Assertions.assertEquals(
                -1,
                bankAccount.withdraw(2000)
        );
        Assertions.assertEquals(
                1000.0,
                bankAccount.getBalance()
        );
    }

    @Test
    public void testWithdraw() {
        Assertions.assertEquals(
                1000,
                bankAccount.getBalance()
        );
        Assertions.assertEquals(
                150.50,
                bankAccount.withdraw(150.50)
        );
        Assertions.assertEquals(
                849.50,
                bankAccount.getBalance()
        );
    }
}
