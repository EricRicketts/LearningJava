package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    private String expected, results;
    private MyLinkedList list;
    private String australianCities = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
    private String[] australianCitiesArray = australianCities.split(" ");

    @BeforeEach
    public void setUp() {
        list = new MyLinkedList(null);
    }

    @Test
    public void testInitializedList() {
        Assertions.assertNull(list.getRoot());
    }

    @Test
    public void testAddItem() {
        String[] expectedArray = new String[]{
                "Adelaide", "Brisbane", "Canberra", "Darwin",
                "Melbourne", "Perth", "Sydney"
        };
        int index = 0;
        ListItem currentItem = new Node("start");

        for (String s : australianCitiesArray) {
            list.addItem(new Node(s));
        }

        while (index < 7) {
            if (index == 0) {
                expected = expectedArray[index];
                results = (String) list.getRoot().getValue();
                Assertions.assertEquals(expected, results);
                index += 1;
                currentItem = list.getRoot().next();
            } else {
                expected = expectedArray[index];
                results = (String) currentItem.getValue();
                Assertions.assertEquals(expected, results);
                expected = expectedArray[index - 1];
                results = (String) currentItem.previous().getValue();
                Assertions.assertEquals(expected, results);
                index += 1;
                currentItem = currentItem.next();
            }
        }
    }
}
