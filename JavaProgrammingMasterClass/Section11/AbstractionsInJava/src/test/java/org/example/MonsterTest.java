package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonsterTest {

    private Monster monster;
    List<String> expectedList, resultsList;
    String expected, results;

    @BeforeEach
    public void setUp() {
        monster = new Monster("Werewolf", 20, 40);
    }

    @Test
    public void testName() {
        expected = "Werewolf";
        results = monster.getName();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testHitPointsAndStrength() {
        expectedList = new ArrayList<>(
                Arrays.asList("20", "40")
        );
        resultsList = new ArrayList<>(
                Arrays.asList(String.valueOf(monster.getHitPoints()), String.valueOf(monster.getStrength()))
        );
        Assertions.assertEquals(expectedList, resultsList);
    }

    @Test
    public void testWrite() {
        expectedList = new ArrayList<>(
                Arrays.asList("Werewolf", "20", "40")
        );
        resultsList = new ArrayList<>(
                Arrays.asList(
                        monster.getName(),
                        String.valueOf(monster.getHitPoints()),
                        String.valueOf(monster.getStrength())
                        )
        );
        Assertions.assertEquals(expectedList, resultsList);
    }

    @Test
    public void testToString() {
        expected = """
                Monster{name='Werewolf', hitPoints=20, strength=40}""";
        results = monster.toString();
        Assertions.assertEquals(expected, results);
    }

}
