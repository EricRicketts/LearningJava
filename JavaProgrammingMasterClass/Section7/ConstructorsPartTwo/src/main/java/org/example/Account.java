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

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("000000", 0.0, customerName, customerEmail, customerPhone);
        // the advice by the instructor is to define only one constructor with all needed parameters
        // and then use that base instructor in all constructor chaining.  Any other constructor
        // calls will have to be given the needed parameters if not supplied by the arguments
    }
    public Account() {
        this("000000", 0.0, "Default Name",
                "default@example.com", "(000) 000-0000");
        // unusual case of calling another constructor within a constructor.  First "this"
        // is used to call the other constructor and second the call to the other constructor
        // must be the first line on the body of the current constructor call.
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
