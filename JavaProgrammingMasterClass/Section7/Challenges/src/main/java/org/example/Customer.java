package org.example;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 20_000.00, email);
    }

    public Customer() {
        this("Default Name", "default@example.com");
        // this is constructor chaining, the no argument constructor calls the two argument
        // constructor instead of the three argument constructor because if the credit limit
        // changes we have to change it in both the two argument and no argument constructors.
    }
}
