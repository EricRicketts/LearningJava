package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseballPlayerTest {

    private BaseballPlayer baseballPlayer;

    @BeforeEach
    public void setUp() {
        baseballPlayer = new BaseballPlayer(
                "Elmer Fudd", "Pitcher"
        );
    }

    @Test
    public void testPlayerName() {
        Assertions.assertEquals(
                "Elmer Fudd", baseballPlayer.name()
        );
    }
}
