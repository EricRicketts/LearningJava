package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int currentYear = 2023;
//       System.out.println(getInputFromScanner(currentYear));
        readAndSumFiveNumbersFromTheConsole();
    }

    public static int stringToIntegerConversion() {
        String currentYear = "2023";
        String birthYear = "1999";

        int age = Integer.parseInt(currentYear) - Integer.parseInt(birthYear);

        return age;
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        String age = String.valueOf(currentYear - Integer.parseInt(dateOfBirth));

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        // java src/main/java/org/example/App.java
        int limitOfHumanAge = 125;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the course!!");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                            (currentYear - limitOfHumanAge) + " and <= " + (currentYear)
                    );
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = (age < 0) ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed!!!  Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int limitOfHumanAge = 125;
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - limitOfHumanAge;

        if ((dob < minimumYear) || (dob > currentYear)) return -1;

        return (currentYear - dob);
    }

    public static void readAndSumFiveNumbersFromTheConsole() {
        int numberCount = 0;
        int numberCountLimit = 5;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "This program asks the user to input five integers and their sum will be printed."
        );

        do {
            System.out.print("Enter Number #" + (numberCount + 1) + ": ");
            String enteredNumericString =  scanner.nextLine();
            Double enteredNumber = Double.parseDouble(enteredNumericString);
            if (enteredNumber == Math.floor(enteredNumber)) {
                sum += enteredNumber;
                numberCount += 1;
            } else {
                System.out.println("Enter a whole number not a decimal number.");
            }

        } while (numberCount < numberCountLimit);

        System.out.println("The sum of your five numbers is: " + sum);
    }
}