package org.example;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends StudentModel & QueryItem> extends ArrayList<T> {

    private List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public QueryList() {}

    public QueryList(List<T> items) {
        super(items);
    }

    public QueryList<T> getMatches(String field, String value) {
        QueryList<T> matches = new QueryList<>();
        for(var item : this) {
            if(item.matchFieldValue(field, value)) matches.add(item);
        }
        return matches;
    }

    public static <T extends QueryItem> List<T> getMatches(List<T> items, String field, String value) {
        List<T> matches = new ArrayList<>();
        for(var item : items) {
            if(item.matchFieldValue(field, value)) matches.add(item);
        }
        return matches;
    }
}
