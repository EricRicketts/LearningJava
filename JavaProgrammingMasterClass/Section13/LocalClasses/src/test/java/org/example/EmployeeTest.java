package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EmployeeTest {

    private List<Employee> employeeList = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        employeeList.add(new Employee("Elmer", "Fudd", 35));
        employeeList.add(new Employee("Bugs", "Bunny", 30));
        employeeList.add(new Employee("Daffy", "Duck", 25));
        employeeList.add(new Employee("Foghorn", "Leghorn", 20));
    }

    @Test
    public void testEmployeeGetters() {
        String[] expected = {"Elmer", "Fudd", "35"};
        String[] actual = {
                employeeList.getFirst().getFirstName(),
                employeeList.getFirst().getLastName(),
                String.valueOf(employeeList.getFirst().getAge())
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPigLatin() {
        String actual = Employee.addPigLatinName(employeeList);
        int foo = 5;
    }
}
