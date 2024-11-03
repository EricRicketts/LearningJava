package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentModelTest {

    private static final String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static final String[] courses = {"C++", "Java", "Python"};
    private static final String[] years = {"2018", "2019", "2020", "2021", "2022"};

    private String[] individualStudentModels;

    private String printStudentModels(List<StudentModel> studentModels) {
        String studentModelsOutput = "";
        for(var studentModel : studentModels) {
            studentModelsOutput = studentModelsOutput.concat(studentModel.toString() + "\n");
        }

        return studentModelsOutput;
    }

    private String[] parseStudentModel(String studentModelString) {
        studentModelString = studentModelString.replaceAll("(StudentModel)|'|\\{|}", "");
        return studentModelString.split(",");
    }

    private String parseStudentModelComponent(String studentModelComponent) {
        String separator = "=";
        int indexOfSeparator = studentModelComponent.indexOf(separator);
        return studentModelComponent.substring(indexOfSeparator + 1);
    }

    @BeforeEach
    public void setUp() {
        int studentCount = 10;
        List<StudentModel> studentModels = new ArrayList<>();
        for(int index = 0; index < studentCount; index++) studentModels.add(new StudentModel());
        String actual = printStudentModels(studentModels);
        individualStudentModels = actual.split("\n");
    }

    @Test
    public void testNamesOfStudentModels() {
        for(String individualStudentModel : individualStudentModels) {
            String[] parsedStudentModelElements = parseStudentModel(individualStudentModel);
            String studentModelName = parseStudentModelComponent(parsedStudentModelElements[0]);
            String[] firstAndLastNameInitial = studentModelName.split(" ");
            String firstName = firstAndLastNameInitial[0];
            String lastNameInitial = firstAndLastNameInitial[1];

            boolean firstNameAndLastNameInitialCheck =
                    Arrays.asList(firstNames).contains(firstName) && lastNameInitial.matches("[A-Z]");
            assertTrue(firstNameAndLastNameInitialCheck);
        }
    }

    @Test
    public void testCoursesOfStudentModels() {
        for(String individualStudentModel : individualStudentModels) {
            String[] parsedStudentModelElements = parseStudentModel(individualStudentModel);
            String course = parseStudentModelComponent(parsedStudentModelElements[1]);

            assertTrue(Arrays.asList(courses).contains(course));
        }
    }

    @Test
    public void testYearsOfStudentModels() {
        for(String individualStudentModel : individualStudentModels) {
            String[] parsedStudentModelElements = parseStudentModel(individualStudentModel);
            String year = parseStudentModelComponent(parsedStudentModelElements[2]);

            assertTrue(Arrays.asList(years).contains(year));
        }
    }
}
