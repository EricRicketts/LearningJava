package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Student implements Comparable<Student> {

    private static int LAST_ID = 1000;
    private static Random random = new Random();
    private String name;
    private int id;
    private double gpa;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    public Student(String name) {
        double min = 0.00;
        double max = 4.00;
        int places = 2;
        this.name = name;
        this.id = LAST_ID++;
        double value = ((Math.random() * (max - min)) + min);
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        this.gpa = bd.doubleValue();
    }
}
