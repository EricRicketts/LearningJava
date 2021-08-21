package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber = 32;
        short myShortNumber = 6400;
        int myIntNumber = 100_000;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongNumber = 50_000L + 1_000_000L * (myByteNumber + myShortNumber + myIntNumber);

        System.out.println("Maximum Long Value is: " + myMaxLongValue);
        System.out.println("My myLongNumber is: " + myLongNumber);
    }
}
