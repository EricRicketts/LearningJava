package org.example;

import java.util.Arrays;
import java.util.List;

abstract class Point implements Mappable {
// we are not required to implement Mappable's render method as this
// is an abstract class, so we do not get an error in IntelliJ
// if we do not implement the render method, the instructor did it anyway
    private double[] location = new double[2];

    @Override
    public String render() {
        return "Render " + this + " as POINT (" + location() + ")";
    }

    private String location() {
        return Arrays.toString(location);
    }

    public Point(String location) {
        this.location = Mappable.stringToLatLong(location);
    }
}
