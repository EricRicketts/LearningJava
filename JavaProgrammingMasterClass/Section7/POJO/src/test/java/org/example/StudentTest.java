package org.example;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentTest {

    private Student student;
    private String expected;

    @BeforeEach
    public void setUp() {
        student = new Student(
                "xyz123", "Elmer Fudd",
                "12/20/2023", "Java Masterclass"
        );
    }

    @Test
    public void testToStringMethod() {
        expected = "Student{id=\'xyz123\', name=\'Elmer Fudd\'," +
                " dateOfBirth=\'12/20/2023\', classList=\'Java Masterclass\'}";
        Assertions.assertEquals(
                expected,
                student.toString()
        );
    }

    @Test
    public void testStudentId() {
        Assertions.assertEquals("xyz123", student.getId());
        String newId = "123xyz";
        student.setId(newId);
        Assertions.assertEquals(newId, student.getId());
    }

    @Test
    public void testStudentName() {
        Assertions.assertEquals("Elmer Fudd", student.getName());
        String newName = "Bugs Bunny";
        student.setName(newName);
        Assertions.assertEquals(newName, student.getName());
    }

    @Test
    public void testStudentDateOfBirth() {
        Assertions.assertEquals("12/20/2023", student.getDateOfBirth());
        String newDateOfBirth = "11/20/1960";
        student.setDateOfBirth(newDateOfBirth);
        Assertions.assertEquals(newDateOfBirth, student.getDateOfBirth());
    }

    @Test
    public void testStudentClassList() {
        Assertions.assertEquals("Java Masterclass", student.getClassList());
        String newClassList = "Java Spring";
        student.setClassList(newClassList);
        Assertions.assertEquals(newClassList, student.getClassList());
    }
}
