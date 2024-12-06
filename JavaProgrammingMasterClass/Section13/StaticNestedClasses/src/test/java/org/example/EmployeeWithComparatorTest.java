package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeWithComparatorTest {

    List<EmployeeWithComparator> employeeWithComparatorList;

    @BeforeEach
    public void setUp() {
        employeeWithComparatorList = new ArrayList<>(List.of(
                new EmployeeWithComparator(10001, "Ralph", 2015),
                new EmployeeWithComparator(10005, "Carole", 2021),
                new EmployeeWithComparator(10022, "Jane", 2013),
                new EmployeeWithComparator(13151, "Laura", 2020),
                new EmployeeWithComparator(10050, "Jim", 2018),
                new EmployeeWithComparator(12001, "Fred", 2016),
                new EmployeeWithComparator(13405, "Fannie", 2017),
                new EmployeeWithComparator(10056, "Joe", 2010),
                new EmployeeWithComparator(13000, "Jill", 2022),
                new EmployeeWithComparator(12050, "Same", 2021)
        ));
    }

    @Test
    public void testDefaultSorting() {
        // default sorting is by employee name we must call the EmployeeComparator after EmployeeWithComparator
        // because the EmployeeComparator class is a static inner class so a call to it must be prefixed
        // with a call to the outer class.
        employeeWithComparatorList.sort(new EmployeeWithComparator.EmployeeComparator<>());
        for(int index = 0; index < employeeWithComparatorList.size() - 1; index++) {
            String firstEmployeeName = employeeWithComparatorList.get(index).getName();
            String secondEmployeeName = employeeWithComparatorList.get(index + 1).getName();
            assertTrue(firstEmployeeName.compareTo(secondEmployeeName) < 0);
        }
    }

    @Test
    public void testSortByYearStarted() {
        employeeWithComparatorList
                .sort(new EmployeeWithComparator.EmployeeComparator<>("yearStarted"));
        for(int index = 0; index < employeeWithComparatorList.size() - 1; index++) {
            int firstEmployeeYearStarted = employeeWithComparatorList.get(index).getYearStarted();
            int secondEmployeeYearStarted = employeeWithComparatorList.get(index + 1).getYearStarted();
            assertTrue(Integer.compare(firstEmployeeYearStarted, secondEmployeeYearStarted) <= 0);
        }
    }
}
