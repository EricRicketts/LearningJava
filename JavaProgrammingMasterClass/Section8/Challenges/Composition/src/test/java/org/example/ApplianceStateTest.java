package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApplianceStateTest {

    ApplianceState applianceState;

    @BeforeEach
    public void setUp() {
        applianceState = new ApplianceState();
    }

    @Test
    public void testHasWorkToDoIsTrue() {
        applianceState.setHasWorkToDo(true);
        Assertions.assertTrue(applianceState.isHasWorkToDo());
    }

    @Test
    public void testHasWorkToDoIsFalse() {
        applianceState.setHasWorkToDo(false);
        Assertions.assertFalse(applianceState.isHasWorkToDo());
    }
}
