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
}
