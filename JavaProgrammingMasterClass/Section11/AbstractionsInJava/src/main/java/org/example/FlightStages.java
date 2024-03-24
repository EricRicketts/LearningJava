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
}