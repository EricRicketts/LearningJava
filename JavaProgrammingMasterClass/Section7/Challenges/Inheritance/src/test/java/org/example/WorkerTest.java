package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class WorkerTest {

    private Helper helper = new Helper();
    final DateTimeFormatter formatter = new Helper().formatter;
    private Worker worker;
    private String expected, result;
    private LocalDate birthDate, endDate;

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
        result = helper.extractDateStringFromLocalDate(birthDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSetBirthDate() {
        expected = "10/18/2020";
        worker.setBirthDate(LocalDate.parse(expected, formatter));
        result = helper.extractDateStringFromLocalDate(worker.getBirthDate());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetEndDate() {
        expected = "12/31/2030";
        endDate = worker.getEndDate();
        result = helper.extractDateStringFromLocalDate(endDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSetEndDate() {
        expected = "12/01/2025";
        worker.setEndDate(LocalDate.parse(expected, formatter));
        result = helper.extractDateStringFromLocalDate(worker.getEndDate());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTerminate() {
        expected = "12/01/2025";
        worker.terminate(expected);
        result = helper.extractDateStringFromLocalDate(worker.getEndDate());
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetAge() {
        // final assert comparison is in days
        LocalDate currentDate = LocalDate.now();
        Duration duration =
                Duration.ofDays(DAYS.between(currentDate, worker.getBirthDate()));
        long expected = Math.abs(duration.toDays());
        long result = worker.getAge();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testToString() {
        result = worker.toString();
        expected =
                "Worker{name='Elmer Fudd'," +
                        " birthDate='1937-11-06'," +
                        " endDate='2030-12-31'}";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCollectPay() {
        double expected = 0.0;
        double result = worker.collectPay();
        Assertions.assertEquals(expected, result);
    }
}
