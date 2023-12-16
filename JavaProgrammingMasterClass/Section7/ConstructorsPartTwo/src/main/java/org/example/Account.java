package org.example;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(String number, double balance, String customerName,
                   String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account() {
        this("000000", 0.0, "Default Name",
                "default@example.com", "(000) 000-0000");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
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
        this.setBalance(this.getBalance() - withdraw);

        return withdraw;
    }
}
