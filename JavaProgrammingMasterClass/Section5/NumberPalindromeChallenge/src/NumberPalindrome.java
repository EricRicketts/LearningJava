public class NumberPalindrome {

    static public boolean isPalindrome(int number) {
        int reverse = 0, digit = 0, base = 10, remainingNumber = number;
        boolean reverseCalculated = false;
        while (!reverseCalculated) {
            digit = remainingNumber % base;
            if (Math.abs(remainingNumber) < base) {
                reverse += digit;
                reverseCalculated = true;
            } else {
                reverse = base * (reverse + digit);
            }
            remainingNumber /= base;
        }
        return number == reverse;
    }
}
/*
    We need to calculate the reverse number
    1.  pick off the last digit
    2.  multiply the current reverse by 10 and then add 10 times the digit to reverse
    3.  However we when we get to the last digit we do not want to multiply by 10, we just want to add it
    4.  So once we get the last digit we need to test if the current number / 10 == 0 if so we just add the last
    digit
    final test is number == reverse
*/
