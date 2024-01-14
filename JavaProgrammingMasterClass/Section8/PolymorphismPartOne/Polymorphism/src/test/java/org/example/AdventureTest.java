package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdventureTest {

    private Adventure adventure;

    @BeforeEach
    public void setUp() {
        adventure = new Adventure("Indiana Jones");
    }

    @Test
    public void testWatchMovie() {
        String expected = String.join("", "Indiana Jones is a Adventure film.\n",
                " ... Pleasant Scene\n", "... Scary Music\n", "... Something Bad Happens.\n");
        String result = adventure.watchMovie();
        Assertions.assertEquals(expected, result);
    }
}
