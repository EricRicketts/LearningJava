public class LastDigitChecker {

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        int base = 10;
        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            int n1LastDigit = n1 % base, n2LastDigit = n2 % base, n3LastDigit = n3 % base;
            return (n1LastDigit == n2LastDigit) || (n2LastDigit == n3LastDigit) || (n3LastDigit == n1LastDigit);
        } else {
            return false;
        }
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }
}
