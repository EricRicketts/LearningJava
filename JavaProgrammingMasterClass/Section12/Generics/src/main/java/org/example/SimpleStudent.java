package org.example;

public class SimpleStudent implements Comparable<SimpleStudent> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SimpleStudent otherStudent) {
        return this.getName().compareTo(otherStudent.getName());
    }

    public SimpleStudent(String name) {
        this.name = name;
    }
}
