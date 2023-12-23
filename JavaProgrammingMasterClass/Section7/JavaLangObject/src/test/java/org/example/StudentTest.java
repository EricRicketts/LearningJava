package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {

    private Student student;
    private PrimaryStudent primaryStudent;
    private String result;

    @BeforeEach
    public void setUp() {
        student = new Student("Elmer Fudd", 35);
        primaryStudent = new PrimaryStudent("Bugs Bunny", 25, "Older Bunny");
    }

    @Test
    public void testStudentToString() {
        result = student.toString();
        Assertions.assertTrue(result.contains("org.example.Student@"));
        Assertions.assertTrue(result.contains("""
                Student{name='Elmer Fudd', age=35}"""));
        Assertions.assertTrue(result.matches(".*Student@[a-z0-9]+\\s+Student.*"));
        // last assertions matches any combination of the address after @ which seems to
        // be a hexadecimal number.
    }

    @Test
    public void testPrimaryStudentToString() {
        result = primaryStudent.toString();
        String firstPattern = "PrimaryStudent\\{parentName='Older Bunny'}";
        String secondPattern = "org\\.example\\.PrimaryStudent@[a-z0-9]+";
        String thirdPattern = "PrimaryStudent\\{name='Bugs Bunny', age=25}";
        String pattern = firstPattern + "\\s" + secondPattern + "\\s" + thirdPattern;

        Assertions.assertTrue(result.matches(pattern));
    }
}
