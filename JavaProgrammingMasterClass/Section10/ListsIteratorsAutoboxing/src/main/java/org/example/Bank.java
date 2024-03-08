package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addNewCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addTransactionForCustomer(String name, double amount) {
        Customer customer = null;
        for (Customer currentCustomer : customers) {
            if (currentCustomer.getName().equals(name)) {
                customer = currentCustomer;
            }
        }
        if (!Objects.isNull(customer)) customer.addTransaction(amount);
    }

    public String print(String customerName) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);

        String customerTransactions = "";
        Customer customer = null;
        for (Customer currentCustomer : customers) {
            if (currentCustomer.getName().equals(customerName)) {
                customer = currentCustomer;
                break;
            }
        }
        if (Objects.isNull(customer)) {
            return "No Transactions\n";
        } else {
            customerTransactions += "Customer Name: " + customer.getName() + "\n";
            customerTransactions += "Transactions:\n";
        }
        for (int j = 0; j < customer.getTransactions().size(); j++) {
            Double transaction = customer.getTransactions().get(j);
            String transactionString = df.format(transaction);
            customerTransactions += transactionString + "\n";
        }
        return customerTransactions;
    }

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }
}
