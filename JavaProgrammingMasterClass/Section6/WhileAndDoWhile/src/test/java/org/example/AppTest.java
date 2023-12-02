package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void testDifferentLoops() {
        List<List<Integer>> loopLists = App.compareLoops(5);
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        for (int index = 0; index < loopLists.size(); index++) {
            List<Integer> list = loopLists.get(index);
            Assertions.assertEquals(
                    expected,
                    list
            );
        }
    }

    @Test
    public void testIncrementByFiveSkipMultiplesOfTwentyFive() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 30, 35, 40, 45, 55, 60
        ));
        List<Integer> list = App.multiplesOfFive(60);
        Assertions.assertEquals(expected, list);
    }
}
