package org.example;

import java.text.DecimalFormat;

// records can implement Interfaces but they cannot extend classes
public record BaseballPlayer (
        String name,
        String position,
        double battingAverage
) implements Player {
    public static String formatBattingAverage(double d) {
        return new DecimalFormat("0.000").format(d);
    }
}
