package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StudentTest {

    String expected, results;
    private Student tim, zak, april;
    private Student[] students;
    private StudentGPAComparator studentGPAComparator;
    private boolean compareToOtherGPAs;

    @BeforeEach
    public void setUp() {
        tim = new Student("Tim");
        zak = new Student("Zak");
        april = new Student("April");
        students = new Student[]{zak, tim, april};
        studentGPAComparator = new StudentGPAComparator();
    }

    @Test
    public void testSortByComparatorAscending() {
        Arrays.sort(students, studentGPAComparator);
        double lowestGPA = students[0].getGpa();
        compareToOtherGPAs = lowestGPA < students[1].getGpa() && lowestGPA < students[2].getGpa();
        Assertions.assertTrue(compareToOtherGPAs);
    }

    @Test
    public void testSortByComparatorDescending() {
        Arrays.sort(students, studentGPAComparator.reversed());
        double highestGPA = students[0].getGpa();
        compareToOtherGPAs = highestGPA > students[1].getGpa() && highestGPA > students[2].getGpa();
        Assertions.assertTrue(compareToOtherGPAs);
    }
}
