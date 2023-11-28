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
        List<Integer> inputs = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<String> results = new ArrayList<>(Arrays.asList(
                "value is 1", "value is 2", "value is neither 1 or 2"
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