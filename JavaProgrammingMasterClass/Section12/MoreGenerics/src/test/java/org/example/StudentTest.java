package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

    private int numberOfStudents = 3;
    private Student[] students = new Student[numberOfStudents];
    private List<String> studentFirstNames = Arrays.asList(Student.getFirstNames());
    
    @BeforeEach
    public void setUp() {
        for (int index = 0; index < numberOfStudents; index++) students[index] = new Student();
    }

    @Test
    public void testStudentNames() {
        for (int index = 0; index < numberOfStudents; index++) {
            Student student = students[index];
            String[] firstNameAndInitial = student.getName().split("\\s+");
            String firstName = firstNameAndInitial[0];
            Assertions.assertTrue(studentFirstNames.contains(firstName));
        }
    }
}
