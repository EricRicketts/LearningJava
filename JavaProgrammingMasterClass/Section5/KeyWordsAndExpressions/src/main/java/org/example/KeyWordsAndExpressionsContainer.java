package org.example;

public class KeyWordsAndExpressionsContainer {
    // note there is no constructor needed for this class
    // if a class has no constructor, Java creates a no
    // argument constructor for a given class
    public double convertMiToKm(double miles) {
        double conversionFactor = 1.609344;
        return miles * conversionFactor;
    }

    public int computeNewHighScore(int highScore) {
        int bonus = 1000;
        if (highScore > 50) {
            highScore += 1000;
        }
        return highScore;
    }

    public int healthAndHighScore(int health, int highScore) {
        if ((health < 25) && (highScore > 1000)) {
            highScore -= 1000;
        }
        return highScore;
    }
}
