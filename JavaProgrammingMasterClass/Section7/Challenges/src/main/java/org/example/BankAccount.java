package org.example;

import java.text.DecimalFormat;

public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double deposit(double deposit) {
        this.setBalance(this.getBalance() + deposit);
        return deposit;
    }

    public double withdraw(double withdraw) {
        double remainingBalance = this.getBalance() - withdraw;
        if (remainingBalance < 0) return -1;
        this.setBalance(remainingBalance);

        return withdraw;
    }
}
