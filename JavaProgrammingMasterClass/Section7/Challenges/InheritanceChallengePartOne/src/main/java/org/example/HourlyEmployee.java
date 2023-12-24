package org.example;

public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * this.collectPay();
    }

    public HourlyEmployee(String name, String birthDate, String endDate,
                          long employeeId, String hireDate,
                          double hourlyPayRate)
    {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40.0 * this.getHourlyPayRate();
    }
}
