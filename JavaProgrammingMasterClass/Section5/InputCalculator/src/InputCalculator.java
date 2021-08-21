import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg = 0;

        while (true) {
            boolean validInput = scanner.hasNextInt();
            if (validInput) {
                int number = scanner.nextInt();
                sum += number;
                count += 1;
            } else {
                break;
            }
            scanner.nextLine();
        }
        if (sum == 0 && count == 0) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            double decimalAvg = (double) sum / count;
            avg = Math.round(decimalAvg);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
        scanner.close();
    }
}