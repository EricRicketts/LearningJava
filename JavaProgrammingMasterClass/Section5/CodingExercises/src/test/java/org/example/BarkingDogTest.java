package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarkingDogTest {

    @Test
    public void testDogBarkingBeforeEightAM() {
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 1));
    }

    @Test
    public void testDogNotBarkingBeforeEightAM() {
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 2));
    }

    @Test
    public void testDogShouldNotBark() {
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 8));
    }

    @Test
    public void testInvalidTimeInput() {
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, -1));
    }

    @Test
    public void testCasesFromCourse() {
        boolean[] firstArgumentValues = new boolean[]{
                false, true, false, true, false, true,
                true, true, true, true, true
        };
        int[] secondArgumentValues = new int[]{-5, -1, 24, 44, 6, 4, 23, 22, 8, 7, 0};
        boolean[] answers = new boolean[]{
                false, false, false, false, false, true,
                true, false, false, true, true
        };
        for (int index = 0; index < answers.length; index++) {
            boolean firstArgumentValue = firstArgumentValues[index];
            int secondArgumentValue = secondArgumentValues[index];
            boolean answer = answers[index];
            Assertions.assertEquals(
                answer, BarkingDog.shouldWakeUp(firstArgumentValue, secondArgumentValue)
            );
        }
    }
}
