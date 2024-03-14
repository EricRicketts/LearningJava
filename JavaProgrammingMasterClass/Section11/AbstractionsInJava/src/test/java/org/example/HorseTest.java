package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HorseTest {

    private Horse horse;
    Object[] expected, results;

    @BeforeEach
    public void setUp() {
        horse = new Horse("Thoroughbred", "medium", 150);
    }

    @Test
    public void testGetters() {
        expected = new Object[]{"medium", 150.0};
        results = new Object[]{horse.getSize(), horse.getWeight()};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testMakeNoiseAndMove() {
        expected = new String[]{"Neigh, Neigh!!", "Horse (Thoroughbred) runs"};
        results = new String[]{horse.makeNoise(), horse.move("fast")};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testShedHair() {
        String expected = "Horse (Thoroughbred) shedding hair";
        String results = horse.shedHair();
        Assertions.assertEquals(expected, results);
    }
}
