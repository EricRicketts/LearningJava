package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FishTest {

    private Fish goldie;
    private String expected, result;

    @BeforeEach
    public void setUp() {
        goldie = new Fish("Goldfish", 0.25, 2, 3);
    }

    @Test
    public void testFishToString() {
        expected = """
                Fish{fins=2, gills=3} Fish{type='Goldfish', size='small', weight=0.25}""";
        result = goldie.toString();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFishMovingSlowly() {
        expected = """
                Goldfish moves slow.  Muscles moving.""";
        result = goldie.move("slow");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFishMovingFast() {
        expected = """
                Goldfish moves fast.  Muscles moving.  Back fins moving.""";
        result = goldie.move("fast");
        Assertions.assertEquals(expected, result);
    }
}
