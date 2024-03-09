package org.example;

import java.util.ArrayList;
import java.util.Objects;

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
        boolean customerAdded = false;
        Customer customer = findCustomer(name);
        if (Objects.isNull(customer)) {
            getCustomers().add(new Customer(name, initialTransaction));
            customerAdded = true;
        }
        return customerAdded;
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
