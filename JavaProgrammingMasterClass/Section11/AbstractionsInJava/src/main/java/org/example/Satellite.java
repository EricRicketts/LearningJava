package org.example;

public class Satellite implements OrbitEarth {
    /*
        If you use the IntelliJ tools to instantiate the methods, the access modifiers are added
        automatically, otherwise one has to remember to add them in manually or IntelliJ will flag
        an error.
    */

    FlightStages stage = FlightStages.GROUNDED;
    String className = getClass().getSimpleName();

    @Override
    public String takeOff() {
        return className + transition(" taking off.");
    }

    @Override
    public String land() {
        return className + transition(" is landing.");
    }

    @Override
    public String fly() {
        return className + transition(" maintaining orbit.") + " Currently engaging in data collection.";
    }

    @Override
    public String achieveOrbit() {
        return className + transition(" has achieved orbit.");
    }

    public String transition(String description) {
        stage = transition(stage); // this is the OrbitEarth transition method
        return description + " " + stage.track();
    }
}
