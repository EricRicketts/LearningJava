package org.example;

import java.util.Arrays;

abstract class Line implements Mappable {

    private final double[][] locations;

    /*
        The comments made in the abstract Point class apply to this abstract Line class.

        Arrays.deepToString() is important as Java will display the arrays properly,
        i.e., 2D, 3D, etc.  So a 2x2 2D array will be displayed in String format as:
        [[x0, y0], [x1, y1]]
    */
    private String locations() {
        return Arrays.deepToString(locations);
    }

    @Override
    // as with the method render() for the Park class, object represented by "this" has a understandable toString() method
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
        // pairs of numeric strings are passed to the Line constructor, i.e., "33.45, 44.98", "21.89, 90.45", "56.34, 49.44"
        // so the code takes each pair of Strings and with static method call Mappable.stringToLatLong("xCoord, yCoord") it
        // splits the String on "," and converts each numeric string to a double and returns a double two element array
        this.locations = new double[locations.length][];
        int index = 0;
        for (var location : locations) {
            this.locations[index] = Mappable.stringToLatLong(location); // returns a double[], so each index contains double[]
            index += 1;
        }
    }
}
