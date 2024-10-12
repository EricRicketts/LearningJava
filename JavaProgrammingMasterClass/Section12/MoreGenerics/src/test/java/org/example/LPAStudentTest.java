package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LPAStudentTest {
    private int numberOfStudents = 3;
    private LPAStudent[] lpaStudents = new LPAStudent[numberOfStudents];
    private List<String> lpaStudentFirstNames = Arrays.asList(LPAStudent.getFirstNames());
    private List<String> courseNames = Arrays.asList(LPAStudent.getCourses());
    private List<String> lastNameInitials = new ArrayList<>();
    @BeforeEach
    public void setUp() {
        for (int index = 0; index < numberOfStudents; index++) lpaStudents[index] = new LPAStudent();
        for (char initial = 'A'; initial <= 'Z'; initial++) {
            String capitalLetter = Character.toString(initial);
            lastNameInitials.add(capitalLetter);
        }
    }

    @Test
    public void testGetCoursePercentComplete() {
        for (var lpaStudent : lpaStudents) {
            BigDecimal percentComplete = lpaStudent.getPercentComplete();
            int valueLessThan = percentComplete.compareTo(new BigDecimal(100.00));
            int valueGreaterThan = percentComplete.compareTo(new BigDecimal(0.00));
            Assertions.assertTrue(valueGreaterThan == 1 && valueLessThan == -1);
        }
    }
}
