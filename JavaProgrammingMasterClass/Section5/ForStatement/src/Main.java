public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i = i+1) {
            System.out.println("$10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10_000, i)));
        }
        System.out.println();
        for (int i = 8; i > 1; i = i-1) {
            System.out.println("$10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10_000, i)));
        }

        int count = 0;
        for (int i = 1; i < 10; i++) {
           if (count == 3) break;
           if (isPrime(i)) {
               System.out.println(i + " is prime.");
               count += 1;
           }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
