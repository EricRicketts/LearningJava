package org.example;

public class HybridCar extends Car {

    private final int batterySize;
    private final int cylinders;
    private double avgKmPerLitre;

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public String startEngine() {
        String extraInformation =
            "This " + this.getClass().getSimpleName() + " has a batter capacity of " +
            this.getBatterySize() + " kWh" + " and gets " + this.getAvgKmPerLitre() + " km/L.";
        return String.join("\n", super.startEngine(), extraInformation);
    }

    @Override
    public String drive() {
        String firstStatement =
                "This " + this.getClass().getSimpleName() + " has a battery rated at " +
                        String.valueOf(this.getBatterySize()) + " kwh.";
        String secondStatement =
                "This " + this.getClass().getSimpleName() + " gets " +
                        String.valueOf(this.getAvgKmPerLitre()) + " km per litre.";
        String thirdStatement = "Though not a pure EV, still make sure you fully charge before a long trip!";
        return String.join("\n", super.drive(), firstStatement, secondStatement, thirdStatement);
    }

    public HybridCar(String description, int horsepower, int batterySize,
                     int cylinders, double avgKmPerLitre
    ) {
        super(description, horsepower);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }
}
