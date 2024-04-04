package org.example;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
}
