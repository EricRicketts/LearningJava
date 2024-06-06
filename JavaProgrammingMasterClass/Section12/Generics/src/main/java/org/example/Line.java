package org.example;

import java.util.Arrays;
import java.util.Map;

abstract class Line implements Mappable {

    private double[][] locations;

    private String locations() {
        return Arrays.deepToString(locations);
    }

    @Override
    public String render() {
        return "Render " + this + " as LINE (" + locations() + ")";
    }

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var location : locations) {
            this.locations[index++] = Mappable.stringToLatLong(location);
        }
    }
}
