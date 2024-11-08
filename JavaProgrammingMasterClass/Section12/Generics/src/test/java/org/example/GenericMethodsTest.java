package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericMethodsTest {
    /*
        private static String testList(List<String> list) {
            output = ";
            for(var element: list) {
                output = output.concat("String: " + element.toUpperCase() + "\n");
            }
            return output;
        }

        private static String testList(List<Integer> list) {
            output = ";
            for(var element: list) {
                output = output.concat("Integer: " + element.floatValue() + "\n");
            }
            return output;
        }

        we cannot overload in this case because both methods have the same "erasure".  If an Integer is passed in
        or a String for that matter and no upperbound is specified as is the case, then both classes will resolve
        to the parent, which in this case is Object.  Since both methods resolve to the same parent class they
        cannot be distinguished from one another.  This will be a compile error.
    */
    private static String testList(List<?> list) {
        String output = "";
        for(var element : list) {
            if(element instanceof String) {
                output = output.concat("String: " + ((String) element).toUpperCase() + "\n");
            } else if (element instanceof Integer) {
                output = output.concat("Integer: " + ((Integer) element).floatValue() + "\n");
            }
        }
        return output;
    }

    private <T extends StudentModel> String genericPrintListVersionOne(List<T> students) {
        /*
            <T extends StudentModel> sets an upperbound on the type, allowing StudentModel and any subclass of
            StudentModel.  Thus, we can call all methods available to the parent class and the subclass within
            this method.
        */
        String output = "";
        for(var student : students) {
            output = output.concat(student.toStringWithCarriageReturn());
        }
        return output;
    }

    private String genericPrintListVersionTwo(List<? extends StudentModel> students) {
        /*
            <? extends StudentModel> sets an upperbound on the type, allowing StudentModel and any subclass of
            StudentModel.  Thus, we can call all methods available to the parent class and the subclass within
            this method.
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
    public void testStudentModelPrintVersionOne() {
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

    @Test
    public void testStudentModelPrintVersionTwo() {
        String listOfStudentsString = genericPrintListVersionTwo(Arrays.asList(studentModels));
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
