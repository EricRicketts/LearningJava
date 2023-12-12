package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiagonalStarTest {

    String expected, result;

    @Test
    public void testDiagonalStarFive() {
        expected =
            "*****\n" +
            "** **\n" +
            "* * *\n" +
            "** **\n" +
            "*****";
        result = DiagonalStar.printSquareStar(5);
        Assertions.assertEquals(
                expected,
                result
        );
    }

    @Test
    public void testDiagonalStarSix() {
        expected =
            "******\n" +
            "**  **\n" +
            "* ** *\n" +
            "* ** *\n" +
            "**  **\n" +
            "******";
        String result = DiagonalStar.printSquareStar(6);
        Assertions.assertEquals(
                expected,
                result
        );
    }

    @Test
    public void testDiagonalStarSeven() {
        expected =
            "*******\n" +
            "**   **\n" +
            "* * * *\n" +
            "*  *  *\n" +
            "* * * *\n" +
            "**   **\n" +
            "*******";
        result = DiagonalStar.printSquareStar(7);
        Assertions.assertEquals(
                expected,
                result
        );
    }

    @Test
    public void testDiagonalStarEight() {
        expected =
            "********\n" +
            "**    **\n" +
            "* *  * *\n" +
            "*  **  *\n" +
            "*  **  *\n" +
            "* *  * *\n" +
            "**    **\n" +
            "********";
        result = DiagonalStar.printSquareStar(8);
        Assertions.assertEquals(
                expected,
                result
        );
    }

    @Test
    public void testDiagonalStarNine() {
        expected =
            "*********\n" +
            "**     **\n" +
            "* *   * *\n" +
            "*  * *  *\n" +
            "*   *   *\n" +
            "*  * *  *\n" +
            "* *   * *\n" +
            "**     **\n" +
            "*********";
        result = DiagonalStar.printSquareStar(9);
        Assertions.assertEquals(
                expected,
                result
        );
    }

    @Test
    public void testDiagonalStarTen() {
        expected =
            "**********\n" +
            "**      **\n" +
            "* *    * *\n" +
            "*  *  *  *\n" +
            "*   **   *\n" +
            "*   **   *\n" +
            "*  *  *  *\n" +
            "* *    * *\n" +
            "**      **\n" +
            "**********";
        result = DiagonalStar.printSquareStar(10);
        Assertions.assertEquals(
                expected,
                result
        );
    }
}
