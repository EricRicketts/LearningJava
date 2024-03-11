package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public boolean addBranch(String branchName) {
        boolean branchAdded = false;
        Branch branch = findBranch(branchName);
        if (Objects.isNull(branch)) {
            branches.add(new Branch(branchName));
            branchAdded = true;
        }
        return branchAdded;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        boolean customerAdded = false;
        Branch branch = findBranch(branchName);
        if (!Objects.isNull(branch)) customerAdded = branch.newCustomer(customerName, initialTransaction);

        return customerAdded;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
        boolean transactionAdded = false;
        Branch branch = findBranch(branchName);
        if (!Objects.isNull(branch)) transactionAdded = branch.addCustomerTransaction(customerName, initialTransaction);

        return transactionAdded;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (Objects.isNull(branch)) return false;
        String output = "";
        output += "Customer details for branch " + branch.getName() + "\n";
        int numberOfCustomers = branch.getCustomers().size();

        for (int i = 0; i < numberOfCustomers; i++) {
            Customer customer = branch.getCustomers().get(i);
            output += "Customer: " + customer.getName() + "[" + (i + 1) + "]\n";
            List<Double> transactions = customer.getTransactions();
            int numberOfTransactions = transactions.size();
            if (numberOfTransactions > 0 & printTransactions) {
                output += "Transactions\n";
                for (int j = 0; j < numberOfTransactions; j++) {
                    Double transaction = transactions.get(j);
                    output += "[" + (j + 1) + "] " + "Amount " + transaction + "\n";
                }
            }
        }
        System.out.print(output);
        return true;
    }

    private Branch findBranch(String branchName) {
        Branch branch = null;
        for (Branch currentBranch : branches) {
            if (currentBranch.getName().equalsIgnoreCase(branchName)) {
                branch = currentBranch;
                break;
            }
        }
        return branch;
    }

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }
}
