package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Helper {

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy").withLocale(Locale.US);

    public String extractDateStringFromLocalDate(LocalDate date) {
        String day = addZeroToDayOfMonthLessThanTen(date.getDayOfMonth());
        String month = addZeroToDayOfMonthLessThanTen(date.getMonthValue());
        String year = Integer.toString(date.getYear());
        return month + "/" + day + "/" + year;
    }

    public String addZeroToDayOfMonthLessThanTen(int dayOfMonth) {
        return dayOfMonth < 10 ? "0" + Integer.toString(dayOfMonth) :
                Integer.toString(dayOfMonth);
    }
}
