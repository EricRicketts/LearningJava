package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentModelTest {

    private static final String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static final String[] courses = {"C++", "Java", "Python"};
    private static final String[] years = {"2018", "2019", "2020", "2021", "2022"};

    private String[] individualStudentModels;
    List<StudentModel> students = new ArrayList<>();

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
        return studentModelComponent.substring(indexOfSeparator + 1).trim();
    }

    @BeforeEach
    public void setUp() {
        int studentCount = 10;
        List<StudentModel> studentModels = new ArrayList<>();
        for(int index = 0; index < studentCount; index++) studentModels.add(new StudentModel());
        String actual = printStudentModels(studentModels);
        individualStudentModels = actual.split("\n");
        for (int index = 0; index < 25; index++) students.add(new StudentModel());
    }

    @Test
    public void testNamesOfStudentModels() {
        for(String individualStudentModel : individualStudentModels) {
            String[] parsedStudentModelElements = parseStudentModel(individualStudentModel);
            String studentModelName = parseStudentModelComponent(parsedStudentModelElements[1]);
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
            String course = parseStudentModelComponent(parsedStudentModelElements[2]);

            assertTrue(Arrays.asList(courses).contains(course));
        }
    }

    @Test
    public void testYearsOfStudentModels() {
        for(String individualStudentModel : individualStudentModels) {
            String[] parsedStudentModelElements = parseStudentModel(individualStudentModel);
            String year = parseStudentModelComponent(parsedStudentModelElements[3]);

            assertTrue(Arrays.asList(years).contains(year));
        }
    }

    @Test
    public void testSetAndGetStudentID() {
        StudentModel student = new StudentModel();
        assertTrue(student.getStudentID() >= 1000);
        student.setStudentID(50);
        assertEquals(50, student.getStudentID());
    }

    @Test
    public void testSortByStudentID() {
        Collections.reverse(students);
        /*
            Students are initialized in studentID order from low to high, so a sort would return the same list.
            Reversing the list should sort the list from high to low, the test right after the sort proves this.
            Then the list can be sorted and the following test proves the list is sorted by studentID from low
            to high.
        */
        for (int index = 0; index < students.size() - 1; index++) {
            assertTrue(students.get(index).getStudentID() > students.get(index + 1).getStudentID());
        }
        Collections.sort(students);
        for (int index = 0; index < students.size() - 1; index++) {
            assertTrue(students.get(index).getStudentID() < students.get(index + 1).getStudentID());
        }
    }

    @Test
    public void testSortByComparator() {
        Collections.reverse(students);
        for (int index = 0; index < students.size() - 1; index++) {
            assertTrue(students.get(index).getStudentID() > students.get(index + 1).getStudentID());
        }
        students.sort(Comparator.naturalOrder());
        for (int index = 0; index < students.size() - 1; index++) {
            assertTrue(students.get(index).getStudentID() < students.get(index + 1).getStudentID());
        }
    }
}
