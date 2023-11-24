package org.example;

public class SecondsAndMinutesChallenge {

    private static int minuteToSeconds = 60;
    private static int hourToSeconds = 3600;

    public static String getDuration(int totalSeconds) {
        if (totalSeconds < 0) {
            return "The seconds given must be greater than or equal to zero.";
        }
        int hours = totalSeconds / hourToSeconds;
        int remainingSecondsFromHours = totalSeconds % hourToSeconds;

        int minutes = remainingSecondsFromHours / minuteToSeconds;
        int seconds = remainingSecondsFromHours % minuteToSeconds;

        return String.format("%sh %sm %ss", hours, minutes, seconds);
    }

    public static String getDuration(int totalMinutes, int totalSeconds) {
        if (totalMinutes < 0 || (totalSeconds < 0 || totalSeconds > 59)) {
            return "The minutes given must be greater than or equal to zero and the " +
                    "seconds given must be less than a minute and greater than zero.";
        }
        totalSeconds = totalMinutes * minuteToSeconds + totalSeconds;
        return getDuration(totalSeconds);
    }
}
