package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

public class LinkedListChallengeTest {

    private Travel travel;
    private LinkedList<Place> places;

    private final Object[][] data = new Object[][]{
            {"Sydney", 0}, {"Melbourne", 877},
            {"Brisbane", 917}, {"Adelaide", 1374},
            {"Alice Springs", 2771}, {"Perth", 3923},
            {"Darwin", 3972}, {"Perth", 3923}
    };

    @BeforeEach
    public void setUp() {
        travel = new Travel();
        for (Object[] element : data) {
            Place place = new Place((String) element[0], (Integer) element[1]);
            travel.addPlace((LinkedList<Place>) travel.getPlaces(), place);
        }
        places = (LinkedList<Place>) travel.getPlaces();
    }

    @Test
    public void testResultsOfAddPlace() {
        Assertions.assertEquals(7, places.size());
        Place lastPlace = places.getLast();
        Assertions.assertEquals(new Place("Darwin", 3972), lastPlace);
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

    @Test
    public void testPrintItinerary() {
        String expected = """
                Travel Itinerary (numbers are distances from Sydney):
                Sydney -> 0
                Melbourne -> 877
                Brisbane -> 917
                Adelaide -> 1374
                Alice Springs -> 2771
                Perth -> 3923
                Darwin -> 3972
                """;
        String results = travel.printItinerary();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testTravelNextAndTravelPrevious() {
        Place place;
        Place expectedPlace;
        for (int index = 0; index < places.size(); index++) {
            Object[] element = data[index];
            String location = (String) element[0];
            Integer distance = (Integer) element[1];
            expectedPlace = new Place(location, distance);
            place = travel.nextPlace();
            Assertions.assertEquals(expectedPlace, place);
        }
        for (int index = places.size() - 1; index > -1; index--) {
            Object[] element = data[index];
            String location = (String) element[0];
            Integer distance = (Integer) element[1];
            expectedPlace = new Place(location, distance);
            place = travel.previousPlace();
            Assertions.assertEquals(expectedPlace, place);
        }
    }
}
