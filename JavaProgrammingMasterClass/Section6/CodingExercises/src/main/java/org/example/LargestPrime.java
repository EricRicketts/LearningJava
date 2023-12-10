package org.example;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int largestPrime = 2;
        int halfOfNumber = number / 2;
        outer: for (int divisor = 2; divisor <= halfOfNumber; divisor++) {
            int possiblePrimeFactor = -1;
            // divisor found and the divisor is less than the number / 2
            // we then check to see if the divisor is prime in the second for loop
            if (number % divisor == 0) possiblePrimeFactor = divisor;

            // factor of number found test to see if it is prime
            if (possiblePrimeFactor != -1) {
                for (int factor = 2; factor <= possiblePrimeFactor; factor++) {
                    // if the factor is less than the possible prime factor and divides
                    // the possible prime factor without remainder then it is not a prime
                    // we can break out of this inner loop
                    if ((possiblePrimeFactor % factor == 0) &&
                    (factor < possiblePrimeFactor)) break;
                    // if the factor has incremented to the point were it equals the
                    // possible prime factor then the factor is prime a check is added
                    // to see if it is larger than the current largest prime
                    if ((factor == possiblePrimeFactor) &&
                    (possiblePrimeFactor > largestPrime)) {
                        largestPrime = possiblePrimeFactor;
                        break;
                    }
                }
                // on this alternate branch we ensure we are at half of the number
                // and that the current largest prime does not evenly divide the number
                // we can then be sure the number itself is prime
            } else if ((divisor == halfOfNumber) && (number % largestPrime != 0)) {
                largestPrime = number;
                break outer;
            }
        }
        return largestPrime;
    }
}