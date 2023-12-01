package org.example;

public class SumThreeAndFiveChallenge {

    public static int sumMultiplesOfThreeOrFive(int beginRange, int endRange) {
        int sum = 0;

        for (int number = beginRange; number <= endRange; number++) {
            if ((number % 3 == 0) || (number % 5 == 0)) sum = sum + number;
        }
        return sum;
    }

    public static int sumMultiplesOfThreeAndFive(int beginRange, int endRange) {
        int sum = 0;

        for (int number = beginRange; number <= endRange; number++) {
            if ((number % 3 == 0) && (number % 5 == 0)) sum = sum + number;
        }
        return sum;
    }
}
