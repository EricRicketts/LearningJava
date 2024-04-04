package org.example;

public class Node extends ListItem {

    ListItem next() {
        return rightLink;
    }

    ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return this.rightLink;
    }

    ListItem previous() {
        return leftLink;
    }

    ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem listLink) {
        if (listLink != null) {
            String currentValue = (String) super.getValue();
            String otherValue = (String) listLink.getValue();
            return currentValue.compareTo(otherValue);
        } else {
            return -1;
        }
    }

    public Node(Object value) {
        super(value);
    }
}
