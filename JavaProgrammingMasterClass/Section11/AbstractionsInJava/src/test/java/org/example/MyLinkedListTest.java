package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyLinkedListTest {

    private String expected, results;
    private List<String> expectedList, resultantList;
    private MyLinkedList list;
    private String australianCities = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
    private String[] australianCitiesArray = australianCities.split(" ");

    // Remove the numbers in the order shown: 3, 5, 0, 4, 2, 9, 8, 6, 1, 7
    String[] numbersToRemove = new String[]{"3", "5", "0", "4", "2", "9", "8", "6", "1", "7"};

    List<List<Node>> expectedNodeLists = Arrays.asList(
            Arrays.asList(
                    new Node("0"), new Node("1"), new Node("2"), new Node("3"),
                    new Node("4"), new Node("5"), new Node("6"), new Node("7"),
                    new Node("8"), new Node("9")
            ), // original list
            Arrays.asList(
                    new Node("0"), new Node("1"), new Node("2"), new Node("4"),
                    new Node("5"), new Node("6"), new Node("7"), new Node("8"),
                    new Node("9")
            ), // after removing 3
            Arrays.asList(
                    new Node("0"), new Node("1"), new Node("2"), new Node("4"),
                    new Node("6"), new Node("7"), new Node("8"), new Node("9")
            ), // after removing 5
            Arrays.asList(
                    new Node("1"), new Node("2"), new Node("4"), new Node("6"),
                    new Node("7"), new Node("8"), new Node("9")
            ), // after removing 0
            Arrays.asList(
                    new Node("1"), new Node("2"), new Node("6"), new Node("7"),
                    new Node("8"), new Node("9")
            ), // after removing 4
            Arrays.asList(
                    new Node("1"), new Node("6"), new Node("7"), new Node("8"),
                    new Node("9")
            ), // after removing 2
            Arrays.asList(
                    new Node("1"), new Node("6"), new Node("7"), new Node("8")
            ), // after removing 9
            Arrays.asList(
                    new Node("1"), new Node("6"), new Node("7")
            ), // after removing 8
            Arrays.asList(
                    new Node("1"), new Node("7")
            ), // after removing 6
            Arrays.asList(
                    new Node("7")
            ) // after removing 1
    );

    private MyLinkedList constructExpectedList(List<Node> currentList) {
        MyLinkedList expectedList = new MyLinkedList(null);
        for (Node listItem : currentList) {
            expectedList.addItem(listItem);
        }
        return expectedList;
    }

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
    @Test
    public void testRemoveItem() {
        Node currentItem, expectedItem;
        List<String> originalList = new ArrayList<>(Arrays.asList(
                "5", "7", "3", "9", "8", "2", "1", "0", "4", "6"
        ));
        for (String s : originalList) {
            list.addItem(new Node(s));
        }

       for (int index = 0; index < expectedNodeLists.size(); index++) {
           // get the expected list of Node types from the list of lists
            List<Node> expectedNodeList = expectedNodeLists.get(index);
            // construct the expected MyLinkedList type from the List<Node>
            MyLinkedList expectedMyLinkedList = constructExpectedList(expectedNodeList);
            // get the starting point for the current list and the expected list
            currentItem = (Node) list.getRoot();
            expectedItem = (Node) expectedMyLinkedList.getRoot();
            // iterate through the expected list and current list and compare values
            while (!Objects.isNull(currentItem)) {
                Assertions.assertEquals(expectedItem.getValue(), currentItem.getValue());
                currentItem = (Node) currentItem.next();
                expectedItem = (Node) expectedItem.next();
            }
            // get the number to remove from the current list and remove it
            String numberToRemove = numbersToRemove[index];
            list.removeItem(new Node(numberToRemove));
        }
       // at the end of removing every number in the list ensure the root if the current list is null
       Assertions.assertNull(list.getRoot());
    }
}
