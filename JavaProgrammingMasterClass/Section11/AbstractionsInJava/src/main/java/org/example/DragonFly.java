package org.example;

public record DragonFly(String name, String type) implements FlightEnabled {
    private static String recordName = "DragonFly";
    // just as classes can implement an Interface so can a Record.  As with the class
    // all methods have to be implemented.
    @Override
    public String takeOff() {
        return recordName + " has taken off from the Sunflower.";
    }

    @Override
    public String land() {
        return recordName + " has landed on the Sunflower.";
    }

    @Override
    public String fly() {
        return recordName + " is flying in the field of Sunflowers.";
    }
}
