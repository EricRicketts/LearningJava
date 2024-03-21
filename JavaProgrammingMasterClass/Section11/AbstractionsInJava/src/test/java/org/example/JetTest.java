package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JetTest {

    private Jet jet;
    private String[] expected, results;

    @BeforeEach
    public void setUp() {
        jet = new Jet();
    }

    @Test
    public void testFlightEnabledMethods() {
        expected = new String[]{
                "Jet taking off under full engine power.",
                "Jet landing on a short runway.",
                "Jet flying at 50,000 feet over the Pacific Ocean."
        };
        results = new String[]{
                jet.takeOff(), jet.land(), jet.fly()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testTrackableMethods() {
        Assertions.assertEquals("Jet being tracked by NORAD.", jet.track());
    }
}
