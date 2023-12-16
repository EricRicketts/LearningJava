package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AccountTest {

    public Account account;
    final String number = "123456";
    final double balance = 1500.00;
    final String customerName = "Elmer Fudd";
    final String customerEmail = "elmer.fiudd@warnerbros.com";
    final String customerPhone = "(123) 456-7890";

    @BeforeEach
    public void oneTimeSetup() {
        account = new Account(number, balance, customerName, customerEmail, customerPhone);
    }

    @Test
    public void testGetAccountNumber() {
        Assertions.assertEquals(
                number,
                account.getNumber()
        );
    }

    @Test
    public void testGetAccountBalance() {
        Assertions.assertEquals(
                balance,
                account.getBalance()
        );
    }

    @Test
    public void testGetCustomerName() {
        Assertions.assertEquals(
                customerName,
                account.getCustomerName()
        );
    }

    @Test
    public void testGetCustomerEmail() {
        Assertions.assertEquals(
                customerEmail,
                account.getCustomerEmail()
        );
    }

    @Test
    public void testDeposit() {
        double expectedBalance = 1545.55;
        account.deposit(45.55);
        Assertions.assertEquals(
                expectedBalance,
                account.getBalance()
        );
    }

    @Test
    public void testValidWithdraw() {
        double expectedBalance = 1454.45;
        account.withdraw(45.55);
        Assertions.assertEquals(
                expectedBalance,
                account.getBalance()
        );
    }

    @Test
    public void testInvalidWithdraw() {
        Assertions.assertEquals(
                -1,
                account.withdraw(1500.01)
        );
    }
}
