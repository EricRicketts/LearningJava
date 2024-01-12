package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class BedTest {

    Bed bed;

    @BeforeEach
    public void setUp() {
        bed = new Bed("King", 2, 30, 2, 1);
    }

    @Test
    public void testMakeBed() throws Exception {
        String text = tapSystemOut(() -> {
            bed.make();
        });
        Assertions.assertEquals("Making the bed.", text.trim());
    }

    @Test
    public void testGetStyle() {
        Assertions.assertEquals("King", bed.getStyle());
    }

    @Test
    public void testGetPillows() {
        Assertions.assertEquals(2, bed.getPillows());
    }

    @Test
    public void testGetHeight() {
        Assertions.assertEquals(30, bed.getHeight());
    }

    @Test
    public void testGetSheets() {
        Assertions.assertEquals(2, bed.getSheets());
    }

    @Test
    public void testGetQuilt() {
        Assertions.assertEquals(1, bed.getQuilt());
    }
}
