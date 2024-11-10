package org.example;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends QueryItem> {

    private List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public QueryList(List<T> items) {
        this.items = items;
    }

    public List<T> getMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for(var item : this.items) {
            if(item.matchFieldValue(field, value)) matches.add(item);
        }
        return matches;
    }
}
