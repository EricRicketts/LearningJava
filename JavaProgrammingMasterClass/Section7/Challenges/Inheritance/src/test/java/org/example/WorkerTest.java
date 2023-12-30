package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class WorkerTest {

    private Worker worker;
    private String expected, result, month, day, year;
    private LocalDate birthDate, endDate;

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
        day = addZeroToDayOfMonthLessThanTen(birthDate.getDayOfMonth());
        month = Integer.toString(birthDate.getMonthValue());
        year = Integer.toString(birthDate.getYear());
        result = month + "/" + day + "/" + year;
        Assertions.assertEquals(expected, result);
    }
}
