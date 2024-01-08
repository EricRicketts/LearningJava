package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerCaseTest {

    ComputerCase computerCase;

    @BeforeEach
    public void setUp() {
        computerCase = new ComputerCase("XR30", "ACME", "DBM310");
    }

    @Test
    public void testGetPowerSupply() {
        Assertions.assertEquals("DBM310", computerCase.getPowerSupply());
    }

    @Test
    public void testPressPowerButton() {
        String expected = "Power Button pressed.";
        String result = computerCase.pressPowerButton();
        Assertions.assertEquals(expected, result);
    }
}
