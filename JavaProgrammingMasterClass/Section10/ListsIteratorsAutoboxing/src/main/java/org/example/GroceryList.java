package org.example;

import java.util.*;

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

    public void addItemsFromPrompt(GroceryList groceryList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",\\s*");
        groceryList.addItems(items);
    }

    public void removeItems(String... items) {
        List<String> listOfItems = new ArrayList<>(Arrays.asList(items));
        this.items.removeAll(listOfItems);
        this.removeDuplicates();
        this.items.sort(Comparator.naturalOrder());
    }

    public void removeItemsFromPrompt(GroceryList groceryList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove item(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",?\\s*");
        groceryList.removeItems(items);
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        GroceryList groceryList = new GroceryList();

        while (flag) {
            printActions();
            switch(Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItemsFromPrompt(groceryList);
                case 2 -> removeItemsFromPrompt(groceryList);
                default -> flag = false;
            }
        }
        System.out.println(groceryList.printItems());
    }

    public String printActions() {

        return """
                Available Actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
    }

    public String printItems() {
        String output = "";
        for (String item : this.items) output += item + "\n";

        return output;
    }

    public GroceryList() {
        this.items = new ArrayList<>();
    }
}
