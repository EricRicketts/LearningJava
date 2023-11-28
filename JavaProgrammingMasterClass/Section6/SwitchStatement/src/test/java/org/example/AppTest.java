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
    }
}