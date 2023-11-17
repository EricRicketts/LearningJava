package org.example;

public class IfThenExamples {
    public IfThenExamples(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int score;

    public String scoreResults() {
        String result = "";
        if (score < 1000) {
            result = "Your score was less than 1000.";
        } else if (score <= 5000 && score >= 1000) {
            result = "Your score was between 1000 and 5000 inclusive.";
        } else {
            result = "Your score was greater than 5000.";
        }
        return result;
    }
}
