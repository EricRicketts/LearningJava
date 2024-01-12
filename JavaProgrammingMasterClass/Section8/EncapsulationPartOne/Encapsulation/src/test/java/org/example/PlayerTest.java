package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Elmer Fudd", 100, "Club");
    }

    /*
        We have a bad situation here regarding health accessibility, the health
        field can be changed directly in addition to a method call, this could
        lead to unwanted updates.  Allowing direct access to data on an object
        can potentially bypass checks and additional processing your class has
        in place to manage data.  So for instance if a player's health drops
        below a certain number he might suffer a penalty, so the data loss and
        consequences should be encapsulated in the loseHealth method but with
        public access to the health field this method loses the control it was
        meant to have.

        Allowing direct access to a field means the calling code needs to change
        if the field name changes.  While this would not be problematic for a
        small program it could be significant for a larger program.

        Omitting a constructor, that would accept initialization data, means the
        calling code is responsible for setting up the data on the new object.
    */
    @Test
    public void setHealthDirectly() {
        player.health += 10;
        Assertions.assertEquals(110, player.remainingHealth());
    }

    @Test
    public void setHealthByMethod() {
        player.loseHealth(10);
        Assertions.assertEquals(90, player.remainingHealth());
    }
}
