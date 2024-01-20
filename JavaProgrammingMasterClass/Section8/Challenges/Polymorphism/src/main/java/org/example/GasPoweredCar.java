package org.example;

public class GasPoweredCar extends Car {

    private final double avgKmPerLitre;
    private final int cylinders;
    private int octane;

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getOctane() {
        return octane;
    }

    public void setOctane(int octane) {
        this.octane = octane;
    }

    @Override
    public String startEngine() {
        String extraInformation =
            "This " + this.getClass().getSimpleName() + " has " + this.getCylinders() +
            " cylinders and gets " + this.getAvgKmPerLitre() + " km/L.";
        return String.join("\n", super.startEngine(), extraInformation);
    }

    @Override
    public String drive() {
        String extraInformation =
            String.join(
            " ", "This",
                    this.getClass().getSimpleName(), "needs an octane rating of at least",
                    this.getOctane() + "."
            );
        return String.join("\n", super.drive(), extraInformation);
    }

    public GasPoweredCar(
        String description, int horsepower, double avgKmPerLitre,
        int cylinders, int octane
    ) {
        super(description, horsepower);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.octane = octane;
    }
}
