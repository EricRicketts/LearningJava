package org.example;
public class App {
    public static String calculateScore(String playerName, int score) {
        return playerName + " scored " + score + " points.";
    }

    public static String calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static String calculateScore() {
        return "No player name, no player score.";
    }
}
/*
    As Tim Buchalka states, Java does not allow for setting default parameter values, but using the
    overloaded method technique above one can essentially simulate default values for a method.

    Very important method overloading is accomplished by defining different method signatures for
    a method.  A method signature consists of the method name, and the number, type, and order of
    its parameters.  When overloading a method, the method name must remain the same and then one
    can vary the number, type, or order of the parameters.
*/
