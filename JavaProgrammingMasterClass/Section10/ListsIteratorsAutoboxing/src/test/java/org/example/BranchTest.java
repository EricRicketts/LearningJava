package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BranchTest {

    private Branch branch;

    @BeforeEach
    public void setUp() {
        branch = new Branch("Gainesville");
        branch.newCustomer("Elmer Fudd", 100.00);
        branch.newCustomer("Bugs Bunny", 200.00);
        branch.newCustomer("Daffy Duck", 300.00);
        branch.newCustomer("Foghorn Leghorn", 400.00);
    }

    @Test
    public void testGetBranchName() {
        String expected = "Gainesville";
        String results = branch.getName();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetCustomers() {
        Object[] expected = {4, "Bugs Bunny", 200.00};
        Object[] results = {
                branch.getCustomers().size(),
                branch.getCustomers().get(1).getName(),
                branch.getCustomers().get(1).getTransactions().get(0)
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddCustomerSuccess() {
        Object[] expected = {true, 5};
        boolean customerAdded = branch.newCustomer("Yosemite Sam", 600.00);
        Object[] results = {
                customerAdded,
                branch.getCustomers().size()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddCustomerFailure() {
        Object[] expected = {false, 4};
        boolean customerAdded = branch.newCustomer("Bugs Bunny", 200.00);
        Object[] results = {
                customerAdded,
                branch.getCustomers().size()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddCustomerTransactionSuccess() {
        Object[] expected = {true, 350.00};
        boolean transactionCompleted = branch.addCustomerTransaction("Elmer Fudd", 350.00);
        Object[] results = {
                transactionCompleted,
                branch.getCustomers().get(0).getTransactions().get(1)
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddCustomerTransactionFailure() {
        Object[] expected = {false, 1};
        boolean transactionCompleted = branch.addCustomerTransaction("Tweety Bird", 100.00);
        Assertions.assertFalse(transactionCompleted);
    }
}
