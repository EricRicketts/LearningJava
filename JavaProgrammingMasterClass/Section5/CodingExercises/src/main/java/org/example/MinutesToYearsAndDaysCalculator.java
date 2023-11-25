package org.example;

public class MinutesToYearsAndDaysCalculator {

    final static long minutesInHour = 60;

    final static long hoursInDay = 24;

    final static long daysInYear = 365;

    public static String returnYearsAndDays(long minutes) {
        String yearsAndDays = "";
        if (minutes < 0) {
            yearsAndDays = "Invalid Value";
            return yearsAndDays;
        }

        long minutesInYear = daysInYear * hoursInDay * minutesInHour;
        long minutesInDay = hoursInDay * minutesInHour;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long remainingDays = remainingMinutes / minutesInDay;

        yearsAndDays = String.format("%s min = %s y and %s d", minutes, years, remainingDays);
        return yearsAndDays;
    }

    public static void printYearsAndDays(long minutes) {
        String yearsAndDays = "";
        if (minutes < 0) {
            yearsAndDays = "Invalid Value";
            System.out.println(yearsAndDays);
            return;
        }

        long minutesInYear = daysInYear * hoursInDay * minutesInHour;
        long minutesInDay = hoursInDay * minutesInHour;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long remainingDays = remainingMinutes / minutesInDay;

        yearsAndDays = String.format("%s min = %s y and %s d", minutes, years, remainingDays);
        System.out.println(yearsAndDays);
    }
}
