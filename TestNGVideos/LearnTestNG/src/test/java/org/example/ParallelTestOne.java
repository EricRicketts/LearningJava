package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestOne {
    private Person person;

    @BeforeMethod
    public void setUp() {
        person = new Person("Elmer", "Fudd", 35);
    }

    @Test
    public void testGetFullName() {
        String expected = "Elmer Fudd";
        Assert.assertEquals(person.getFullName(), expected);
    }

    @Test
    public void testGetAge() {
        int expected = 35;
        Assert.assertEquals(person.getAge(), expected);
    }

    @Test
    public void testSetFirstAndLastNames() {
        String firstName = "Bugs";
        String lastName = "Bunny";
        String expected = "Bugs Bunny";
        person.setFirstName(firstName);
        person.setLastName(lastName);

        Assert.assertEquals(person.getFullName(), expected);
    }

    @Test
    public void testSetAge() {
        int expected = 25;
        person.setAge(expected);

        Assert.assertEquals(person.getAge(), expected);
    }
}
