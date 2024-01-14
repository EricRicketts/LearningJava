package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("Pee Wee's Big Adventure");
    }

    @Test
    public void testWatchMovie() {
        String expected = "Pee Wee's Big Adventure is a Movie film.\n";
        String result = movie.watchMovie();
        Assertions.assertEquals(expected, result);
    }
}
