package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    private Song song;

    @BeforeEach
    public void setUp() {
        song = new Song("Knowing Me, Knowing You", 4.56);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Knowing Me, Knowing You", song.getTitle());
    }

    @Test
    public void testGetDuration() {
        assertEquals(4.56, song.getDuration());
    }

    @Test
    public void testGetString() {
        String expected = """
                Song{title='Knowing Me, Knowing You', duration=4.56}""";
        String result = song.toString();
        assertEquals(expected, result);
    }
}
