package org.example;

public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private final int batterySize;

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    @Override
    public String startEngine() {
        String extraInformation =
            "This " + this.getClass().getSimpleName() + " has a batter capacity of " +
            this.getBatterySize() + " kWh" + " and gets " + this.getAvgKmPerCharge() +
            " km on a single charge.";
        return String.join("\n", super.startEngine(), extraInformation);
    }

    @Override
    public String drive() {
        String firstStatement =
            "This " + this.getClass().getSimpleName() + " has a battery rated at " +
            String.valueOf(this.batterySize) + " kwh.";
        String secondStatement =
                "This " + this.getClass().getSimpleName() + " gets " +
                String.valueOf(this.getAvgKmPerCharge()) + " km on a single charge.";
        String thirdStatement = "Make sure you fully charge before a long trip!";
        return String.join("\n", super.drive(), firstStatement, secondStatement, thirdStatement);
    }

    public ElectricCar(
            String description, int horsepower,
            double avgKmPerCharge, int batterySize
    ) {
        super(description, horsepower);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}
