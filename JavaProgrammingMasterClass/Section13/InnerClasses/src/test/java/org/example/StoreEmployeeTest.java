package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreEmployeeTest {

    private List<StoreEmployee> storeEmployees;

    @BeforeEach
    public void setUp() {
        storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target"),

                new StoreEmployee(10315, "Ron", 2017, "FiveBelow"),
                new StoreEmployee(10415, "Julia", 2015, "Lowes"),
                new StoreEmployee(10320, "Jane", 2023, "HomeDepot"),
                new StoreEmployee(10500, "Pattie", 2022, "BestBuy"),
                new StoreEmployee(10415, "Jim", 2014, "Starbucks")
            )
        );
    }

    @Test
    public void testStoreEmployeeWithEmployeeComparator() {
        // the EmployeeComparator class compares the name field
        var comparator = new StoreEmployee.EmployeeComparator<>();
        storeEmployees.sort(comparator);
        for(int index = 0; index < storeEmployees.size() - 1; index++) {
            String firstStoreEmployeeName = storeEmployees.get(index).getName();
            String secondStoreEmployeeName = storeEmployees.get(index + 1).getName();
            assertTrue(firstStoreEmployeeName.compareTo(secondStoreEmployeeName) <= 0);
        }
    }

    @Test
    public void testStoreEmployeeWithStoreComparator() {
        /*
            Originally, I did not understand the sorting, what the sort does is first to sort
            the employees by store and when if the stores are the same it sorts by year started.
            Stores are sorted alphabetically and year started by the earliest year first.
        */
        var genericStoreEmployee = new StoreEmployee();
        // inner class call requires an instance of the outer class
        var comparator = genericStoreEmployee.new StoreComparator<>();
        // var comparator = new StoreEmployee(). new StoreComparator<>();
        // this would also be a way to generate the comparator
        storeEmployees.sort(comparator);
        for(int index = 0; index < storeEmployees.size() - 1; index++) {
            String firstStoreEmployeeStore = storeEmployees.get(index).getStore();
            String secondStoreEmployeeStore = storeEmployees.get(index + 1).getStore();
            int firstStoreEmployeeYearStarted = storeEmployees.get(index).getYearStarted();
            int secondStoreEmployeeYearStarted = storeEmployees.get(index + 1).getYearStarted();
            assertTrue(firstStoreEmployeeStore.compareTo(secondStoreEmployeeStore) <= 0);
            if (firstStoreEmployeeStore.compareTo(secondStoreEmployeeStore) == 0) {
                assertTrue(
                        Integer.compare(firstStoreEmployeeYearStarted, secondStoreEmployeeYearStarted) <= 0
                );
            }
        }
    }
}
