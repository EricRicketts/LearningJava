package org.example;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Getter
@Setter
public class ChallengesSection5Test {

    private Boolean gameOver;
    private Integer score;
    private Integer levelCompleted;
    private Integer bonus;
    private Integer expectedFinalScore;
    private Integer finalScore;

    @BeforeEach
    public void setUp() {
        setGameOver(true);
        setScore(800);
        setLevelCompleted(5);
        setBonus(100);
    }

    @Test
    public void testOneBranch() {
        setExpectedFinalScore(Integer.valueOf("1300"));
        setFinalScore(getScore());
        if (gameOver) {
            setFinalScore(getScore() + getLevelCompleted() * getBonus());
        }
        Assertions.assertEquals(expectedFinalScore, finalScore);
    }

    @Test
    public void testFirstChallenge() {
        setScore(10_000);
        setLevelCompleted(8);
        setBonus(200);
        setExpectedFinalScore(Integer.valueOf("11600"));
        if (gameOver) {
            setFinalScore(getScore() + getLevelCompleted() * getBonus());
        }
        Assertions.assertEquals(expectedFinalScore, finalScore);
    }
}
