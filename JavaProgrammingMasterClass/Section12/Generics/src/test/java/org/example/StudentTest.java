package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        compareToOtherGPAs = lowestGPA < students[1].getGpa() && students[1].getGpa() < students[2].getGpa();
        Assertions.assertTrue(compareToOtherGPAs);
    }

    @Test
    public void testSortByComparatorDescending() {
        Arrays.sort(students, studentGPAComparator.reversed());
        double highestGPA = students[0].getGpa();
        compareToOtherGPAs = highestGPA > students[1].getGpa() && students[1].getGpa() > students[2].getGpa();
        Assertions.assertTrue(compareToOtherGPAs);
    }

    @Test
    public void testSortingWithoutRandomGPAs() {
        Student frank = new Student("Frank");
        Student april = new Student("April");
        Student ted = new Student("Ted");
        Student mary = new Student("Mary");
        frank.setGpa(2.56);
        april.setGpa(1.98);
        ted.setGpa(2.78);
        mary.setGpa(3.25);
        Student[] students = {april, frank, ted, mary};
        Arrays.sort(students, studentGPAComparator.reversed());
        String[] expected = {"Mary", "Ted", "Frank", "April"};
        for(int index = 0; index < students.length; index++) {
            assertEquals(expected[index], students[index].getName());
        }
    }
}
