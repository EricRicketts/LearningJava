public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        final int kiloBytesPerMegaByte = 1024;
        int megaBytes = kiloBytes / kiloBytesPerMegaByte;
        int remainingKiloBytes = kiloBytes % kiloBytesPerMegaByte;
        String conversionString = kiloBytes + " KB = " + megaBytes + " MB" + " and " + remainingKiloBytes + " KB";

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(conversionString);
        }
    }
}
