package org.example;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SecondPersonTest {
    Person person, secondPerson;

    List<Object> expected;
    List<Object> results;
    @BeforeMethod
    public void setUp() {
        person = new Person();
        secondPerson = new Person("Daffy", "Duck", 32);
    }

    @Test(priority = -1)
    public void testAgeAndName() {
        expected = new ArrayList<>();
        expected.add(32);
        expected.add("Daffy Duck");
        results = new ArrayList<>(
                List.of(secondPerson.getAge(), secondPerson.getFullName())
        );

        assertEquals(results, expected);
    }

    @Test(priority = 0)
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

    @Test(priority = 2)
    public void testSetFirstName() {
        person.setFirstName("Foghorn");

        Assert.assertEquals(person.getFirstName(), "Foghorn");
    }

    @Test(priority = 1)
    public void testSetLastName() {
        person.setLastName("Leghorn");

        Assert.assertEquals(person.getLastName(), "Leghorn");
    }

    // enabled = false is how we exclude a test in the testing_all.xml file
    // testGetFullName is included as a method to run however, the annotation
    // below excludes it.
    @Test(priority = 3, enabled = false)
    public void testGetFullName() {
        person.setFirstName("Bugs");
        person.setLastName("Bunny");

        Assert.assertEquals(person.getFullName(), "Bugs Bunny");
    }
}
