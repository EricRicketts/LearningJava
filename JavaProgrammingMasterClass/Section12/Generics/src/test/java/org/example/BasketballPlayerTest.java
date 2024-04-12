package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasketballPlayerTest {

    private BasketballPlayer basketballPlayer;

    @BeforeEach
    public void setUp() {
        basketballPlayer = new BasketballPlayer("Luka Doncic", "Small Forward", 33.9);
    }

    @Test
    public void testPlayerName() {
        Assertions.assertEquals("Luka Doncic", basketballPlayer.name());
    }

    @Test
    public void testPlayerPosition() {
        Assertions.assertEquals("Small Forward", basketballPlayer.position());
    }

    @Test
    public void testPlayerPointsPerGame() {
        String expected = "33.9";
        String results = BasketballPlayer.formatPointsPerGate(basketballPlayer.ppg());
        Assertions.assertEquals(expected, results);
    }
}
