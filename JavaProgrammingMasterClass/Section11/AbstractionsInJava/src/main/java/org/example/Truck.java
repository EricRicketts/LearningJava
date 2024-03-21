package org.example;

public class Truck implements Trackable {

    @Override
    public String track() {
        return getClass().getSimpleName() +
                " is being tracked by the broadcast signal from its internal navigation system.";
    }
}
