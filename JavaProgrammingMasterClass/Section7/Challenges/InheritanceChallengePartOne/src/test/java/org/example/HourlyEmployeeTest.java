package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HourlyEmployeeTest {

    private HourlyEmployee hourlyEmployee;

    @BeforeEach
    public void setUp() {
        hourlyEmployee = new HourlyEmployee(60.50);
    }

    @Test
    public void testGetDoublePayMethod() {
        Assertions.assertEquals(121.00, hourlyEmployee.getDoublePay());
    }
}
