package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    private Person person;

    @BeforeClass
    @Parameters({"specialSetupPerson", "firstName", "lastName", "age"})
    public void oneTimeSetup(String doNonDefaultSetup, String firstName, String lastName, String age) {
        if (doNonDefaultSetup.equalsIgnoreCase("bugs bunny")) {
            person = new Person(firstName, lastName, Integer.parseInt(age));
        } else {
            person = new Person("Elmer", "Fudd", 35);
        }
    }

    @Test(priority = 0)
    public void testFullName() {
        String expected = "Bugs Bunny";
        Assert.assertEquals(person.getFullName(), expected);
    }

    @Test(priority = 1)
    public void testGetDecadesFromAge() {
        int expected = 2;
        int numberOfDecades = (int) Math.floor(person.getAge()/10);
        Assert.assertEquals(numberOfDecades, expected);
    }
}
