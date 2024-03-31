package org.example;

public abstract class ListItem {

    protected ListItem leftLink, rightLink;
    protected Object value;

    abstract ListItem next();
    abstract ListItem setNext(ListItem rightLink);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem leftLink);
    abstract int compareTo(ListItem listLink);

    public Object getValue() { return value; }
    public void setValue(Object value) { this.value = value; }
    public ListItem(Object value) {
        this.value = value;
    }
}
