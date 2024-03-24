package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DragonFlyTest {

    private DragonFly dragonFly;
    private String expected, results;
    private final String prefix = "Libellula saturata also known as Flame Skimmer";

    @BeforeEach
    public void Setup() {
        dragonFly = new DragonFly("Libellula saturata", "Flame Skimmer");
    }

    @Test
    public void testTakeOff() {
        expected = prefix + " has taken off from the Sunflower.";
        results = dragonFly.takeOff();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testFly() {
        expected = prefix + " is flying in a field of Sunflowers.";
        results = dragonFly.fly();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testLand() {
        expected = prefix + " has landed on the Sunflower.";
        results = dragonFly.land();
        Assertions.assertEquals(expected, results);
    }



}
