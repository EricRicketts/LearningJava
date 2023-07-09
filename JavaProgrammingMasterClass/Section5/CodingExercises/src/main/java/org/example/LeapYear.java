package org.example;

import com.google.common.collect.Range;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        Range<Integer> validYears = Range.closed(1, 9999);
        if (validYears.contains(year)) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) isLeapYear = true;
        }
        return isLeapYear;
    }
}
