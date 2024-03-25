package org.example;

public enum FlightStages implements Trackable {

    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;


    @Override
    public String track() {
        String trackingResult = "Not currently tracking.";
        if (this != GROUNDED) {
            trackingResult = "Monitoring " + this + " from the ground station.";
        }
        return trackingResult;
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}