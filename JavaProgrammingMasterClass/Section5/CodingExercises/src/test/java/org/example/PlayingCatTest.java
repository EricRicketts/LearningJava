package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayingCatTest {

    @Test
    public void testSummerAndTenDegrees() {
        Assertions.assertFalse(
                PlayingCat.isCatPlaying(true, 10)
        );
    }

    @Test
    public void testNoSummerAndThirtySixDegrees() {
        Assertions.assertFalse(
                PlayingCat.isCatPlaying(false, 36)
        );
    }

    @Test
    public void testNoSummerAndThirtyFiveDegrees() {
        Assertions.assertTrue(
                PlayingCat.isCatPlaying(false, 35)
        );
    }

    @Test
    public void testNoSummerAndTwentyFiveDegrees() {
        Assertions.assertTrue(
                PlayingCat.isCatPlaying(false, 25)
        );
    }

    @Test
    public void testSummerAndTwentyFiveDegrees() {
        Assertions.assertTrue(
                PlayingCat.isCatPlaying(true, 25)
        );
    }

    @Test
    public void testNoSummerAndTwentyFourDegrees() {
        Assertions.assertFalse(
                PlayingCat.isCatPlaying(false, 24)
        );
    }

    @Test
    public void testSummerAndTwentyFourDegrees() {
        Assertions.assertFalse(
                PlayingCat.isCatPlaying(true, 24)
        );
    }

    @Test
    public void testSummerAndFortySixDegrees() {
        Assertions.assertFalse(
                PlayingCat.isCatPlaying(true, 46)
        );
    }

    @Test
    public void testSummerAndFortyFiveDegrees() {
        Assertions.assertTrue(
                PlayingCat.isCatPlaying(true, 45)
        );
    }

    @Test
    public void testCourseData() {
        List<Boolean> isSummerList = new ArrayList<>(Arrays.asList(
                true, true, false, true,
                true, true, false, false,
                true, false, true, false,
                true, true, false, false,
                true
            )
        );
        List<Integer> ageList = new ArrayList<>(Arrays.asList(
                10, 33, 25, 25,
                45, 46, 45, 46,
                50, 36, 36, 35,
                35, 24, 24, -24,
                30
            )
        );
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, true, true, true,
                true, false, false, false,
                false, false, true, true,
                true, false, false, false,
                true
            )
        );

        for (int index = 0; index < results.size(); index++) {
            boolean isSummer = isSummerList.get(index);
            int age = ageList.get(index);
            boolean result = results.get(index);

            Assertions.assertEquals(
                    result,
                    PlayingCat.isCatPlaying(isSummer, age)
            );
        }
    }
}
