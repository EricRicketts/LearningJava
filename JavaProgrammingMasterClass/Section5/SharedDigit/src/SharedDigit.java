public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        boolean sharedDigitExists = false, atBeginningOfFirstNumber = false;
        int base = 10, remainingFirstNumber = firstNumber;
        boolean firstNumberWithinRange = (firstNumber >= 10 && firstNumber <= 99);
        boolean secondNumberWithinRange = (secondNumber >= 10 && secondNumber <= 99);

        if (!firstNumberWithinRange || !secondNumberWithinRange) return false;

        while (!atBeginningOfFirstNumber) {
            atBeginningOfFirstNumber = remainingFirstNumber / base == 0;
            int currentFirstNumberDigit = remainingFirstNumber % base;
            boolean atBeginningOfSecondNumber = false;
            int remainingSecondNumber = secondNumber;
            while (!atBeginningOfSecondNumber) {
                atBeginningOfSecondNumber = remainingSecondNumber / base == 0;
                int currentSecondNumberDigit = remainingSecondNumber % base;
                if (currentFirstNumberDigit == currentSecondNumberDigit) {
                    sharedDigitExists = true;
                    break;
                }
                remainingSecondNumber = remainingSecondNumber / base;
            }
            if (sharedDigitExists) break;
            remainingFirstNumber = remainingFirstNumber / base;
        }
        return sharedDigitExists;
    }
}
