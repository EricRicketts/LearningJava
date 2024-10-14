package org.example;

import java.util.Arrays;

abstract class Line implements Mappable {

    private final double[][] locations;

    /*
        Arrays.deepToString() is important as Java will display the arrays properly,
        i.e., 2D, 3D, etc.  So a 2x2 2D array will be displayed in String format as:
        [[x0, y0], [x1, y1]]
    */
    private String locations() {
        return Arrays.deepToString(locations);
    }

    @Override
    public String render() {
        return "Render " + this + " as LINE (" + locations() + ")";
    }

    @Override
    public String toString() {
        return "Line{" +
                "locations=" + Arrays.toString(locations) +
                '}';
    }

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var location : locations) {
            this.locations[index] = Mappable.stringToLatLong(location);
            index += 1;
        }
    }
}
