package org.example;

import java.util.Random;

public class Student {

    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};
    private static int firstYear = 2018;
    private static int lastYear = 2023;

    public static int getFirstYear() {
        return firstYear;
    }

    public static int getLastYear() {
        return lastYear;
    }

    public static String[] getFirstNames() {
        return firstNames;
    }

    public static String[] getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(this.getName(), this.getCourse(), this.getYearStarted());
    }

    public Student() {
        int upperCaseA = 65, oneBeyondUpperCaseZ = 91,
                numberOfFirstNames = firstNames.length, numberOfCourses = courses.length;
        int lastNameIndex = random.nextInt(oneBeyondUpperCaseZ - upperCaseA) + upperCaseA;
        name = firstNames[random.nextInt(numberOfFirstNames)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(numberOfCourses)];
        yearStarted = random.nextInt(lastYear - firstYear) + firstYear;
    }
}
