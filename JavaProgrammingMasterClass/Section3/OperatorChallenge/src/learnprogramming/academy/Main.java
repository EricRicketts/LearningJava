package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {
        double firstVar = 20.00d;
        double secondVar = 80.00d;
        double thirdVar = 100d * (firstVar + secondVar);
        double remainder = thirdVar % 40.00d;
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);
        if (isZero) {
            System.out.println("remainder is zero");
        } else {
            System.out.println("Got some remainder");
        }
    }
}
