package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerTest {

    private Player player;
    private String expected, results;
    private List<String> expectedList, resultsList;

    @BeforeEach
    public void setUp() {
        player = new Player("Tim", 10, 15);
    }

    @Test
    public void testNameAndWeapon() {
        expectedList = new ArrayList<String>(Arrays.asList("Tim", "Sword"));
        resultsList = new ArrayList<String>(Arrays.asList(player.getName(), player.getWeapon()));
        Assertions.assertEquals(expectedList, resultsList); // list is same size and has same elements
        Assertions.assertNotSame(expectedList, resultsList); // lists do not have same memory location
    }

    @Test
    public void testHitPointsAndStrength() {
        expectedList = new ArrayList<String>(Arrays.asList("10", "15"));
        resultsList = new ArrayList<String>(
                Arrays.asList(String.valueOf(player.getHitPoints()), String.valueOf(player.getStrength()))
        );
        Assertions.assertEquals(expectedList, resultsList);
    }

    @Test
    public void testToString() {
        expected = """
                Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}""";
        results = player.toString();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testWrite() {
        expectedList = new ArrayList<String>(
                Arrays.asList(
                        player.getName(),
                        String.valueOf(player.getHitPoints()),
                        String.valueOf(player.getStrength()),
                        player.getWeapon()
                    )
                );
        resultsList = player.write();
        Assertions.assertEquals(expectedList, resultsList);
    }

}
