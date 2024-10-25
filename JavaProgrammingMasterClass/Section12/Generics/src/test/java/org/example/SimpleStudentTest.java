package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleStudentTest {

    @Test
    public void testSimpleStudentWithComparable() {
        SimpleStudent student = new SimpleStudent("Tim");
        SimpleStudent[] students = {
                new SimpleStudent("Zach"),
                new SimpleStudent("Tim"),
                new SimpleStudent("Ann")
        };
        Integer[] expected = {-6, 0, 19};
        for(int index = 0; index < students.length; index++) {
            assertEquals(expected[index], student.compareTo(students[index]));
        }
    }
}
