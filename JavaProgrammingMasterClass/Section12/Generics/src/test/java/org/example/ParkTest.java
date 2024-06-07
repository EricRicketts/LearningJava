package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParkTest {

    private String expected, results;
    private Park park;

    @BeforeEach
    public void setUp() {
        park = new Park("Alagnak Wild River", "59.11, 155.52");
    }

    @Test
    public void testGetAndSetName() {
        Assertions.assertEquals("Alagnak Wild River", park.getName());
        park.setName("Glacier Bay");
        Assertions.assertEquals("Glacier Bay", park.getName());
    }

    @Test
    public void testToString() {
        expected = "Park{name='Alagnak Wild River'}";
        results = park.toString();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testParkRender() {
        expected  = "Render Park{name='Alagnak Wild River'} as POINT ([59.11, 155.52])";
        results = park.render();
        Assertions.assertEquals(expected, results);
    }

}
