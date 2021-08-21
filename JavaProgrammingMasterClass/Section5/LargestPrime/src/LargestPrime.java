public class LargestPrime {

    public static int getLargestPrime(int number) {
       if (number <= 1) {
           return -1;
       } else {
            int div = 2;
            while (div < number) {
                if (number % div != 0) {
                    div++;
                } else {
                    number = number / div;
                    div = 2;
                }
            }
       }
       return number;
    }
}
/*
    1.  One really must understand how this algorithm works, I took this from the Internet as I was struggling with
    my own solution.
    2.  First if the number is <= 1 then return -1 as per the instructions because the number will not
    have any prime factors.
    3.  A note here if the number is itself prime then we end up returning the original number
    4.  if the number has a divisor we divide the number by the divisor to get a new number, then we check to see
    if this divisor is prime.  Note since we start the divisors at 2, when we hit the first divisor the quotient
    is going to be the largest factor because the divisor we chose is going to be the smallest factor.
    5.  We then check if the remaining number has divisors, if it does we know the quotient will be the largest factor
    because the divisor was the smallest factor.

    see how this works with 12
    12 / 2 = 6, so quotient is the largest factor
    but 6 / 2 is 3 so 3 is not the largest factor
    but 3 is prime so it is the largest factor of 12.
*/
