package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MethodsTest {
    Integer expectedScore;
    Integer resultantScore;
    Score score;
    @BeforeEach
    public void setUp() {
        score = new Score();
    }

    @Test
    public void testFirstMethodArguments() {
        expectedScore = Integer.valueOf("1300");
        resultantScore = score.calculateScore(
                true,
                Integer.valueOf("800"),
                Integer.valueOf("5"),
                Integer.valueOf("100"));
        Assertions.assertEquals(expectedScore, resultantScore);
    }

    @Test
    public void testSecondMethodArguments() {
        expectedScore = Integer.valueOf("11600");
        resultantScore = score.calculateScore(
                true,
                Integer.valueOf("10000"),
                Integer.valueOf("8"),
                Integer.valueOf("200"));
        Assertions.assertEquals(expectedScore, resultantScore);
    }
}