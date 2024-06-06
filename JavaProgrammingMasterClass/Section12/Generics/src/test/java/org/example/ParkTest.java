package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParkTest {

    private Park park;

    @BeforeEach
    public void setUp() {
        park = new Park("Alagnak Wild River", "59.11, 155.52");
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("Alagnak Wild River", park.getName());
    }

}
