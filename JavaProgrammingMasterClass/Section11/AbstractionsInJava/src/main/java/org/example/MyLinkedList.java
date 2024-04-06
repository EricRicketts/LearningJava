package org.example;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        while (currentItem != null) {
           int comparison = (currentItem.compareTo(item));
           if (comparison == 0) {
               if (currentItem == this.root) {
                   this.root = currentItem.next();
               } else {
                   currentItem.previous().setNext(currentItem.next());
                   if (currentItem.next() != null) {
                       currentItem.next().setPrevious(currentItem.previous());
                   }
               }
               return true;
           } else if (comparison < 0) {
               currentItem = currentItem.next();
           } else {
               return false;
           }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            return;
        } else {
            while (root != null) {
                root = root.next();
            }
        }
    }

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
}
