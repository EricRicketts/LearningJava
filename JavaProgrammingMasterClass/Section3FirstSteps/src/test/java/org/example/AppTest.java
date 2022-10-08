package org.example;
import org.example.Hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    String expectedString;
    @Test
    public void testHelloMessage() {
        expectedString = "Hello World!";
        assertEquals(expectedString, Hello.message());
    }
}
