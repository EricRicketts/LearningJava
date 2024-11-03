package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericMethodsTest {

    private <T extends StudentModel> String genericPrintListOne(List<T> students) {
        String output = "";
        for(var student : students) {
            output = student.getYearStarted() + ":" + student.toString();
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
        for(int index = 0; index < studentModels.length; index++) {
            StudentModel studentModel = studentModels[index];
            String studentModelString = studentModel.toString();
            boolean checkStudentModel =
                    studentModelString.contains("StudentModel") && !studentModelString.contains("LPAStudent");
            boolean checkLPAStudent =
                    studentModelString.contains("LPAStudent") && studentModelString.contains("StudentModel");
            if(index % 2 == 0) {
                assertTrue(checkStudentModel);
            } else {
                assertTrue(checkLPAStudent);
            }
        }
    }
}
