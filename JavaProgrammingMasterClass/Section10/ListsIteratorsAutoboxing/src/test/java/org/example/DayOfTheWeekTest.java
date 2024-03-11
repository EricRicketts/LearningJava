package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DayOfTheWeekTest {

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
}
