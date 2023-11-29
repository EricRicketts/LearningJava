package org.example;

public class NumberOfDaysInMonth {

    public static Boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
