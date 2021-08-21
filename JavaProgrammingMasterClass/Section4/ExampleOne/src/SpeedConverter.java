import org.w3c.dom.ls.LSOutput;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        final double milesToKilometers = 1.609d;
        return (kilometersPerHour < 0) ? -1 : Math.round(kilometersPerHour / milesToKilometers);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        String milesPerHourString = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";

        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(milesPerHourString);
        }
    }
}
