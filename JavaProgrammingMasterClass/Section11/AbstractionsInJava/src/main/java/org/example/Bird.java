package org.example;

public class Bird extends GenericAnimal implements FlightEnabled, Trackable {

    @Override
    public String move() {
        return getClass().getSimpleName() + " moved.";
    }
}
