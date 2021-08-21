package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 and greater than 1000.");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000.");
        } else {
            System.out.println("Your score was greater than or equal to 5000.");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
            score = 10_000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        /*
            mention variable scope here, code blocks have access to variables created outside of the code block
            but variables created inside of the code block cannot be accessed outside of the code block.
            int recordFinalScore = finalScore; // this would give an error outside of the code block above
        */
    }
}
