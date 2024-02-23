package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GroceryList {

    private final List<String> items;

    public List<String> getItems() {
        return items;
    }

    public void addItems(String... additionalItems) {
        List<String> listOfItems = new ArrayList<>(Arrays.asList(additionalItems));
        this.items.addAll(listOfItems);
        this.items.sort(Comparator.naturalOrder());
    }

    public GroceryList() {
        this.items = new ArrayList<>();
    }
}
