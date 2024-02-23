package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroceryListChallengeTest {

    private GroceryList groceryList;
    private List<String> expected, results;

    @BeforeEach
    public void setUp() {
        groceryList = new GroceryList();
    }

    @Test
    public void testAddItemsToGroceryList() {
        expected = new ArrayList<>(){{
            add("butter"); add("cheese"); add("milk");
        }};
        groceryList.addItems("milk", "cheese", "butter");
        results = groceryList.getItems();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testAddItemsMultipleTimesToGroceryList() {
        expected = new ArrayList<>(){{
            add("butter"); add("cheese"); add("cream");
            add("ghee"); add("milk"); add("yogurt");
        }};
        groceryList.addItems("milk", "cheese", "butter");
        groceryList.addItems("yogurt", "ghee", "cream");
        results = groceryList.getItems();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testEliminateDuplicateItems() {
        expected = new ArrayList<>(){
            {
                add("butter"); add("cheese"); add("cream");
                add("ghee"); add("milk"); add("yogurt");
            }};
        groceryList.addItems("milk", "cheese", "butter");
        groceryList.addItems("yogurt", "ghee", "cream", "butter");
        groceryList.addItems("yogurt", "milk", "cream", "cheese");
        results = groceryList.getItems();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testRemoveItemsInTheList() {
        expected = new ArrayList<>(){{
             add("cheese"); add("cream");
             add("milk"); add("yogurt");
        }};
        groceryList.addItems("milk", "cheese", "butter");
        groceryList.addItems("yogurt", "ghee", "cream");
        groceryList.removeItems("ghee", "butter");
        results = groceryList.getItems();

        Assertions.assertEquals(expected, results);
    }

}
