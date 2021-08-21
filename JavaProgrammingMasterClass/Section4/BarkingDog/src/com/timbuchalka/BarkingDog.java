package com.timbuchalka;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        int[] sleepingHours = {0, 1, 2, 3, 4, 5, 6, 7, 23};
        boolean isSleepingHour = false;
        for (int hour: sleepingHours) {
            if (hour == hourOfDay) {
                isSleepingHour = true;
                break;
            }
        }
        return isBarking && isSleepingHour;
    }
}
