package org.example;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) return false;
        boolean hasSharedDigit = false;

        int firstDigitOfFirstNumber = firstNumber % 10;
        int remainingFirstNumber = firstNumber / 10;
        int secondDigitOfFirstNumber = remainingFirstNumber % 10;

        int firstDigitOfSecondNumber = secondNumber % 10;
        int remainingSecondNumber = secondNumber / 10;
        int secondDigitOfSecondNumber = remainingSecondNumber % 10;

        if ((firstDigitOfFirstNumber == firstDigitOfSecondNumber) ||
            (firstDigitOfFirstNumber == secondDigitOfSecondNumber)) hasSharedDigit = true;

        if ((secondDigitOfFirstNumber == firstDigitOfSecondNumber) ||
            (secondDigitOfFirstNumber == secondDigitOfSecondNumber)) hasSharedDigit = true;

        return hasSharedDigit;
    }
}
