package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlourPackerTest {

    @Test
    public void testOneNegativeInput() {
        Assertions.assertFalse(FlourPacker.canPack(-3, 2, 12));
    }

    @Test
    public void testTooSmallToBeginWith() {
        Assertions.assertFalse(FlourPacker.canPack(2, 2, 13));
    }

    @Test
    public void testOneBigCountFalse() {
        Assertions.assertFalse(FlourPacker.canPack(1, 0, 4));
    }

    @Test
    public void testOneBigCountTrue() {
        Assertions.assertTrue(FlourPacker.canPack(1, 0, 5));
    }

    @Test
    public void testOneSmallBagLeftOver() {
        Assertions.assertTrue(FlourPacker.canPack(0, 5, 4));
    }

    @Test
    public void testTWoBigBagsTwoSmallBagsGoalOfEleven() {
        Assertions.assertTrue(FlourPacker.canPack(2, 2, 11));
    }

    @Test
    public void testTwoBigCountZeroSmallCountGoalOfNine() {
        Assertions.assertFalse(FlourPacker.canPack(2, 0, 9));
    }

    @Test
    public void testTwoBigCountFiveSmallCountGoalOfNine() {
        Assertions.assertTrue(FlourPacker.canPack(2, 5, 9));
    }

    @Test
    public void testOneBigCountFiveSmallCountGoalOfNine() {
        Assertions.assertTrue(FlourPacker.canPack(1, 5, 9));
    }

    @Test
    public void testCourseData() {
        List<Integer> bigCountList = new ArrayList<>(Arrays.asList(
                1, 1, 1, 0, 0,
                0, -3, 3, 3, 3,
                2, 2, 2, 5, 2,
                2, 2, 2, 2, 4,
                6
        ));
        List<Integer> smallCountList = new ArrayList<>(Arrays.asList(
                0, 0, 0, 5, 5,
                5, 2, -2, 2, 0,
                2, 1, 1, 3, 7,
                10, 10, 10, 10, 18,
                2
        ));
        List<Integer> goalList = new ArrayList<>(Arrays.asList(
                4, 5, 6, 4, 5,
                6, 12, 12, -12, 15,
                12, 12, 5, 24, 18,
                18, 19, 20, 21, 19,
                17
        ));
        List<Boolean> answersList = new ArrayList<>(Arrays.asList(
                false, true, false, true, true,
                false, false, false, false, true,
                true, false, true, false, false,
                true, true, true, false, true,
                true
        ));
        for (int index = 0; index < answersList.size(); index++) {
            int bigCount = bigCountList.get(index);
            int smallCount = smallCountList.get(index);
            int goal = goalList.get(index);
            boolean answer = answersList.get(index);
            Assertions.assertEquals(
                    answer,
                    FlourPacker.canPack(bigCount, smallCount, goal)
            );
        }
    }

}
