package org.example;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}
