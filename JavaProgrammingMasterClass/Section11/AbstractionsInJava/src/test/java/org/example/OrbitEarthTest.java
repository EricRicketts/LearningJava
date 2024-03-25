package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrbitEarthTest {

    @Test
    public void testOrbitEarthStaticMethod() {
        String expected = new java.util.Date() + ": " + "is a new day!";
        String results = OrbitEarth.log("is a new day!");
        Assertions.assertEquals(expected, results);
    }
}
