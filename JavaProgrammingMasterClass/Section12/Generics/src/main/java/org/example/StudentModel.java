package org.example;

import java.util.Random;

public class StudentModel {

    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static final String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static final String[] courses = {"C++", "Java", "Python"};

    public StudentModel() {
        int largestChar = 90;
        int smallestChar = 65;
        int firstYear = 2018;
        int lastYear = 2022;
        int lastNameIndex = random.nextInt(largestChar - smallestChar + 1) + smallestChar;
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;  // selects from indicies [0,4]
        course = courses[random.nextInt(3)]; // selects from indicies [0,2]
        yearStarted = random.nextInt(lastYear - firstYear + 1) + firstYear;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", yearStarted=" + yearStarted +
                '}';
    }

    public String toStringWithCarriageReturn() {
        return this.toString() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public static String[] getFirstNames() {
        return firstNames;
    }

    public static String[] getCourses() {
        return courses;
    }
}
