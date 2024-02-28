package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class LinkedListChallengeTest {

    private Travel travel;

    @BeforeEach
    public void setUp() {
        travel = new Travel();
    }

    @Test
    public void testListOfMaps() {
        List<Map<String, Integer>> listOfMaps = travel.getDistancesFromSydney();
        ListIterator<Map<String, Integer>> iterator = listOfMaps.listIterator();
        Object[][] expectedData = new Object[][]{
                {"Sydney", 0}, {"Melbourne", 877},
                {"Brisbane", 917}, {"Adelaide", 1374},
                {"Alice Springs", 2771}, {"Perth", 3923},
                {"Darwin", 3972}
        };
        int index = 0;
        while (iterator.hasNext()) {
            Object[] expected = expectedData[index];
            String expectedKey = (String) expected[0];
            Integer expectedValue = (Integer) expected[1];
            Map<String, Integer> map = iterator.next();
            Assertions.assertTrue(map.containsKey(expectedKey));
            Assertions.assertEquals(map.get(expectedKey), expectedValue);
            index += 1;
        }
    }

    @Test
    public void testPrintMenuOptions() {
        String expected = """
                Available Actions (select word or letter): 
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
        String results = travel.printMenuOption();
        Assertions.assertEquals(expected, results);
    }
}
