package org.example;

public class ScoringChallenge {

    public static int calculateHighScorePosition(int score) {
        int highScorePosition = 4;
        if (score >= 1000) {
            highScorePosition = 1;
        } else if (score >= 500 ) {
            highScorePosition = 2;
        } else if (score >= 100) {
            highScorePosition = 3;
        }
        return highScorePosition;
    }
    public static String displayHighScorePosition(String name, int position) {
        return name + " managed to get into position " + position + " on the high score list";
    }
}
