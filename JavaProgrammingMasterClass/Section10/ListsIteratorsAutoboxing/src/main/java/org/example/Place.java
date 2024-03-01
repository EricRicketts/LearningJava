package org.example;

public record Place(String name, int distance) {
    @Override
    public String toString() {
        return name + " -> " + distance;
    }
}
