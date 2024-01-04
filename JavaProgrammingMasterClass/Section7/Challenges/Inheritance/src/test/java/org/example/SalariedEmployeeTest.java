package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployeeTest {

    SalariedEmployee salariedEmployee;
    double expectedPay, resultantPay;

    @BeforeEach
    public void setUp() {
        salariedEmployee = new SalariedEmployee(
                "Elmer Fudd", "11/06/1937", "12/31/2030",
                110022, "12/31/1960", 80_000.00, false
        );
    }

    @Test
    public void testGetAndSetAnnualSalary() {
        expectedPay = 80_000.00;
        resultantPay = salariedEmployee.getAnnualSalary();
        Assertions.assertEquals(expectedPay, resultantPay);
        expectedPay = 100_000.00;
        salariedEmployee.setAnnualSalary(expectedPay);
        resultantPay = salariedEmployee.getAnnualSalary();
        Assertions.assertEquals(expectedPay, resultantPay);
    }

    @Test
    public void testGetAndSetIsRetired() {
        Assertions.assertFalse(salariedEmployee.isRetired());
        salariedEmployee.setRetired(true);
        Assertions.assertTrue(salariedEmployee.isRetired());
    }

    @Test
    public void testCollectPayNotRetired() {
        expectedPay = 80_000.00 / 26.0;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        expectedPay = Double.parseDouble(df.format(expectedPay));
        resultantPay = salariedEmployee.collectPay();
        Assertions.assertEquals(expectedPay, resultantPay);
    }

    @Test
    public void testCollectPayRetired() {
        salariedEmployee.setRetired(true);
        expectedPay = 80_000.00 / 26.0;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        expectedPay = 0.9 * Double.parseDouble(df.format(expectedPay));
        resultantPay = salariedEmployee.collectPay();
        Assertions.assertEquals(expectedPay, resultantPay);
    }

    @Test
    public void testGetAndSetBirthDate() {
        String expected = "1937-11-06";
        String result = salariedEmployee.getBirthDate().toString();
        Assertions.assertEquals(expected, result);
        DateTimeFormatter formatter = new Helper().formatter;
        String date = "01/01/1930";
        LocalDate birthDate = LocalDate.parse(date, formatter);
        salariedEmployee.setBirthDate(birthDate);
        expected = "1930-01-01";
        result = salariedEmployee.getBirthDate().toString();
        Assertions.assertEquals(expected, result);
    }
}
