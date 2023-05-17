package org.example;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SecondPersonTest {
    Person secondPerson;

    List<Object> expected;
    List<Object> results;
    @BeforeMethod
    public void setUp() {
        secondPerson = new Person("Daffy", "Duck", 32);
    }

    @Test
    public void testAgeAndName() {
        expected = new ArrayList<>();
        expected.add(32);
        expected.add("Daffy Duck");
        results = new ArrayList<>(
                List.of(secondPerson.getAge(), secondPerson.getFullName())
        );

        assertEquals(results, expected);
    }

    @Test
    public void testSetAge() {
        expected = new ArrayList<>(List.of(32, 40));
        results = new ArrayList<>();
        results.add(secondPerson.getAge());
        // secondPerson.setAge(58);
        //  if we comment the setAge call below and uncomment the setAge call above we will
        // get test fail.  TestNG, as configured for this project will produce a failed xml
        // file => testng-failed.xml.  This is very convenient as we can make changes and
        // just rerun the failing tests identified in the testng-failed.xml file.  This file
        // includes the failing test methods but also any setup that is required.
        secondPerson.setAge(40);
        results.add(secondPerson.getAge());

        Assert.assertEquals(results, expected);
    }
}
