package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueryListTest {

    private QueryList<?> queryListOne, queryListTwo;
    private List<?> matches;
    StudentModel[] studentModels = new StudentModel[20];
    LPAStudent[] lpaStudents = new LPAStudent[20];

    @BeforeEach
    public void setUp() {
    for(int index = 0; index < studentModels.length; index++) {
        studentModels[index] = new StudentModel();
        lpaStudents[index] = new LPAStudent();
    }
        queryListOne = new QueryList<>(Arrays.asList(studentModels));
        queryListTwo = new QueryList<>(Arrays.asList(lpaStudents));
    }

    @Test
    public void testGetMatchesStudentModelCheckName() {
        matches = queryListOne.getMatches("Course", "Python");
        if (!matches.isEmpty()) {
            for(var match : matches) {
                String fullName = ((StudentModel) match).getName();
                String[] names = fullName.split(" ");
                String firstName = names[0];
                String lastNameInitial = names[1];
                boolean checkFirstName = Arrays.asList(StudentModel.getFirstNames()).contains(firstName);
                assertTrue(checkFirstName);
                boolean checkLastNameInitial =
                        lastNameInitial.compareTo("A") >= 0 && lastNameInitial.compareTo("Z") <= 0;
                assertTrue(checkLastNameInitial);
            }
        }
    }

    @Test
    public void testGetMatchesLPAStudentCheckName() {
        matches = queryListTwo.getMatches("Course", "C++");
        if (!matches.isEmpty()) {
            for(var match : matches) {
                String fullName = ((StudentModel) match).getName();
                String[] names = fullName.split(" ");
                String firstName = names[0];
                String lastNameInitial = names[1];
                boolean checkFirstName = Arrays.asList(StudentModel.getFirstNames()).contains(firstName);
                assertTrue(checkFirstName);
                boolean checkLastNameInitial =
                        lastNameInitial.compareTo("A") >= 0 && lastNameInitial.compareTo("Z") <= 0;
                assertTrue(checkLastNameInitial);
            }
        }
    }

    @Test
    public void testGetMatchesStudentModelCheckCourse() {
        // provides a list of 20 objects, keys are name, course,a nd yearStarted
         matches = queryListOne.getMatches("Name", "Cathy B");
         for(var match : matches) {
             String course = ((StudentModel) match).getCourse();
             boolean checkCourse = Arrays.asList(StudentModel.getCourses()).contains(course);
             assertTrue(checkCourse);
         }
    }

    @Test
    public void testGetMatchesStudentModelCheckYearStarted() {
        matches = queryListOne.getMatches("yearStarted", "2019");
        for(var match: matches) {
            // getYearStarted returns an int
            int yearStarted = ((StudentModel) match).getYearStarted();
            boolean checkYearStarted = yearStarted >= 2018 && yearStarted <= 2022;
            assertTrue(checkYearStarted);
        }
    }

    @Test
    public void testGetMatchesWithPassedInList() {
        var matches2021 = QueryList.getMatches(Arrays.asList(studentModels), "yearStarted", "2021");
        var matches2019 = QueryList.<StudentModel>getMatches(new ArrayList<>(), "yearStarted", "2019");
        int five = 5;
        if (!matches2021.isEmpty()) {
            for(var match : matches2021) {
                assertEquals(2021, match.getYearStarted());
            }
        }
        assertTrue(matches2019.isEmpty());
    }
}
