package org.example;

public class SumOddRange {

    public static boolean isOdd(int number) {
        boolean numberIsOdd = false;
        if ((number > 0) && (number % 2 != 0)) numberIsOdd = true;
        return numberIsOdd;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 1 || end < 1 || end < start) return -1;
        for (int number = start; number <= end; number++) {
            sum = isOdd(number) ? sum + number : sum;
        }
        return sum;
    }
}
