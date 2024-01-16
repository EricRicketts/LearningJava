package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComedyTest {

    private Comedy comedy;

    @BeforeEach
    public void setUp() {
        comedy = new Comedy("The Blues Brothers");
    }

    @Test
    public void testWatchMovie() {
        String expected = String.join("", "The Blues Brothers is a Comedy film.\n",
                "... Something funny happens\n", "... Something even funnier happens\n", "... Happy ending.\n"
        );
        String result = comedy.watchMovie();
        Assertions.assertEquals(expected, result);
    }
}
