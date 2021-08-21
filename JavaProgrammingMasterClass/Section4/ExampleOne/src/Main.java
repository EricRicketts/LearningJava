public class Main {
    public static void main(String[] args) {
        double[] myKPHArray = {1.5d, 10.25d, -5.6d, 25.42d, 75.114d, 95.75d};
        for (double kph : myKPHArray) {
            SpeedConverter.printConversion(kph);
        }
    }
}
