package org.example;

import java.text.DecimalFormat;

public record BasketballPlayer(String name, String position, double ppg) implements Player {
    public static String formatPointsPerGate(double ppg) {
        return new DecimalFormat("00.0").format(ppg);
    }

}
