package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LampTest {

    private Lamp lamp;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        lamp = new Lamp("Arc", true, 800);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testTurnOn() {
        String expected = "The lamp is being turned on.";
        lamp.turnOn();
        Assertions.assertEquals(expected, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testGetStyle() {
        Assertions.assertEquals("Arc", lamp.getStyle());
    }

    @Test
    public void testIsBattery() {
        Assertions.assertTrue(lamp.isBattery());
    }

    @Test
    public void testGetGlobRating() {
        Assertions.assertEquals(800, lamp.getGlobRating());
    }
}
