package org.example;

import java.util.ArrayList;
import java.util.List;

// Interfaces can only extend other Interfaces, they cannot implement other Interfaces
interface OrbitEarth extends FlightEnabled {

    public static List<String> transitionDescriptions = new ArrayList<>();
    String achieveOrbit();

    // could say "public static String log(String description) but this is redundant as all methods
    // in an Interface are public unless otherwise specified.
    static String log(String description) {
        var today = new java.util.Date();
        return today + ": " + description;
    }

    private String logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        return log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        transitionDescriptions.add(logStage(stage, "Beginning transition to " + nextStage));
        return nextStage;
    }
}
