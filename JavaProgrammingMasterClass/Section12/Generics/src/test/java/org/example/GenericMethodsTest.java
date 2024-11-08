package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericMethodsTest {

    private <T extends StudentModel> String genericPrintListVersionOne(List<T> students) {
        /*
            <T extends StudentModel> sets an upperbound on the type, allowing StudentModel and any subclass of
            StudentModel
        */
        String output = "";
        for(var student : students) {
            output = output.concat(student.toStringWithCarriageReturn());
        }
        return output;
    }

    private StudentModel[] studentModels = new StudentModel[10];

    @BeforeEach
    public void setUp() {
        for(int index = 0; index < studentModels.length; index++) {
            if (index % 2 == 0) {
                studentModels[index] = new StudentModel();
            } else {
                studentModels[index] = new LPAStudent();
            }
        }
    }

    @Test
    public void testStudentModel() {
        String listOfStudentsString = genericPrintListVersionOne(Arrays.asList(studentModels));
        List<String> listOfStudents = Arrays.asList(listOfStudentsString.split("\n"));
        for(int index = 0; index < listOfStudents.size(); index++) {
            String studentString = listOfStudents.get(index);
            boolean studentModelCheck = studentString.contains("StudentModel") && !studentString.contains("LPAStudent");
            boolean LPAStudentCheck = studentString.contains("StudentModel") && studentString.contains("LPAStudent");
            if (index % 2 == 0) {
                assertTrue(studentModelCheck);
            } else {
                assertTrue(LPAStudentCheck);
            }
        }
    }
}
