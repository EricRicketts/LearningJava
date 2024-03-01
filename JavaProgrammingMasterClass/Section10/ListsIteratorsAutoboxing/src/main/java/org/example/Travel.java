package org.example;

import java.util.*;

public class Travel {

    private final List<Map<String, Integer>> distancesFromSydney;
    private final Object[][] data = new Object[][]{
            {"Sydney", 0}, {"Melbourne", 877},
            {"Brisbane", 917}, {"Adelaide", 1374},
            {"Alice Springs", 2771}, {"Perth", 3923},
            {"Darwin", 3972}
    };

    private void populateTravelList(Object[][] data) {
        for (Object[] element : data) {
            Map<String, Integer> map = new HashMap<>();
            String key = (String) element[0];
            Integer value = (Integer) element[1];
            map.put(key, value);
            distancesFromSydney.add(map);
        }
    }

    public List<Map<String, Integer>> getDistancesFromSydney() {
        return distancesFromSydney;
    }

    public String printMenuOption() {
        String menu = """
                Available Actions (select word or letter): 
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;

        return menu;
    }

    public Travel() {
        distancesFromSydney = new LinkedList<>();
        populateTravelList(data);
    }
}
