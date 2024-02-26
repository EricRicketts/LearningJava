package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorTest {

    LinkedList<String> greatPlacesToVisit;
    ListIterator<String> iterator;

    @BeforeEach
    public void setUp() {
        greatPlacesToVisit = new LinkedList<>();
        greatPlacesToVisit.add("Cheyenne");
        greatPlacesToVisit.add("Jackson");
        greatPlacesToVisit.add("Casper");
        greatPlacesToVisit.add("Laramie");
        greatPlacesToVisit.add("Jackson");
        greatPlacesToVisit.add("Cody");
        greatPlacesToVisit.add("Sheridan");
        greatPlacesToVisit.add("Jackson");
        greatPlacesToVisit.add("Gillette");
        greatPlacesToVisit.add("Rock Springs");
        iterator = greatPlacesToVisit.listIterator();
    }

    @Test
    public void testIterator() {
        Assertions.assertEquals(10, greatPlacesToVisit.size());
        Iterator<String> iterator = greatPlacesToVisit.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Jackson")) iterator.remove(); // remove must be called on the iterator
        }
        Assertions.assertEquals(7, greatPlacesToVisit.size());
    }

    @Test
    public void testListIterator() {
        String expected =
                "Cheyenne, Jackson, Riverton, Casper, Laramie, Jackson, Riverton, Cody, " +
                        "Sheridan, Jackson, Riverton, Gillette, Rock Springs";
        String results = "";
        while (iterator.hasNext()) {
            String place = iterator.next();
            results = String.join(", ", results, place);
            if (place.equals("Jackson")) {
                iterator.add("Riverton");
                place = "Riverton";
                results = String.join(", ", results, place);
            }
        }
        results = results.substring(2);
        Assertions.assertEquals(13, greatPlacesToVisit.size());
        Assertions.assertEquals(expected, results);
    }
    // listIterator(index), iterator.previous();
    @Test
    public void testMoveForwardsAndBackwardsWithIterator() {
        String result = "";
        if (iterator.hasNext()) iterator.next();
        if (iterator.hasNext()) result = iterator.next();
        Assertions.assertEquals("Jackson", result);
        if (iterator.hasPrevious()) iterator.previous();
        if (iterator.hasPrevious()) result = iterator.previous();
        Assertions.assertEquals("Cheyenne", result);
    }
}
