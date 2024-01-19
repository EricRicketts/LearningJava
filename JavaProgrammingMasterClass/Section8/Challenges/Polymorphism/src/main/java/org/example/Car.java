package org.example;


public class Car {

    private final String description;
    private int horsepower;

    public static Car getType(
        String description, int horsepower, double avgKmPerLitre,
        int cylinders, int octane, double avgKmPerCharge,
        int batterySize
    ) {
        return switch (description) {
            case "GasPoweredCar" ->
                    new GasPoweredCar("GasPoweredCar", horsepower, avgKmPerLitre, cylinders, octane);
            case "ElectricCar" ->
                    new ElectricCar("ElectricCar", horsepower, avgKmPerCharge, batterySize);
            default -> new Car(description, horsepower);
        };
    }

    public String getDescription() {
        return description;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
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

    public Car(String description, int horsepower) {
        this.description = description;
        this.horsepower = horsepower;
    }
}
