package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SatelliteTest {

    private Satellite satellite;
    private String expected, results;

    @BeforeEach
    public void setUp() {
        satellite = new Satellite();
    }

    @Test
    public void testTakeOff() {
       expected = "Satellite launched by rocket.";
       results = satellite.takeOff();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testLand() {
        expected = "Satellite fell out of orbit.";
        results = satellite.land();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testFly() {
        expected = "Satellite has separated from its rocket.";
        results = satellite.fly();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testAchieveOrbit() {
        expected = "Satellite has achieved orbit.";
        results = satellite.achieveOrbit();
        Assertions.assertEquals(expected, results);
    }
}
