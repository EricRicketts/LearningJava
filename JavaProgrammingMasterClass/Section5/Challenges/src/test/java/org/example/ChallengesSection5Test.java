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
    private int highScorePosition;

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
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(1500));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Eric", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf1000() {
        setExpectedNameAndPosition("Wendy managed to get into position 1 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(1000));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Wendy", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf500() {
        setExpectedNameAndPosition("Fred managed to get into position 2 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(500));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Fred", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf100() {
        setExpectedNameAndPosition("Steve managed to get into position 3 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(100));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Steve", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf25() {
        setExpectedNameAndPosition("Mary managed to get into position 4 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(25));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Mary", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf999() {
        setExpectedNameAndPosition("Arthur managed to get into position 2 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(999));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Arthur", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf499() {
        setExpectedNameAndPosition("Amelia managed to get into position 3 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(499));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Amelia", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }

    @Test
    public void testForScoreOf99() {
        setExpectedNameAndPosition("Ava managed to get into position 4 on the high score list");
        setHighScorePosition(ScoringChallenge.calculateHighScorePosition(99));
        setResultantNameAndPosition(
                ScoringChallenge.displayHighScorePosition("Ava", getHighScorePosition())
        );
        Assertions.assertEquals(getExpectedNameAndPosition(), getResultantNameAndPosition());
    }
}
