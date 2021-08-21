public class Main {
    public static final int SecondsInMinute = 60;
    public static final int MinutesInHour = 60;

    public static void main(String[] args) {
        System.out.println((getDurationString(78, 56)));
        System.out.println((getDurationString(670, 56)));
        System.out.println((getDurationString(120, 15)));
        System.out.println((getDurationString(61, 0)));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(3825));
    }

    public static String getDurationString(int minutes, int seconds) {
        String hoursString, remainingMinutesString, secondsString;
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        }
        int hours = minutes / MinutesInHour;
        int remainingMinutes = minutes % MinutesInHour;

        if (hours < 10) {
            hoursString = "0" + String.valueOf(hours);
        } else {
            hoursString = String.valueOf(hours);
        }

        if (remainingMinutes < 10) {
            remainingMinutesString = "0" + String.valueOf(remainingMinutes);
        } else {
            remainingMinutesString = String.valueOf(remainingMinutes);
        }

        if (seconds < 10) {
            secondsString = "0" + String.valueOf(seconds);
        } else {
            secondsString = String.valueOf(seconds);
        }
        return hoursString + " h " + remainingMinutesString + " m " +
                secondsString + " s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds / SecondsInMinute;
        int remainingSeconds = seconds % SecondsInMinute;

        return getDurationString(minutes, remainingSeconds);
    }
}
/*
    1.
*/
