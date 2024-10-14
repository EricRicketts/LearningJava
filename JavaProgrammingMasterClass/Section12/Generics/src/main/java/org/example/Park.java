package org.example;

public class Park extends Point {
    /*
        This is very important to understand, Point is an abstract class so it cannot be instantiated, by testing
        Park we are implicitly testing Point.  For the Park Class, getName() and setName() are self-explanatory.
        However, toString is important, as toString() is always called when the object is displayed in a String
        context.

        Since Park extends Point, the render() method of Point is inherited, which contains the following code:
        "Render " + this + " as POINT (" + location() + ")".  The Point render() methods assumes an appropriate
        call to "toString()" is made as "this" is in a String context.  Park defines "toString()" below.  The
        location() method is defined in the Point class, so it gets inherited by the Park class and executed.  Note
        in the Park construction there is a call to the Point constructor => super(location) which stores the
        location variable for Park.  Note since Park extends Point there is no need for it to declare the location
        variable as it comes with the Point class.
    */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + this.getName() + '\'' +
                "}";
    }

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }
}
