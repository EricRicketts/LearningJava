package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HourlyEmployeeTest {

    HourlyEmployee hourlyEmployee;
    String expected, result;

    @BeforeEach
    public void setUp() {
        hourlyEmployee = new HourlyEmployee(
                "Elmer Fudd", "11/06/1937", "12/31/2030",
                110022, "12/31/1960", 35.50
        );
    }

    @Test
    public void testGetAndSetHourlyPayRate() {
        double expectedHourlyRate = 35.50;
        double resultantHourlyRate = hourlyEmployee.getHourlyPayRate();
        Assertions.assertEquals(expectedHourlyRate, resultantHourlyRate);
        hourlyEmployee.setHourlyPayRate(50.0);
        expectedHourlyRate = 50.0;
        resultantHourlyRate = hourlyEmployee.getHourlyPayRate();
        Assertions.assertEquals(expectedHourlyRate, resultantHourlyRate);
    }

    @Test
    public void testGetCollectPay() {
        double expectedWeeklyPay = 40.0 * hourlyEmployee.getHourlyPayRate();
        double resultantWeeklyPay = hourlyEmployee.collectPay();
        Assertions.assertEquals(expectedWeeklyPay, resultantWeeklyPay);
    }

    @Test
    public void testGetDoublePay() {
        double expectedDoubleWeeklyPay = 2.0 * 40.0 * hourlyEmployee.getHourlyPayRate();
        double resultantDoubleWeeklyPay = hourlyEmployee.getDoublePay();
        Assertions.assertEquals(expectedDoubleWeeklyPay, resultantDoubleWeeklyPay);
    }
}
