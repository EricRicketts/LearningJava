public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int evenDigitSum = 0, currentDigit = 0, base = 10, remainingNumber = number;
        boolean atFirstDigit = false;
        if (number < 0) return -1;

        while (!atFirstDigit) {
            atFirstDigit = remainingNumber / base == 0;
            currentDigit = remainingNumber % base;
            if (currentDigit % 2 == 0) {
                evenDigitSum += currentDigit;
                remainingNumber /= base;
            } else {
                remainingNumber /= base;
            }
        }
        return evenDigitSum;
    }
}
/*
    1.  if the digit is in an even position, using starting index = 0, then skip the calculation but increment
    the digit position.
    2.  If the digit is in an odd position using staring index = 0, perform the digit sum calculation and increment
    the digit position.
    3.  the loop exit position is when we reach the last digit number / 10 < 10
*/