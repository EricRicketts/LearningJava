package org.example;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BankTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

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

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testListCustomersWithTransactions() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
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
        boolean results = bank.listCustomers("Adelaide", true);
        Assertions.assertTrue(results);
        Assertions.assertEquals(expected, outContent.toString());
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testListCustomersWithNoTransactions() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        String expected = """
                Customer details for branch Adelaide
                Customer: Tim[1]
                Customer: Mike[2]
                Customer: Percy[3]
                """;
        boolean results = bank.listCustomers("Adelaide", false);
        Assertions.assertTrue(results);
        Assertions.assertEquals(expected, outContent.toString());
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testNoBranchForListCustomers() {
        Assertions.assertFalse(bank.listCustomers("FooBar", true));
    }
}
