package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public SalariedEmployee() {}

    public SalariedEmployee(String name, String birthDate, String endDate,
                            long employeeId, String hireDate, double annualSalary,
                            boolean isRetired)
    {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        int decimalPlaces = 2;
        double payNoDecimalRestrictions = this.getAnnualSalary() / 26.0;
        BigDecimal pay = BigDecimal.valueOf(payNoDecimalRestrictions);
        pay = pay.setScale(decimalPlaces, RoundingMode.HALF_UP);
        double payDoubleValue = pay.doubleValue();

        return (this.isRetired()) ? (0.9 * payDoubleValue) : payDoubleValue;
    }

    public void retire() {
        this.terminate("12/31/2030");
        this.setRetired(true);
    }
}
