package org.example;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) return -1;
        return switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if (isLeapYear(year)) yield 29;
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}
