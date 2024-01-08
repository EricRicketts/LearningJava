package org.example;

import jdk.jfr.BooleanFlag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotherBoardTest {

    MotherBoard motherBoard;

    @BeforeEach
    public void setUp() {
        motherBoard = new MotherBoard("XR30", "ACME", 4, 8, "IBM");
    }

    @Test
    public void testLoadProgram() {
        String expected = "Program Foobar is now loading ...";
        String result = motherBoard.loadProgram("Foobar");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSlotsAndBios() {
        Assertions.assertEquals(4, motherBoard.getRamSlots());
        Assertions.assertEquals(8, motherBoard.getCardSlots());
        Assertions.assertEquals("IBM", motherBoard.getBios());
    }
}
