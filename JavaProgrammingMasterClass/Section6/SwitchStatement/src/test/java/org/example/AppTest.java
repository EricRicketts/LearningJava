package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void testInstructorExample() {
        List<Integer> inputs = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<String> results = new ArrayList<>(Arrays.asList(
                "value is 1", "value is 2", "case testing for 3, 4, or 5 on one line.  Value is 3",
                "case testing for 3, 4, or 5 on one line.  Value is 4",
                "case testing for 3, 4, or 5 on one line.  Value is 5",
                "value is not 1, 2, 3, 4, or 5"
                )
        );
        for (int index = 0; index < inputs.size(); index++) {
            int input = inputs.get(index);
            String result = results.get(index);
            Assertions.assertEquals(
                    result,
                    App.firstSwitchStatement(input)
            );
        }
        for (int index = 0; index < inputs.size(); index++) {
            int input = inputs.get(index);
            String result = results.get(index);
            Assertions.assertEquals(
                    result,
                    App.secondSwitchStatement(input)
            );
        }
    }

    @Test
    public void testGetQuarter() {
        List<String> inputs = new ArrayList<>(Arrays.asList(
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December",
                "Foo Bar"
            )
        );

        List<String> results = new ArrayList<>(Arrays.asList(
                "1st quarter", "1st quarter", "1st quarter",
                "2nd quarter", "2nd quarter", "2nd quarter",
                "3rd quarter", "3rd quarter", "3rd quarter",
                "4th quarter", "4th quarter", "4th quarter",
                "Invalid entry"
            )
        );

        for (int index = 0; index < inputs.size(); index++) {
            String input = inputs.get(index);
            String result = results.get(index);
            Assertions.assertEquals(
                    result,
                    App.getQuarterTraditional(input)
            );
            Assertions.assertEquals(
                    result,
                    App.getQuarterEnhanced(input)
            );
        }
    }

    @Test
    public void testNatoPhonetics() {
        List<Character> inputs = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
        List<String> results = new ArrayList<>(Arrays.asList(
                "Able", "Baker", "Charlie", "Dog", "Easy", "Not Found"
            )
        );

        for (int index = 0; index < inputs.size(); index++) {
            Character input = inputs.get(index);
            String result = results.get(index);
            Assertions.assertEquals(
                    result,
                    App.getNatoPhonetic(input)
            );
        }
    }

    @Test
    public void testDayOfWeek() {
        List<Integer> days = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        List<String> daysOfWeek = new ArrayList<>(Arrays.asList(
                "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Invalid Day"
            )
        );

        for (int index = 0; index < days.size(); index++) {
            int day = days.get(index);
            String dayOfWeek = daysOfWeek.get(index);
            Assertions.assertEquals(
                    dayOfWeek,
                    App.printDayOfWeek(day)
            );
            Assertions.assertEquals(
                    dayOfWeek,
                    App.printDayOfWeekUsingIfElse(day)
            );
        }
    }
}