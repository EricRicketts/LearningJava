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
}
