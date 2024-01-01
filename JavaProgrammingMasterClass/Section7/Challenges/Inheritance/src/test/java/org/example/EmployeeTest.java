package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeTest {
/*
    In these subclasses I will not exhaustively test the inherited fields or methods
    but only a subset of the inherited fields or methods.  This is for two reasons:
    first if an inherited field or method is tested in a given subclass then the other
    inherited fields or methods have a very high probability of working and second
    other, but not all, inherited fields and methods will be tested in the HourlyEmployee
    and SalariedEmployee subclasses.
*/
    private Helper helper = new Helper();
    final DateTimeFormatter formatter = new Helper().formatter;
    private Employee employee;
    private String expected, result;
    private LocalDate hireDate;

    @BeforeEach
    public void setUp() {
        employee = new Employee(
                "Elmer Fudd", "11/06/1937", "12/31/2030",
                110022, "12/31/1960"
        );
    }

    @Test
    public void testGetEmployeeId() {
        long expected = 110022;
        long result = employee.getEmployeeId();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSetEmployeeId() {
        long expected = 220033;
        employee.setEmployeeId(expected);
        long result = employee.getEmployeeId();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetHireDate() {
        expected = "12/31/1960";
        LocalDate hireDate = employee.getHireDate();
        result = helper.extractDateStringFromLocalDate(hireDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSetHireDate() {
        expected = "12/31/1955";
        employee.setHireDate(LocalDate.parse(expected, formatter));
        LocalDate hireDate = employee.getHireDate();
        result = helper.extractDateStringFromLocalDate(hireDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testToString() {
        expected =
                "Employee{employeeId=110022" +
                        ", hireDate='1960-12-31'} " +
                "Worker{name='Elmer Fudd'," +
                        " birthDate='1937-11-06'," +
                        " endDate='2030-12-31'}";
        result = employee.toString();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetBirthDate() {
        expected = "1937-11-06";
        result = employee.getBirthDate().toString();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void setBirthDate() {
        expected = "01/12/1930";
        employee.setBirthDate(LocalDate.parse(expected, formatter));
        LocalDate birthDate = employee.getBirthDate();
        result = helper.extractDateStringFromLocalDate(birthDate);
        Assertions.assertEquals(expected, result);
    }
}
