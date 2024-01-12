package org.example;


import org.junit.jupiter.api.BeforeEach;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Elmer Fudd", 100, "Club");
    }
}
