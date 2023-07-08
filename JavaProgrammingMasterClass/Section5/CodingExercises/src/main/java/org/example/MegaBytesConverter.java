package org.example;

public class MegaBytesConverter {

    public static String printMegaBytesAndKiloBytes(int kiloBytes) {
        String conversionString = "Invalid Value";
        final int kiloBytesPerMegaByte = 1024;
        int megaBytes = kiloBytes / kiloBytesPerMegaByte;
        int remainingKiloBytes = kiloBytes % kiloBytesPerMegaByte;

        if (kiloBytes >= 0) {
            conversionString = kiloBytes + " KB = " + megaBytes + " MB" +
                    " and " + remainingKiloBytes + " KB";
        }
        return conversionString;
    }
}