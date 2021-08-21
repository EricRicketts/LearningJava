import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double minimum = Double.POSITIVE_INFINITY, maximum = Double.NEGATIVE_INFINITY;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            boolean validNumber = scanner.hasNextInt();
            if (validNumber) {
                int number = scanner.nextInt();
                if (number > maximum) {
                    maximum = number;
                }
                if (number < minimum) {
                    minimum = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("minimum: " + minimum + " maximum: " + maximum);
        scanner.close();
    }
}
