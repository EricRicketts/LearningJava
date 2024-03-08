package org.example;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        return true;
    }

    private Customer findCustomer(String name) {
        Customer customer = null;
        for (Customer currentCustomer : customers) {
            if (currentCustomer.getName().equalsIgnoreCase(name)) {
                customer = currentCustomer;
                break;
            }
        }
        return customer;
    }

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }
}
