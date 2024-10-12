package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class BaseballPlayerTest {

    private BaseballPlayer baseballPlayer;

    @BeforeEach
    public void setUp() {
        baseballPlayer = new BaseballPlayer(
                "Elmer Fudd", "Pitcher", 0.25724
        );
    }

    @Test
    public void testPlayerName() {
        Assertions.assertEquals("Elmer Fudd", baseballPlayer.name());
    }

    @Test
    public void testPlayerPosition() {
        Assertions.assertEquals("Pitcher", baseballPlayer.position());
    }

    @Test
    public void testPlayerBattingAverage() {
        Assertions.assertEquals(
                "0.257", BaseballPlayer.formatBattingAverage(baseballPlayer.battingAverage())
        );
    }
}
