package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    IfThenExamples ifThenExamples;
    @BeforeEach
    public void setUp() {
        ifThenExamples = new IfThenExamples(100);
    }

    @Test
    public void testIfBranch() {
        Assertions.assertEquals(
            "Your score was less than 1000.",
            ifThenExamples.scoreResults()
        );
    }

    @Test
    public void testIfElseBranch() {
        ifThenExamples.setScore(2500);
        Assertions.assertEquals(
                "Your score was between 1000 and 5000 inclusive.",
                ifThenExamples.scoreResults()
        );
    }

    @Test
    public void testElseBranch() {
        ifThenExamples.setScore(6000);
        Assertions.assertEquals(
            "Your score was greater than 5000.",
            ifThenExamples.scoreResults()
        );
    }

    @Test
    public void testStatementsPartOne() {
        int myVariable = 50;
        myVariable++;
        Assertions.assertEquals(51, myVariable);
    }

    @Test
    public void testIfThenElse() {
        String firstExpected = "Your score was 5000";
        String secondExpected = "Got to the else branch";
        String thirdExpected = "Your score was greater than 4999 and less than 5001";
        String results = "";
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score == 5000) {
            results = "Your score was 5000";
        }
        Assertions.assertEquals(firstExpected, results);

        if (score < 5000) {
            results = "Your score was less than 5000";
        } else {
            results = "Got to the else branch";
        }
        Assertions.assertEquals(secondExpected, results);

        if (score < 5000 && score > 1000) {
            results = "Your score was less than 5000 but greater than 1000";
        } else if (score > 4999 && score < 5001) {
            results = "Your score was greater than 4999 and less than 5001";
        } else {
            results = "Got to the else branch";
        }
        Assertions.assertEquals(thirdExpected, results);
    }
}
