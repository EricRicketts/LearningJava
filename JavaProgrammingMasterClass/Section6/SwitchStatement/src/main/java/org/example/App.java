package org.example;

public class App {

    public static String firstSwitchStatement(int value) {
        String result = "";
        switch (value) {
            case 1: {
                result = "value is 1";
                break;
            }
            case 2: {
                result = "value is 2";
                break;
            }
            case 3: case 4: case 5: {
                result = "case testing for 3, 4, or 5 on one line.  Value is " + value;
                break;
            }
            default: {
                result = "value is not 1, 2, 3, 4, or 5";
            }
        }
        return result;
    }

    public static String secondSwitchStatement(int value) {
        String result = "";
        switch (value) {
            case 1 -> result = "value is 1";
            case 2 -> result = "value is 2";
            case 3, 4, 5 -> result = "case testing for 3, 4, or 5 on one line.  Value is " + value;
            default -> result = "value is not 1, 2, 3, 4, or 5";
        }
        return result;

    }

    public static String getQuarterTraditional(String month) {
        switch (month) {
            case "January": case "February": case "March":
                return "1st quarter";
            case "April": case "May": case "June":
                return "2nd quarter";
            case "July": case "August": case "September":
                return "3rd quarter";
            case "October": case "November": case "December":
                return "4th quarter";
        }
        return "Invalid entry";
    }

    public static String getQuarterEnhanced(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st quarter";
            case "April", "May", "June" -> "2nd quarter";
            case "July", "August", "September" -> "3rd quarter";
            case "October", "November", "December" -> "4th quarter";
            default -> "Invalid entry";
        };
    }

    public static String getNatoPhonetic(Character letter) {
        String natoPhonetic = "Not Found";
        switch(letter) {
            case 'A': {
                natoPhonetic = "Able";
                break;
            }
            case 'B': {
                natoPhonetic = "Baker";
                break;
            }
            case 'C': {
                natoPhonetic = "Charlie";
                break;
            }
            case 'D': {
                natoPhonetic = "Dog";
                break;
            }
            case 'E': {
                natoPhonetic = "Easy";
                break;
            }
            default: {}
        }
        return natoPhonetic;
    }

    public static String printDayOfWeek(int day) {
        // yields were put in for demonstration purposes, as this is the keyword
        // use to return from a case statement in the enhanced switch, it allows some
        // logic to be done before returning from the case statement, obviously it must
        // be the last statement in the case block in this enhanced version of switch.
        return switch(day) {
            case 0 -> "Sunday";
            case 1 -> { yield "Monday"; }
            case 2 -> "Tuesday";
            case 3 -> { yield "Wednesday"; }
            case 4 -> "Thursday";
            case 5 -> { yield "Friday"; }
            case 6 -> "Saturday";
            default -> { yield "Invalid Day"; }
        };
    }

    public static String printDayOfWeekUsingIfElse(int day) {
        String dayOfWeek = "Invalid Day";
        if (day == 0) dayOfWeek = "Sunday";
        else if (day == 1) dayOfWeek = "Monday";
        else if (day == 2) dayOfWeek = "Tuesday";
        else if (day == 3) dayOfWeek = "Wednesday";
        else if (day == 4) dayOfWeek = "Thursday";
        else if (day == 5) dayOfWeek = "Friday";
        else if (day == 6) dayOfWeek = "Saturday";

        return dayOfWeek;
    }
}