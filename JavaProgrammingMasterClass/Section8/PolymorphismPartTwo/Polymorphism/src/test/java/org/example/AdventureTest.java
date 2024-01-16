package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdventureTest {

    private Adventure adventure;
    private String expected, result;

    @BeforeEach
    public void setUp() {
        adventure = new Adventure("Indiana Jones");
    }

    @Test
    public void testWatchMovie() {
        expected = String.join("", "Indiana Jones is a Adventure film.\n",
                " ... Pleasant Scene\n", "... Scary Music\n", "... Something Bad Happens.\n");
        result = adventure.watchMovie();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetMovieTypeAdventure() {
        Movie adventure = Movie.getMovie("Adventure", "The Three Musketeers");
        Assertions.assertEquals("Adventure", adventure.getClass().getSimpleName());
        expected = String.join("", "The Three Musketeers is a Adventure film.\n",
                " ... Pleasant Scene\n", "... Scary Music\n", "... Something Bad Happens.\n");
        result = adventure.watchMovie();
        Assertions.assertEquals(expected, result);
    }
}
