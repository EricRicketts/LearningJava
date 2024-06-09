package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RiverTest {

    private String expected, results;
    private River river;

    @BeforeEach
    public void setUp() {
        river = new River("James River", "37.47779, -78.95890", "37.4777903, -78.9588954",
                "37.497949, -78.927825", "37.516878, -78.895896");
    }

    @Test
    public void testGetAndSetName() {
        expected = "James River";
        results = river.getName();
        Assertions.assertEquals(expected, results);
        river.setName("Potomac River");
        expected = "Potomac River";
        results = river.getName();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testToString() {
        expected = "River{name='James River'}";
        results = river.toString();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testRender() {
        expected = "Render River{name='James River'} as LINE ([[37.47779, -78.9589], [37.4777903, -78.9588954]," +
                " [37.497949, -78.927825], [37.516878, -78.895896]])";
        results = river.render();
        Assertions.assertEquals(expected, results);
    }
}
