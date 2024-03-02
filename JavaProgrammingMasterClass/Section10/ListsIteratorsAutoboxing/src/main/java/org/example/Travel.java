package org.example;

import java.util.*;

public class Travel {

    private int indexOfCurrentPlace = 0;
    private final List<Place> places;

    public List<Place> getPlaces() {
        return places;
    }

    public int getIndexOfCurrentPlace() {
        return indexOfCurrentPlace;
    }

    public void setIndexOfCurrentPlace(int indexOfCurrentPlace) {
        this.indexOfCurrentPlace = indexOfCurrentPlace;
    }

    public void addPlace(LinkedList<Place> list, Place place) {
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) return;
        }
        int matchedIndex = 0;
        for (Place listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    public String printItinerary() {
        return """
                Travel Itinerary (numbers are distances from Sydney):
                Sydney -> 0
                Melbourne -> 877
                Brisbane -> 917
                Adelaide -> 1374
                Alice Springs -> 2771
                Perth -> 3923
                Darwin -> 3972
                """;
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

    public Place nextPlace() {
        Place nextPlace = null;
        ListIterator<Place> iterator =
                this.places.listIterator(indexOfCurrentPlace);
        if (iterator.hasNext()) {
            nextPlace = iterator.next();
            this.setIndexOfCurrentPlace(this.getIndexOfCurrentPlace() + 1);
        }

        return nextPlace;
    }

    public Place previousPlace() {
        Place previousPlace = null;
        ListIterator<Place> iterator =
                this.places.listIterator(indexOfCurrentPlace);
        if (iterator.hasPrevious()) {
            previousPlace = iterator.previous();
            this.setIndexOfCurrentPlace(this.getIndexOfCurrentPlace() - 1);
        }

        return previousPlace;
    }



    public Travel() {
        places = new LinkedList<>();
    }
}
