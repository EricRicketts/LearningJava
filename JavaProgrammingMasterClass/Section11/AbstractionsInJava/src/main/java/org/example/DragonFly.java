package org.example;

public record DragonFly(String name, String type) implements FlightEnabled {
    // just as classes can implement an Interface so can a Record.  As with the class
    // all methods have to be implemented.

    private String getNameAndType() {
        return name + " also known as " + type;
    }
    @Override
    public String takeOff() {
        return getNameAndType() + " has taken off from the Sunflower.";
    }

    @Override
    public String land() {
        return getNameAndType() + " has landed on the Sunflower.";
    }

    @Override
    public String fly() {
        return getNameAndType() + " is flying in a field of Sunflowers.";
    }
}
