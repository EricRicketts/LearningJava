package org.example;

public class ScoringChallenge {

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 ) {
            return 2; 
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
    public static String displayHighScorePosition(String name, int position) {
        return name + " managed to get into position " + position + " on the high score list";
    }
}
