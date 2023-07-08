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
    private String expectedNameAndPosition;
    private String resultantNameAndPosition;

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

    @Test
    public void testForScoreOf1500() {
        setExpectedNameAndPosition("Eric managed to get into position 1 on the high score list");
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition(
                        "Eric",
                        ScoringChallenge.calculateHighScorePosition(1500)
                )
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf1000() {
        setExpectedNameAndPosition("Eric managed to get into position 1 on the high score list");
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition(
                        "Eric",
                        ScoringChallenge.calculateHighScorePosition(1000)
                )
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf500() {
        setExpectedNameAndPosition("Eric managed to get into position 2 on the high score list");
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition(
                        "Eric",
                        ScoringChallenge.calculateHighScorePosition(500)
                )
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf100() {
        setExpectedNameAndPosition("Eric managed to get into position 3 on the high score list");
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition(
                        "Eric",
                        ScoringChallenge.calculateHighScorePosition(100)
                )
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf25() {
        setExpectedNameAndPosition("Eric managed to get into position 4 on the high score list");
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition(
                        "Eric",
                        ScoringChallenge.calculateHighScorePosition(25)
                )
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }
}
