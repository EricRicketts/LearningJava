package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.Assert.*;

public class PersonTest {
    Person firstPerson;
    @BeforeMethod
    public void setUp() {
        firstPerson = new Person("Elmer", "Fudd", 35);
    }

    @Test
    public void testGetAge() {
        Assert.assertEquals(35, firstPerson.getAge());
    }

    @Test
    public void testGetFullName() {
        Assert.assertEquals("Elmer Fudd", firstPerson.getFullName());
    }
}
