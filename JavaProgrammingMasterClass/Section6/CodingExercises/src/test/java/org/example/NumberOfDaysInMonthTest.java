package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfDaysInMonthTest {

    @Test
    public void testLeapYear() {
        List<Integer> years = new ArrayList<>(Arrays.asList(
                -200, 1584, 1590, 1704, 1810, 1884, 2000, 1800
            )
        );
        List<Boolean> areLeapYears = new ArrayList<>(Arrays.asList(
                false, true, false, true, false, true, true, false
            )
        );
        for (int index = 0; index < years.size(); index++) {
            int year = years.get(index);
            boolean isLeapYear = areLeapYears.get(index);
            Assertions.assertEquals(
                    isLeapYear,
                    NumberOfDaysInMonth.isLeapYear(year)
            );
        }
    }

    @Test
    public void testDaysInMonth() {
        List<Integer> monthNumbers = new ArrayList<>(Arrays.asList(
                -1, 0, 1, 2, 3,
                4, 5, 6, 7, 8,
                9, 10, 11, 12, 13,
                3, 4, 2
            )
        );
        List<Integer> years = new ArrayList<>(Arrays.asList(
                2001, 2002, 1900, 1904, 1835,
                1723, 1645, 2013, 2000, 1584,
                1601, 1701, 1801, 1901, 2011,
                -2000, 10_000, 1905
            )
        );
        List<Integer> results = new ArrayList<>(Arrays.asList(
                -1, -1, 31, 29, 31,
                30, 31, 30, 31, 31,
                30, 31, 30, 31, -1,
                -1, -1, 28
            )
        );

        for (int index = 0; index < years.size(); index++) {
            int month = monthNumbers.get(index);
            int year = years.get(index);
            int result = results.get(index);
            Assertions.assertEquals(
                    result,
                    NumberOfDaysInMonth.getDaysInMonth(month, year)
            );
        }
    }

    @Test
    public void testCourseLeapYearData() {
        List<Integer> years = new ArrayList<>(Arrays.asList(
                -1024, 0, 10_000, 9_000,
                1800, 1855, 1846, 1870,
                1900, 1924, 1944, 1980,
                2000, 2014, 2016, 2020,
                2100, 2104, 2140, 2150
            )
        );
        List<Boolean> results = new ArrayList<>(Arrays.asList(
                false, false, false, false,
                false, false, false, false,
                false, true, true, true,
                true, false, true, true,
                false, true, true, false
            )
        );

        for (int index = 0; index < results.size(); index++) {
            int year = years.get(index);
            boolean result = results.get(index);
            Assertions.assertEquals(
                    result,
                    NumberOfDaysInMonth.isLeapYear(year)
            );
        }
    }

    @Test
    public void testCourseDaysInMonthData() {
        List<Integer> months = new ArrayList<>(Arrays.asList(
                1, 2, 2, 2,
                2, 2, 3, 4,
                5, 6, 7, 8,
                9, 10, 11, 12,
                12, -1, 0, 22,
                1, 13, -1
            )
        );
        List<Integer> years = new ArrayList<>(Arrays.asList(
                2020, 2020, 2018, 2016,
                2000, 1900, 2020, 2020,
                2020, 2020, 2020, 2020,
                2020, 2020, 2020, 2020,
                10_000, 2020, 2020, 2020,
                -2020, -2020, -2020
            )
        );
        List<Integer> daysInMonthList = new ArrayList<>(Arrays.asList(
                31, 29, 28, 29,
                29, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31,
                -1, -1, -1, -1,
                -1, -1, -1
            )
        );

        for (int index = 0; index < daysInMonthList.size(); index++) {
            int month = months.get(index);
            int year = years.get(index);
            int daysInMonth = daysInMonthList.get(index);
            Assertions.assertEquals(
                    daysInMonth,
                    NumberOfDaysInMonth.getDaysInMonth(month, year)
            );
        }
    }
}
