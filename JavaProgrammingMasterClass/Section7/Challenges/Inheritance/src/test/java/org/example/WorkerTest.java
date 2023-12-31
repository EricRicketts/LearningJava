package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WorkerTest {

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy").withLocale(Locale.US);
    private Worker worker;
    private String expected, result, month, day, year;
    private LocalDate birthDate, endDate;

    private String extractDateStringFromLocalDate(LocalDate date) {
        String day = addZeroToDayOfMonthLessThanTen(date.getDayOfMonth());
        String month = Integer.toString(date.getMonthValue());
        String year = Integer.toString(date.getYear());
        return month + "/" + day + "/" + year;
    }

    private String addZeroToDayOfMonthLessThanTen(int dayOfMonth) {
        return dayOfMonth < 10 ? "0" + Integer.toString(dayOfMonth) :
            Integer.toString(dayOfMonth);
    }

    @BeforeEach
    public void setUp() {
        worker = new Worker("Elmer Fudd", "11/06/1937", "12/31/2030");
    }

    @Test
    public void testGetAndSetName() {
        String oldName = "Elmer Fudd";
        String newName = "Bugs Bunny";
        Assertions.assertEquals(oldName, worker.getName());
        worker.setName(newName);
        Assertions.assertEquals(newName, worker.getName());
    }

    @Test
    public void testGetBirthDate() {
        expected = "11/06/1937";
        birthDate = worker.getBirthDate();
        result = extractDateStringFromLocalDate(birthDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSetBirthDate() {
        expected = "10/18/2020";
        worker.setBirthDate(LocalDate.parse(expected, formatter));
        result = extractDateStringFromLocalDate(worker.getBirthDate());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetEndDate() {
        expected = "12/31/2030";
        result = extractDateStringFromLocalDate(worker.getEndDate());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSetEndDate() {
        expected = "12/01/2025";
        worker.setEndDate(LocalDate.parse(expected, formatter));
        result = extractDateStringFromLocalDate(worker.getEndDate());
        Assertions.assertEquals(expected, result);
    }
}
