package org.example;

public class Bird extends GenericAnimal implements FlightEnabled, Trackable {

    @Override
    public String move() {
        return getClass().getSimpleName() + " moved.";
    }

    @Override
    public String takeOff() {
        return getClass().getSimpleName() + " took off from the nest.";
    }

    @Override
    public String land() {
        return getClass().getSimpleName() + " landed in the nest.";
    }

    @Override
    public String fly() {
        return getClass().getSimpleName() + " is flying over the farm.";
    }

    @Override
    public String track() {
        return getClass().getSimpleName() + " has a tracking device attached.";
    }
}
