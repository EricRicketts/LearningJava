package org.example;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean catIsPlaying = false;
        if (summer && (temperature >= 25 && temperature <= 45)) {
            catIsPlaying = true;
        } else if (temperature >= 25 && temperature <= 35) {
            catIsPlaying = true;
        }

        return catIsPlaying;
    }
}
