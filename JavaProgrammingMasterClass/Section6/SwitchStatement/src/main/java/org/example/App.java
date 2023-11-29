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
}
