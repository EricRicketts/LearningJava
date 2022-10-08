package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    String expectedString;
    int expectedInt;
    @Test
    public void testHelloMessage() {
        expectedString = "Hello World!";
        assertEquals(expectedString, Hello.message());
    }

    @Test
    public void testHelloWorldChallengeMessage() {
        expectedString = "Hello Eric!";
        String name = "Eric";
        assertEquals(expectedString, HelloWorldChallenge.message(name));
    }

    @Test
    public void testVariableChallengeIntVariable() {
        expectedInt = 5;
        assertEquals(expectedInt, VariableChallenge.intVariable());
    }
}
