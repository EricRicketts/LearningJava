package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    List<Employee> employeeList;
    EmployeeComparator<Employee> employeeComparator;

    @BeforeEach
    public void setUp() {
        employeeList = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018),
                new Employee(12001, "Fred", 2016),
                new Employee(13405, "Fannie", 2017),
                new Employee(10056, "Joe", 2010),
                new Employee(13000, "Jill", 2022),
                new Employee(12050, "Same", 2021)
        ));
        employeeComparator = new EmployeeComparator<>();
    }

    @Test
    public void testSortByEmployeeName() {
        List<String> results = new ArrayList<>();
        employeeList.sort(employeeComparator);
        for(Employee employee : employeeList) {
            results.add(employee.getName());
        }
        for(int index = 0; index < results.size() - 1; index++) {
            String firstResult = results.get(index);
            String secondResult = results.get(index + 1);
            assertTrue(firstResult.compareTo(secondResult) < 0);
        }
    }
}
