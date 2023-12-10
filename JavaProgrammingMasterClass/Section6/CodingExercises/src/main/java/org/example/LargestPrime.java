package org.example;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int largestPrime = 2;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            int possiblePrimeFactor = -1;
            // divisor found and the divisor is less than the number / 2
            // we then check to see if the divisor is prime in the second for loop
            if (number % divisor == 0) possiblePrimeFactor = divisor;
            // in this case the divisor is > number / 2 so the number itself is prime
            // as we have not found any divisors
            if ((divisor > number / 2) && (number > largestPrime)) {
                largestPrime = number;
                break;
            }
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
            }
        }
        return largestPrime;
    }
}
/*
    1.  take the number 21, factors are 3 and 7
    2.  2 does not work
    3.  3 works so factor = 3
    4.  start with primeFactor = 2
    5.  prime
*/
