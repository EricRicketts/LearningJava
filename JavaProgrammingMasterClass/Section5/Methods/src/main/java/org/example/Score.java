package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Score {
    private Boolean gameOver;
    private Integer score;
    private Integer levelCompleted;
    private Integer bonus;
    private Integer finalScore;

    public Integer calculateScore(Boolean gameOver, Integer score,
                                  Integer levelCompleted, Integer bonus) {
        Integer finalScore = Integer.valueOf("0");
        setGameOver(gameOver);
        setScore(score);
        setLevelCompleted(levelCompleted);
        setBonus(bonus);

        if (getGameOver()) {
            setFinalScore(getScore() + getLevelCompleted() * getBonus());
        }

        return getFinalScore();
    }
}