package org.example;

public class Jet implements FlightEnabled, Trackable {

    @Override
    public String takeOff() {
        return getClass().getSimpleName() + " taking off under full engine power.";
    }

    @Override
    public String land() {
        return getClass().getSimpleName() + " landing on a short runway.";
    }

    @Override
    public String fly() {
        return getClass().getSimpleName() + " flying at 50,000 feet over the Pacific Ocean.";
    }

    @Override
    public String track() {
        return getClass().getSimpleName() + " being tracked by NORAD.";
    }

    @Override
    public FlightStages transition (FlightStages stage) {
        // this is the call to the default method transition from the FlightEnabled Interface
        // when ever you call a default Interface method from an overridden method one needs to qualify
        // "super" with the Interface type.  In the Jet class hierarchy there is no class by which
        // we can call "super" on.  In the current situation, the behavior of the Jet class is modified
        // by the FlightEnabled and Trackable Interfaces.  Since an Interface is not a class, then we
        // have to tell Java the type to call super on.  We cannot instantiate in Interface, create
        // objects from it, but we can call concrete methods from the Interface just as we would call
        // static methods on a class.  We can also call default methods from instances of classes that
        // implement the interface.
        return FlightEnabled.super.transition(stage);
    }
}
