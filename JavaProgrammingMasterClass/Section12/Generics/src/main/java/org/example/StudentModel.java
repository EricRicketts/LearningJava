package org.example;

import java.util.Arrays;
import java.util.Random;

public class StudentModel implements QueryItem, Comparable<StudentModel> {

    private static int LAST_ID = 10_000;
    private int studentID;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static final String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static final String[] courses = {"C++", "Java", "Python"};

    public StudentModel() {
        studentID = LAST_ID++;
        int largestChar = 67; // restrict testing to A, B, and C to ensure matches
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
                "id = '" + studentID + '\'' +
                ", name= '" + name + '\'' +
                ", course= '" + course + '\'' +
                ", yearStarted= " + yearStarted +
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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        boolean selectFieldValue = false;
        switch(fName) {
            case "NAME":
                String[] firstAndLastNameInitial = value.split(" ");
                String firstName = firstAndLastNameInitial[0];
                String lastNameInitial = firstAndLastNameInitial[1];
                boolean firstNameCheck = Arrays.asList(firstNames).contains(firstName);
                boolean lastNameCheck = lastNameInitial.compareTo("A") >= 0 && lastNameInitial.compareTo("Z") <= 0;
                selectFieldValue = firstNameCheck && lastNameCheck;
                break;
            case "COURSE":
                selectFieldValue = this.getCourse().equalsIgnoreCase(value);
                break;
            case "YEARSTARTED":
                selectFieldValue = this.getYearStarted() == (Integer.parseInt(value));
                break;
            default:
                selectFieldValue = false;
                break;
        };
        return selectFieldValue;
    }

    @Override
    public int compareTo(StudentModel o) {
        return Integer.compare(this.getStudentID(), o.getStudentID());
    }
}
