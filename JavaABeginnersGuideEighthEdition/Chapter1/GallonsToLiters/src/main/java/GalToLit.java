public class GalToLit {
    public static String main() {
        double gallons = 10.0, liters;
        final double litersPerGallon = 3.7854;

        liters = gallons * litersPerGallon;

        return Double.toString(gallons) + " gallons is " + Double.toString(liters) + " liters.";
    }
}
