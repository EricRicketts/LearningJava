package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
    }

    @Test
    public void testListCustomersWithTransactions() {
        String expected = """
                Customer details for branch Adelaide
                Customer: Tim[1]
                Transactions
                [1] Amount 50.05
                [2] Amount 44.22
                [3] Amount 12.44
                Customer: Mike[2]
                Transactions
                [1] Amount 175.34
                [2] Amount 1.65
                Customer: Percy[3]
                Transactions
                [1] Amount 220.12
                """;
        String results = bank.listCustomers("Adelaide", true);
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testListCustomersWithNoTransactions() {
        String expected = """
                Customer details for branch Adelaide
                Customer: Tim[1]
                Customer: Mike[2]
                Customer: Percy[3]
                """;
        String results = bank.listCustomers("Adelaide", false);
        Assertions.assertEquals(expected, results);
    }
}
