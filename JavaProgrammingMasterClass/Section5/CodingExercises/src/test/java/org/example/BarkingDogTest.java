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
}
