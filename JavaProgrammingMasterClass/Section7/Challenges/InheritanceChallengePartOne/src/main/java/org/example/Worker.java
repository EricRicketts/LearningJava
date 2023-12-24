package org.example;

import java.time.LocalDate;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public int getEndYearForAge() {
        return endYearForAge;
    }

    public void setEndYearForAge(int endYearForAge) {
        this.endYearForAge = endYearForAge;
    }

    private int endYearForAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Worker() {}

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        // redo age to use Date classes, so Date arithmetic can be performed
        int currentYear = this.getEndYearForAge();
        int birthYear = Integer.parseInt(this.getBirthDate().substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.setEndDate(endDate);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
