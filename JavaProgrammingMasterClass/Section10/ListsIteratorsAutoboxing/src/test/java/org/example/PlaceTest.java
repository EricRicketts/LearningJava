package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlaceTest {

    private Place place = null;

    @BeforeEach
    public void setUp() {
        place = new Place("Brisbane", 917);
    }

    @Test
    public void testPlaceName() {
        Assertions.assertEquals("Brisbane", place.name());
    }

    @Test
    public void testPlaceDistance() {
        Assertions.assertEquals(917, place.distance());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Brisbane -> 917", place.toString());
    }
}
