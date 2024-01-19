package org.example;


public class Car {

    private final String description;

    public static Car getType(String description, double avgKmPerLitre, int cylinders, int octane) {
        return switch (description) {
            case "GasPoweredCar" ->
                    new GasPoweredCar("GasPoweredCar", avgKmPerLitre, cylinders, octane);
            default -> new Car(description);
        };
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return "A " + this.getClass().getSimpleName() + " is starting its engine.";
    }

    public String drive() {
        String driveStatement = "A " + this.getClass().getSimpleName() + " is now being driven.";
        return String.join("\n", this.runEngine(), driveStatement);
    }

    protected String runEngine() {
        return "A " + this.getClass().getSimpleName() + " is now at idle.";
    }

    public Car(String description) {
        this.description = description;
    }
}
