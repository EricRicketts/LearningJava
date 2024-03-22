package org.example;

public interface FlightEnabled {

    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    // in the MIlES_TO_KM constant, the modifiers "public static final" are redundant
    // in an interface as those are implicit for an Interface constant, so the constant
    // below KM_TO_MILES has the implicit modifiers "public static final".  There is
    // no need to add modifiers to a field in an Interface other than the data type.
    // Since neither an Interface nor Abstract class can be instantiated, there are no
    // instance fields in either structure.
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
