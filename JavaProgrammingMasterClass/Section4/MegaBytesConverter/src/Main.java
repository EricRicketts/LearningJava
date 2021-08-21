public class Main {
    public static void main(String[] args) {
        int[] testValues = {2500, -1024, 5000};
        for (int value: testValues) {
            MegaBytesConverter.printMegaBytesAndKiloBytes(value);
        }
    }
}
