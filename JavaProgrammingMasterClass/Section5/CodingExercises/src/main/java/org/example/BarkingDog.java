package org.example;
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean isSleeping = false;
        if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) isSleeping = true;
        return barking && isSleeping;
    }
}
