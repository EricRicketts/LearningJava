package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Big Bad John", 200, "Sword");
    }

    @Test
    public void testInitialHealth() {
        // code sets health to 100 when health initialized to over 100
        Assertions.assertEquals(100, player.remainingHealth());
    }

    @Test
    public void testEncapsulatingNameAndSword() {
        // notice player name and weapon changed but
        // the calling code did not need to change
        // player.introducePlayerNameAndWeapon()
        String expected = "Big Bad John has a Sword.";
        String result = player.introducePlayerNameAndWeapon();
        Assertions.assertEquals(expected, result);
        player.setName("Elmer Fudd");
        player.setWeapon("Shotgun");
        expected = "Elmer Fudd has a Shotgun.";
        result = player.introducePlayerNameAndWeapon();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testControlledAccessToHealth() {
        // health can only be changed through method calls
        String expected = "Player still in game.";
        String result = player.loseHealth(90);
        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(10, player.remainingHealth());
        expected = "Player health is 50.";
        result = player.restoreHealth(40);
        Assertions.assertEquals(expected, result);
    }
}
