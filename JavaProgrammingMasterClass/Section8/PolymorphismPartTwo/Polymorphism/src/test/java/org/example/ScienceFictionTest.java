package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScienceFictionTest {

    private ScienceFiction scienceFiction;

    @BeforeEach
    public void setUp() {
        scienceFiction = new ScienceFiction("2001 A Space Odyssey");
    }

    @Test
    public void testWatchMovie() {
        String expected = String.join("", "2001 A Space Odyssey is a ScienceFiction film.\n",
                "... Bad Aliens do Bad Stuff\n", "... Space Guys Chase Aliens\n", "... Planet Blows Up.\n"
        );
        String result = scienceFiction.watchMovie();
        Assertions.assertEquals(expected, result);
    }
}
