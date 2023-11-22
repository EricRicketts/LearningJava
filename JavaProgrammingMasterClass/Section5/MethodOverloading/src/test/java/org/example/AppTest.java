package org.example;

;import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testWithNoArguments() {
        String result = "No player name, no player score.";
        Assertions.assertEquals(
                result,
                App.calculateScore()
        );
    }

    @Test
    public void testWithPlayerName() {
        String result = "Eric scored 100 points.";
        Assertions.assertEquals(
                result,
                App.calculateScore("Eric", 100)
        );
    }

    @Test
    public void testWithNoPlayerName() {
        String result = "Anonymous scored 200 points.";
        Assertions.assertEquals(
                result,
                App.calculateScore(200)
        );
    }
}
