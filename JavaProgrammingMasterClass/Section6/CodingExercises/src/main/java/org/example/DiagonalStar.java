package org.example;

public class DiagonalStar {

    public static String printSquareStar(int number) {
        if (number < 5) return "Invalid Value";

        String currentRow = "";
        String starPattern = "";

        for (int row = 1; row <= number; row++) {
            if (row == 1) {
                starPattern += "*".repeat(number) + "\n";
                continue;
            }
            if (row == number) {
                starPattern += "*".repeat(number);
                break;
            }
            for (int column = 1; column <= number; column++) {
                if (column == 1) {
                    currentRow += "*";
                }
                else if (column == row) {
                    currentRow += "*";
                } else if (column == number - row + 1) {
                    currentRow += "*";
                } else if (column == number) {
                    currentRow += "*" + "\n";
                }
                else {
                    currentRow += " ";
                }
            }
            starPattern += currentRow;
            currentRow = "";
        }
        return starPattern;
    }
}
/*
    *****
    ** **
    * * *
    ** **
    *****

    ********
    **    **
    * *  * *
    *  **  *
    *  **  *
    * *  * *
    **    **
    ********
*/
