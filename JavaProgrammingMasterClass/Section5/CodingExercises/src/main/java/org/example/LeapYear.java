package org.example;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        boolean inYearRange = (year >= 1 && year <= 9999) ? true : false;
        if (inYearRange) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) isLeapYear = true;
        }
        return isLeapYear;
    }
}
