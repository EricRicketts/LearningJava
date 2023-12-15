package org.example;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        getMinAndMax();
    }

    public static void getMinAndMax() {
        double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY;
        boolean continueLoop = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, the program will track minimum and maximum values entered.");
        System.out.println("To quit the program enter a non-numeric value.");
        System.out.println();

        do {
            System.out.println("Enter a number: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } catch (NumberFormatException nfe) {
                continueLoop = false;
            }
        } while (continueLoop);

        System.out.println("Maximum number is " + max + ".  " + "Minimum number is " + min + ".");
    }
}
