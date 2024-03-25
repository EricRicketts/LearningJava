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
        return FlightEnabled.super.transition(stage);
    }
}
