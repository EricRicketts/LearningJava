package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SongTest {

    private Song song;

    @BeforeEach
    public void setUp() {
        song = new Song("The Eagle", 5.15);
    }

    @Test
    public void testGetTitle() {
        Assertions.assertEquals("The Eagle", song.getTitle());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("The Eagle: 5.15", song.toString());
    }
}
