package org.example;

public interface FlightEnabled {

    public abstract String takeOff();

    abstract String land();

    String fly();

    /*
        In the Interface declaration we do not have to declare the abstract modifier because the abstract modifier
        is implicitly declared for all interfaces.  Note for an Abstract class we are required to do so to
        differentiate an abstract class from a regular class.

        Note in the second method we did not declare the access modifier and in the third method we did not declare
        both the access modifier and the abstract keyword.  For Interface methods which are declared without a body,
        such methods are declared both public and abstract.
    */
}
