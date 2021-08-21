import java.util.Scanner;

public class Main {
    final private static int numberOfEntries = 10;

    public static void main(String[] args) {
        int validNumberCount = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (validNumberCount < numberOfEntries) {
            System.out.println("Enter number #" + (validNumberCount + 1) + ": ");
            boolean validNumber = scanner.hasNextInt();

            if (validNumber) {
                int number = scanner.nextInt();
                sum += number;
                validNumberCount += 1;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of entered numbers is: " + sum);
        scanner.close();
    }
}

/*
    Algorithm
    1.  initialize a validNumberCount to 1
    2.  initialize a sum to 0
    3.  while validNumberCount < 10
    4.  use Enter number #1: ... Enter number #10:
    5.  if scanner.hasNextInt is false print "Invalid Number", else read the number, add it to the sum and increment
    the validNumberCount
*/
