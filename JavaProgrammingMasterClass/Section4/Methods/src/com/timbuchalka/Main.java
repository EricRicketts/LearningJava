package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int myFirstScore = calculateScore(true, 800, 5, 100);
        int mySecondScore = calculateScore(true, 10_000, 8, 200);
        int[] myScoreArray = {myFirstScore, mySecondScore};
        int[] mySecondScoreArray = {1500, 900, 400, 50};
        for (int score : myScoreArray) {
            System.out.println("Your score was " + score);
        }
        for (int score : mySecondScoreArray) {
            displayHighScorePosition("Elmer Fudd", calculateHighScorePosition(score));
        }
    }
    public static int calculateHighScorePosition(int score) {
        int position = 4;
       if (score >= 1000) {
           position = 1;
       } else if (score >= 500) {
           position =  2;
       } else if (score >= 100) {
           position =  3;
       }
       return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        final int extraBonus = 1000;
        int finalScore = score + (levelCompleted * bonus) + extraBonus;
        return gameOver ? finalScore : -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
}
