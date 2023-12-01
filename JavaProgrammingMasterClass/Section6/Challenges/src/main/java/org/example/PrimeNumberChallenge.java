package org.example;

public class PrimeNumberChallenge {

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findPrimeNumbersInRange(int beginRange, int endRange) {
        int counter = 0;
        for (int number = beginRange; number <= endRange; number++) {
            if (counter == 3) break;
            if (isPrime(number)) {
                counter += 1;
            }
        }
        return counter;
    }
}
