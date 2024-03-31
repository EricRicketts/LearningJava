package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Node extends ListItem {

    ListItem next() {
        return rightLink;
    }

    ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return rightLink;
    }

    ListItem previous() {
        return leftLink;
    }

    ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return leftLink;
    }

    @Override
    public int compareTo(ListItem listLink) {
        return 0;
    }

    public Node(Object value) {
        super(value);
    }
}
