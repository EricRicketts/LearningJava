package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DayOfTheWeekTest {

    public static String switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        return switch(weekDay) {
            case SUNDAY -> "Sunday is day " + weekDayInteger;
            case MONDAY -> "Monday is day " + weekDayInteger;
            case TUESDAY -> "Tuesday is day " + weekDayInteger;
            case WEDNESDAY -> "Wednesday is day " + weekDayInteger;
            case THURSDAY -> "Thursday is day " + weekDayInteger;
            case FRIDAY -> "Friday is day " + weekDayInteger;
            case SATURDAY -> "Saturday is day " + weekDayInteger;
            default -> weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger;
        };
    }

    private DayOfTheWeek weekDay;

    @BeforeEach
    public void setUp() {
        weekDay = DayOfTheWeek.THURSDAY;
    }

    @Test
    public void testEnumValue() {
        Assertions.assertEquals("THURSDAY", weekDay.name());
    }

    @Test
    public void testOrdinalValue() {
        Assertions.assertEquals(4, weekDay.ordinal());
    }

    @Test
    public void testValuesMethod() {
        DayOfTheWeek[] allDays = DayOfTheWeek.values();
        Assertions.assertEquals("TUESDAY", allDays[2].toString());
    }

    @Test
    public void testSwitchDayOfWeek() {
        String expected = "Tuesday is day 3";
        DayOfTheWeek weekDay = DayOfTheWeek.TUESDAY;
        String results = switchDayOfWeek(weekDay);
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testSwitchDayOfWeekDefault() {
        String expected = "Noneday is Day 8";
        DayOfTheWeek weekDay = DayOfTheWeek.NONE;
        String results = switchDayOfWeek(weekDay);
        Assertions.assertEquals(expected, results);

    }
}
