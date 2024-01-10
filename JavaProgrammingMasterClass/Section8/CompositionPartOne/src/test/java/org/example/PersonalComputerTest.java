package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonalComputerTest {

    ComputerCase computerCase;
    Monitor monitor;
    MotherBoard motherBoard;
    PersonalComputer personalComputer;
    String expected, result;

    @BeforeEach
    public void setUp() {
        computerCase = new ComputerCase("2208", "Dell", "240");
        monitor = new Monitor("27in Beast", "Acer", 27, "2540 x 1440");
        motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
        personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherBoard);
    }

    @Test
    public void testPersonalComputerHasComputerCase() {
        expected = "class org.example.ComputerCase";
        result = String.valueOf(personalComputer.getComputerCase().getClass());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPersonalComputerHasMonitor() {
        expected = "class org.example.Monitor";
        result = String.valueOf(personalComputer.getMonitor().getClass());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPersonalComputerHasMotherBoard() {
        expected = "class org.example.MotherBoard";
        result = String.valueOf(personalComputer.getMotherBoard().getClass());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDrawLogo() {
        expected = "Power Button pressed. Drawing pixel at 1200, 50, in color yellow.";
        result = personalComputer.powerUp();
        Assertions.assertEquals(expected, result);
    }
}
