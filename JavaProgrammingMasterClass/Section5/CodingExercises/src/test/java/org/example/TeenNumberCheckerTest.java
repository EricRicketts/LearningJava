package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.TeenNumberChecker.isTeen;

public class TeenNumberCheckerTest {

    @Test
    public void testProblemDataForHasTeen() {
        int numberOfAges = 3;
        List<Integer> firstAges = new ArrayList<>(Arrays.asList(9, 99, 19));
        List<Integer> secondAges = new ArrayList<>(Arrays.asList(23, 15, 42));
        List<Integer> thirdAges = new ArrayList<>(Arrays.asList(22, 23, 34));
        List<List<Integer>> allAges = new ArrayList<>(Arrays.asList(firstAges, secondAges, thirdAges));
        List<Boolean> results = new ArrayList<>(Arrays.asList(true, true, false));

        for (int index = 0; index < numberOfAges; index++) {
            List<Integer> ages = allAges.get(index);
            Boolean result = results.get(index);

            Assertions.assertEquals(
                result, TeenNumberChecker.hasTeen(ages.get(0), ages.get(1), ages.get(2))
            );
        }
    }

    @Test
    public void testProblemDataForIsTeen() {
        Assertions.assertFalse(isTeen(9));
        Assertions.assertTrue(isTeen(13));
    }

    @Test
    public void testCasesFromCourseForIsTeen() {
        List<Integer> ages = new ArrayList<>(Arrays.asList(
                7, 11, 12, 13,
                14, 15, 16, 17,
                18, 19, 20, 21,
                22, 36, 122, 54,
                0, -1, -2, -3
            )
        );
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, true,
                true, true, true, true,
                true, true, false, false,
                false, false, false, false,
                false, false, false, false
            )
        );
        for (int index = 0; index < ages.size(); index++) {
            Integer age = ages.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                result,
                TeenNumberChecker.isTeen(age)
            );
        }
    }

    @Test
    public void testCasesFromCourseForHasTeen() {
        List<List<Integer>> allAges = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 0, 0), Arrays.asList(0, 0, -1), Arrays.asList(0, -1, 0),
                Arrays.asList(0, -1, -1), Arrays.asList(-1, 0, 0), Arrays.asList(-1, 0, -1),
                Arrays.asList(-1, -1, 0), Arrays.asList(-1, -1, -1), Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, -5), Arrays.asList(0, -5, 0), Arrays.asList(0, -5, -5),
                Arrays.asList(-5, 0, 0), Arrays.asList(-5, 0, -5), Arrays.asList(-5, -5, 0),
                Arrays.asList(-5, -5, -5), Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 12), Arrays.asList(0, 12, 0)
            )
        );
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false,
                false, false, false,
                false, false, false,
                false, false, false,
                false, false, false,
                false, false, false,
                false, false, false,
                false, false, false,
                false, false, false
            )
        );
        for (int index = 0; index < allAges.size(); index++) {
            Integer firstAgeIndex = 0, secondAgeIndex = 1, thirdAgeIndex = 2;
            List<Integer> ages = allAges.get(index);
            Integer firstAge = ages.get(firstAgeIndex);
            Integer secondAge = ages.get(secondAgeIndex);
            Integer thirdAge = ages.get(thirdAgeIndex);
            boolean result = results.get(index);
            Assertions.assertEquals(
                result, TeenNumberChecker.hasTeen(firstAge, secondAge, thirdAge)
            );
        }
    }
}
