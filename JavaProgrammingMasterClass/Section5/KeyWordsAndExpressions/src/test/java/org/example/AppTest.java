package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private KeyWordsAndExpressionsContainer keyWordsAndExprContainer;

    private double kmToMi = 1.609344;

    @BeforeEach
    public void setUp() {
        keyWordsAndExprContainer = new KeyWordsAndExpressionsContainer();
    }

    @Test
    public void testConvertMiToKm() {
        assertEquals(16.09344, keyWordsAndExprContainer.convertMiToKm(10));
    }

    @Test
    public void testDoubleStatement() {
        // double kilometer = (100 * kmToMi) is a statement; remove the double
        // you have an expression => kilometer = (100 * kmToMi)
        double kilometer = (100 * kmToMi);
        assertEquals(160.9344, kilometer);
    }

    @Test
    public void testConditional() {
        /*
            expressions
            highScore = 50, highScore > 25, 1000 + highScore, highScore = 1000 + highScore
        */
        int highScore = 50;
        if (highScore > 25) highScore = 1000 + highScore;
        assertEquals(1050, highScore);

        int health = 100;
        if ((health < 25) && (highScore > 1000)) highScore = highScore - 1000;
        assertEquals(1050, highScore);
        /*
            expressions are: health = 100, health < 25, highScore > 1000,
            ((health < 25) && (highScore > 1000)), highScore - 1000,
            highScore = highScore - 1000

            Note expressions do not include the semicolon
        */
    }
}
