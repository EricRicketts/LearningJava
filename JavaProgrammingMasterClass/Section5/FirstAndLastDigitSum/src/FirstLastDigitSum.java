public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int lastDigit = 0, firstDigit = 0, remainingNumber = number, count = 0;
        final int base = 10;
        boolean sumCalculated = false;

        while (!sumCalculated) {
            if (count == 0) lastDigit = remainingNumber % base;
            count++;
            if (remainingNumber < base) {
                firstDigit = remainingNumber % base;
                sumCalculated = true;
            }
            remainingNumber = remainingNumber / base;
        }
        return firstDigit + lastDigit;
    }
}
/*
    We must identify the first and last digits
    1.  the first time through the loop pick off the last digit n % 10
    2.  get the remaining digits n / 10
    3.  we arrive at the last digit when n / 10 < 10, then we can use n % 10 to get the first digit
*/
