package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalariedEmployeeTest {

    private SalariedEmployee salariedEmployee;

    @BeforeEach
    public void setUp() {
        salariedEmployee = new SalariedEmployee(90_000.00, false);
    }

    @Test
    public void testRetireMethodAfterConstructorCall() {
        Assertions.assertFalse(salariedEmployee.isRetired());
    }

    @Test
    public void testRetireMethod() {
        salariedEmployee.retire();
        Assertions.assertTrue(salariedEmployee.isRetired());
    }
}
