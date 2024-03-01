package org.example;

import java.util.*;

public class Travel {

    private int indexOfCurrentPlace = 0;
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

    public int getIndexOfCurrentPlace() {
        return indexOfCurrentPlace;
    }

    public void setIndexOfCurrentPlace(int indexOfCurrentPlace) {
        this.indexOfCurrentPlace = indexOfCurrentPlace;
    }

    public String printMenuOption() {
        return """
                Available Actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
    }

    public Map<String, Integer> nextPlace() {
        Map<String, Integer> nextPlace = new HashMap<>();
        ListIterator<Map<String, Integer>> iterator =
                this.distancesFromSydney.listIterator(indexOfCurrentPlace);
        if (iterator.hasNext()) {
            nextPlace = iterator.next();
            this.setIndexOfCurrentPlace(this.getIndexOfCurrentPlace() + 1);
        }

        return nextPlace;
    }

    public Map<String, Integer> previousPlace() {
        Map<String, Integer> previousPlace = new HashMap<>();
        ListIterator<Map<String, Integer>> iterator =
                this.distancesFromSydney.listIterator(indexOfCurrentPlace);
        if (iterator.hasPrevious()) {
            previousPlace = iterator.previous();
            this.setIndexOfCurrentPlace(this.getIndexOfCurrentPlace() - 1);
        }

        return previousPlace;
    }


    public Travel() {
        distancesFromSydney = new LinkedList<>();
        populateTravelList(data);
    }
}
