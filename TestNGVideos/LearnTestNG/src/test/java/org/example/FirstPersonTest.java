package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class FirstPersonTest {
    private Person firstPerson;
    @BeforeMethod
    public void setUp() {
        firstPerson = new Person("Elmer", "Fudd", 35);
    }

    @Test(priority = 1)
    public void testGetAge() {
        assertEquals(35, firstPerson.getAge());
    }

    @Test(priority = 4)
    public void testGetFullName() {
        Assert.assertEquals("Elmer Fudd", firstPerson.getFullName());
    }

    @Test(priority = 2)
    public void testGetFirstName() {
        assertEquals("Elmer", firstPerson.getFirstName());
    }

    @Test(priority = 3)
    public void testGetLastName() {
        assertEquals("Fudd", firstPerson.getLastName());
    }
}

/*
    Normally, if no parameters are given to the @Test annotation then TestNG will run
    the tests in alphabetical order, with the priority parameters set then the tester
    can control in what order the tests are run.  In this case the order is: testGetAge,
    testGetFirstName, testGetLastName, and testGetFullName.  One will see this order
    being run in the IDE.
*/
