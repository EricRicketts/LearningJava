package org.example;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;
        while (true) {
            try {
                String enteredNumber = scanner.nextLine();
                int validNumber = Integer.parseInt(enteredNumber);
                sum += validNumber;
                count += 1;
                avg = Math.round((sum * 1.0) / count);
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("SUM = " + sum + " " + "AVG = " + avg);
    }
}
