package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroceryListTest {

    List<GroceryItem> groceryList = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Apples", "Produce", 6));
        groceryList.add(new GroceryItem("Oranges", "Produce", 5));
    }

    @Test
    public void testGetSecondGroceryItem() {
        GroceryItem groceryItem = groceryList.get(2);
        Object[] expected = new Object[]{"Apples", "Produce", 6};
        Object[] results = new Object[]{groceryItem.name(), groceryItem.type(), groceryItem.count()};

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddGroceryItemAtTheFrontOfTheList() {
        // there is an overloaded version of the add which takes an index
        // and adds an object to the list, this operation will keep all
        // the current data but shift them by one location
        groceryList.add(0, new GroceryItem("Pears", "Produce", 4));
        GroceryItem groceryItem = groceryList.get(0);

        Object[] expected = new Object[]{"Pears", "Produce", 4, 5};
        Object[] results = new Object[]{
            groceryItem.name(), groceryItem.type(), groceryItem.count(), groceryList.size()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testSetGroceryItem() {
        // the set method will replace the current list item so the size
        // of the list is unchanged
        GroceryItem groceryItem = groceryList.get(0);
        List<Object> expected = new ArrayList<>(){{
            add("Milk"); add("Dairy"); add(1);
            add("Cheese"); add("Dairy"); add(1);
            add(4);
        }};
        List<Object> results = new ArrayList<>();
        results.add(groceryItem.name());
        results.add(groceryItem.type());
        results.add(groceryItem.count());
        groceryList.set(0, new GroceryItem("Cheese"));
        groceryItem = groceryList.get(0);
        results.add(groceryItem.name());
        results.add(groceryItem.type());
        results.add(groceryItem.count());
        results.add(groceryList.size());

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testRemoveGroceryItem() {
        GroceryItem removedItem = groceryList.remove(1);
        Object[] expected = new Object[]{
                "Butter", "Dairy", 1, 3
        };
        Object[] results = new Object[]{
                removedItem.name(), removedItem.type(),
                removedItem.count(), groceryList.size()
        };

        Assertions.assertArrayEquals(expected, results);
    }

}
