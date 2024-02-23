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

    private void removeDuplicates() {
        List<String> listOfItemsNoDuplicates = new ArrayList<>();
        for (String element : this.items) {
            if (!listOfItemsNoDuplicates.contains(element)) {
                listOfItemsNoDuplicates.add(element);
            }
        }
        this.items.clear();
        this.items.addAll(listOfItemsNoDuplicates);
    }

    public void addItems(String... items) {
        List<String> listOfItems = new ArrayList<>(Arrays.asList(items));
        this.items.addAll(listOfItems);
        this.removeDuplicates();
        this.items.sort(Comparator.naturalOrder());
    }

    public void removeItems(String... items) {
        List<String> listOfItems = new ArrayList<>(Arrays.asList(items));
        this.items.removeAll(listOfItems);
        this.removeDuplicates();
        this.items.sort(Comparator.naturalOrder());
    }
    public GroceryList() {
        this.items = new ArrayList<>();
    }
}
