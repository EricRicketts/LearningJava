package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WallTest {

    private Wall wall;

    @BeforeEach
    public void setUp() {
        wall = new Wall("Right");
    }

    @Test
    public void testGetDirection() {
        Assertions.assertEquals("Right", wall.getDirection());
    }
}
