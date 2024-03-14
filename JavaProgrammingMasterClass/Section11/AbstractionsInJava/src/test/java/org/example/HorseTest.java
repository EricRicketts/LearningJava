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
}
