package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoreListsTest {

    String[] stringArray;
    List<String> stringList;

    @BeforeEach
    public void setUp() {
        stringArray = new String[]{"apples", "bananas", "milk", "eggs"};
        stringList = List.of(stringArray);
    }

    @Test
    public void testImmutableListClass() {
        // this is a ListN nested within an immutable collection
        // as seen below we cannot add to the list, its size is fixed
        String expected = "java.util.ImmutableCollections$ListN";
        String result = stringList.getClass().getName();
        Assertions.assertEquals(expected, result);
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            stringList.add("yogurt");
        });
        String expectedExceptionString = "java.lang.UnsupportedOperationException";
        String resultantExceptionString = exception.toString();
        Assertions.assertEquals(expectedExceptionString, resultantExceptionString);
    }

    @Test
    public void testMutableListClass() {
        ArrayList<String> mutableStringList = new ArrayList<>(stringList);
        int[] expected = {4, 5};
        int[] results = new int[2];
        results[0] = mutableStringList.size();

        mutableStringList.add("yogurt");
        results[1] = mutableStringList.size();
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testPopulateMutableListWithOneStatement() {
        // initialize immutable to mutable list
        ArrayList<String> newList = new ArrayList<>( // mutable result
                List.of("zero", "one", "two", "three") // immutable argument
        );
        Object[] expected = new Object[]{"three", 4, "four", 5};
        Object[] results = new Object[4];
        results[0] = newList.get(newList.size() - 1);
        results[1] = newList.size();
        newList.add("four");
        results[2] = newList.get(newList.size() - 1);
        results[3] = newList.size();

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddAllMethod() {
        ArrayList<String> newList = new ArrayList<>(stringList);
        List<String> listToAdd = List.of("yogurt", "cabbage", "carrots",
                "brocolli", "onions", "celery");
        boolean listAddedTo = newList.addAll(listToAdd);
        Assertions.assertTrue(listAddedTo);
        Assertions.assertEquals(10, newList.size());
    }

    @Test
    public void testArrayListRetrievalMethods() {
        // apples, bananas, milk, eggs
        ArrayList<String> newList = new ArrayList<>(stringList);
        boolean listWasAdded = newList.addAll(List.of("yogurt", "cabbage", "brocolli", "carrots"));
        Assertions.assertEquals("yogurt", newList.get(4));
        Assertions.assertEquals(5, newList.indexOf("cabbage"));
        Assertions.assertEquals(6, newList.lastIndexOf("brocolli"));
    }

    @Test
    public void testArrayRemovalMethods() {
        // apples, bananas, milk, eggs
        ArrayList<String> newList = new ArrayList<>(stringList);
        boolean listWasAdded = newList.addAll(List.of("yogurt", "cabbage", "brocolli", "carrots"));
        Assertions.assertEquals(8, newList.size());
        newList.remove(0); // remove apples
        Assertions.assertEquals(-1, newList.indexOf("apples"));
        boolean itemsRemoved = newList.removeAll(List.of("brocolli", "carrots"));
        Assertions.assertTrue(itemsRemoved);
        Assertions.assertEquals(5, newList.size());
        boolean itemsRetained = newList.retainAll(List.of("bananas", "milk", "eggs", "beats"));
        Assertions.assertTrue(itemsRetained); // note retained even though item "beats" is not
        // part of the original list
        boolean listChanges = newList.retainAll(List.of("bananas", "milk", "eggs"));
        // retainAll only returns false if the list does not change
        Assertions.assertFalse(listChanges);
        Assertions.assertEquals(3, newList.size());
        newList.clear();
        Assertions.assertTrue(newList.isEmpty());
    }

}
