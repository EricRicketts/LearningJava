package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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
    }

}
