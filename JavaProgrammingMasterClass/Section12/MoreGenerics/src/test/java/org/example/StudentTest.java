package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    private int numberOfStudents = 3;
    private Student[] students = new Student[numberOfStudents];
    private List<String> studentFirstNames = Arrays.asList(Student.getFirstNames());
    private List<String> courseNames = Arrays.asList(Student.getCourses());
    private List<String> lastNameInitials = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        for (int index = 0; index < numberOfStudents; index++) students[index] = new Student();
        for (char initial = 'A'; initial <= 'Z'; initial++) {
            String capitalLetter = Character.toString(initial);
            lastNameInitials.add(capitalLetter);
        }
    }

    @Test
    public void testStudentFirstNames() {
        for (int index = 0; index < numberOfStudents; index++) {
            Student student = students[index];
            String[] firstNameAndInitial = student.getName().split("\\s+");
            String firstName = firstNameAndInitial[0];
            Assertions.assertTrue(studentFirstNames.contains(firstName));
        }
    }

    @Test
    public void testStudentLastNameInitials() {
        for (int index = 0; index < numberOfStudents; index++) {
            Student student = students[index];
            String[] firstNameAndInitial = student.getName().split("\\s+");
            String initial = firstNameAndInitial[1];
            Assertions.assertTrue(lastNameInitials.contains(initial));
        }
    }

    @Test
    public void testStudentCourses() {
        for (int index = 0; index < numberOfStudents; index++) {
            Student student = students[index];
            String course = student.getCourse();
            Assertions.assertTrue(courseNames.contains(course));
        }
    }

    @Test
    public void testStudentCourseYears() {
        for (int index = 0; index < numberOfStudents; index++) {
            Student student = students[index];
            int startYearForCourse = student.getYearStarted();
            boolean courseWithinYearRange =
                    startYearForCourse >= Student.getFirstYear() &&
                            startYearForCourse <= Student.getLastYear();
            Assertions.assertTrue(courseWithinYearRange);
        }
    }

    @Test
    public void testStudentGetFirstAndLastYears() {
        int[] expected = new int[]{2018, 2023};
        int[] results = new int[]{Student.getFirstYear(), Student.getLastYear()};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testStudentGetFirstNames() {
        String[] expected = new String[]{"Ann", "Bill", "Cathy", "John", "Tim"};
        String[] results = Student.getFirstNames();
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testStudentGetCourses() {
        String[] expected = new String[]{"C++", "Java", "Python"};
        String[] results = Student.getCourses();
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testStudentGetString() {
        Student student = students[0];
        String results = student.toString();
        String[] nameCourseYear = results.split("\\s+");
        String name = nameCourseYear[0], initial = nameCourseYear[1], course = nameCourseYear[2]; int year;
        year = Integer.valueOf(nameCourseYear[3]);
        Assertions.assertTrue(Arrays.asList(Student.getFirstNames()).contains(name));
        Assertions.assertTrue(lastNameInitials.contains(initial));
        Assertions.assertTrue(Arrays.asList(Student.getCourses()).contains(course));
        Assertions.assertTrue(year >= Student.getFirstYear() && year <= Student.getLastYear());
    }
}