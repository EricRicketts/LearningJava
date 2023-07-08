package org.example;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        final double milesToKilometers = 1.609d;
        long milesPerHour = -1;
        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / milesToKilometers);
        }
        return milesPerHour;
    }

    public static String printConversion(double kilometersPerHour) {
        String conversionString = "Invalid Value";
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        String milesPerHourString = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";

        if (milesPerHour >= 0) {
            conversionString = milesPerHourString;
        }
        return conversionString;
    }
}
