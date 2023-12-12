package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiagonalStarTest {

    @Test
    public void testDiagonalStarFive() {
        String expected =
                "*****\n" +
                "** **\n" +
                "* * *\n" +
                "** **\n" +
                "*****";
        Assertions.assertEquals(
                expected,
                DiagonalStar.printSquareStar(5)
        );
    }

    @Test
    public void testDiagonalStarEight() {
        String expected =
                "********\n" +
                "**    **\n" +
                "* *  * *\n" +
                "*  **  *\n" +
                "*  **  *\n" +
                "* *  * *\n" +
                "**    **\n" +
                "********";
        Assertions.assertEquals(
                expected,
                DiagonalStar.printSquareStar(8)
        );
    }
}
