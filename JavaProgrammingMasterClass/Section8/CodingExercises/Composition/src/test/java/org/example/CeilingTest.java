package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CeilingTest {

    Ceiling ceiling;

    @BeforeEach
    public void setUp() {
        ceiling = new Ceiling(300, 15);
    }

    @Test
    public void testGetHeight() {
        Assertions.assertEquals(300, ceiling.getHeight());
    }

    @Test
    public void testGetPaintedColor() {
        Assertions.assertEquals(15, ceiling.getPaintedColor());
    }
}
