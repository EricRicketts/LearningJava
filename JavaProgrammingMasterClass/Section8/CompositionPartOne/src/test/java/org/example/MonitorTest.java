package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonitorTest {

    Monitor monitor;

    @BeforeEach
    public void setUp() {
        monitor = new Monitor("XR30", "ACME");
    }

    @Test
    public void testDefaultResolution() {
        // Non initialized object (like String) defaults to Null
        Assertions.assertNull(monitor.getResolution());
    }

    @Test
    public void testDrawPixelAt() {
        String expected = "Drawing pixel at 3, 4, in color red.";
        String result = monitor.drawPixelAt(3, 4, "red");
        Assertions.assertEquals(expected, result);
    }
}
