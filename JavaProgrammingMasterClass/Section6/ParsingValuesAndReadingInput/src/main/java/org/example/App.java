package org.example;

public class App {

    public static void main(String[] args) {
        int currentYear = 2023;
        System.out.println(App.getInputFromConsole(currentYear));
    }

    public static int stringToIntegerConversion() {
        String currentYear = "2023";
        String birthYear = "1999";

        int age = Integer.parseInt(currentYear) - Integer.parseInt(birthYear);

        return age;
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi " + name + " , thanks for taking the course!!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        String age = String.valueOf(currentYear - Integer.parseInt(dateOfBirth));

        return "Your age is " + age + " years.";
    }
}
