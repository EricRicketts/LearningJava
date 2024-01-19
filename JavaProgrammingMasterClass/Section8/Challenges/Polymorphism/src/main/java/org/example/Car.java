package org.example;


public class Car {

    private final String description;

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return "A " + this.getClass().getSimpleName() + " is starting its engine.";
    }

    public String drive() {
        String driveStatement = "A " + this.getClass().getSimpleName() + " is now being driven.";
        return String.join("  ", this.runEngine(), driveStatement);
    }

    protected String runEngine() {
        return "A " + this.getClass().getSimpleName() + " is now at idle.";
    }

    public Car(String description) {
        this.description = description;
    }
}
