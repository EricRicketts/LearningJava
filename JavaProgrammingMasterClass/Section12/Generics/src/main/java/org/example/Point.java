package org.example;

import java.util.Arrays;

abstract class Point implements Mappable {
/*  we are not required to implement Mappable's render method as this
    is an abstract class, so we do not get an error in IntelliJ
    if we do not implement the render method, the instructor did it anyway

    Note "location" is final because once set in the constructor this is no need to
    update it.  "location" is declared as a double[], since the method location() returns a
    String in the format [xCoord, yCoord] it is best to leave it as a double[] as the
    readers of the code can clearly understand the first coordinate is latitude and the
    second coordinate is longitude.

    In the render() method it is assumed the "this" is a call to "toString" which
    properly identifies the object.
 */
    private final double[] location;

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
