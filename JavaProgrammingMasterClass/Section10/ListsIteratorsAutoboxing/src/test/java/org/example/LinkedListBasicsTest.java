package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListBasicsTest {

    private String expected, results;
    private LinkedList<String> placesToVisit, greatPlacesToVisit;

    @BeforeEach
    public void setUp() {
        placesToVisit = new LinkedList<>();
        greatPlacesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");

        greatPlacesToVisit.add("Cheyenne");
        greatPlacesToVisit.add("Jackson");
        greatPlacesToVisit.add("Casper");
        greatPlacesToVisit.add("Laramie");
        greatPlacesToVisit.add("Cody");
        greatPlacesToVisit.add("Sheridan");
        greatPlacesToVisit.add("Gillette");
        greatPlacesToVisit.add("Rock Springs");
    }

    @Test
    public void testBasicLinkedList() {
        expected = "[Canberra, Sydney]";
        results = placesToVisit.toString();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testBasicLinkedListWithVar() {
        var morePlacesToVisit = new LinkedList<String>();
        morePlacesToVisit.add("Cheyenne");
        morePlacesToVisit.add("Jackson");
        morePlacesToVisit.add(1, "Casper");
        expected = "[Cheyenne, Casper, Jackson]";
        results = morePlacesToVisit.toString();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testQueueAddFirstAndAddLstMethods() {
        placesToVisit.addFirst("Darwin");
        placesToVisit.addLast("Hobart");
        expected = "[Darwin, Canberra, Sydney, Hobart]";
        results = placesToVisit.toString();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testQueueOfferFirstAndOfferLastMethod() {
        boolean offered = placesToVisit.offer("Toowoomba"); // inserts at end of queue
        boolean firstOffered = placesToVisit.offerFirst("Darwin");
        boolean lastOffered = placesToVisit.offerLast("Hobart");
        expected = "[Darwin, Canberra, Sydney, Toowoomba, Hobart]";
        results = placesToVisit.toString();

        Assertions.assertEquals(expected, results);
        Assertions.assertArrayEquals(
                new boolean[]{true, true, true}, new boolean[]{offered, firstOffered, lastOffered}
        );
    }

    @Test
    public void testQueryAList() {
        String[] expected = new String[]{"Cheyenne", "Rock Springs", "Laramie"};
        String[] results = new String[]{
                greatPlacesToVisit.getFirst(), greatPlacesToVisit.getLast(), greatPlacesToVisit.get(3)
        };
        Assertions.assertArrayEquals(expected, results);
        Assertions.assertEquals(4, greatPlacesToVisit.indexOf("Cody"));
    }

    @Test
    public void testRemoveItemsFromList() {
        Assertions.assertEquals(8, greatPlacesToVisit.size());
        String[] expected = new String[]{"Cheyenne", "Rock Springs", "Laramie"};
        String[] results = new String[]{
                greatPlacesToVisit.removeFirst(), greatPlacesToVisit.removeLast(),
                greatPlacesToVisit.remove(2)
        };
        Assertions.assertArrayEquals(expected, results);
    }
}
