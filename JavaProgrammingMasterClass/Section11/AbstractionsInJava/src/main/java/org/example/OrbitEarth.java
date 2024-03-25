package org.example;
// Interfaces can only extend other Interfaces, they cannot implement other Interfaces
interface OrbitEarth extends FlightEnabled {

    String achieveOrbit();

    // could say "public static String log(String description) but this is redundant as all methods
    // in an Interface are public unless otherwise specified.
    static String log(String description) {
        var today = new java.util.Date();
        return today + ": " + description;
    }
}
