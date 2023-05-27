package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProviderTest {
    private Person person;
    private List<Object> expected;
    private List<Object> results;

    @DataProvider(name = "test-data")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Bugs", "Bunny", 25},
                {"Foghorn", "Leghorn",30}
        };
    }

    @BeforeMethod
    public void setUp() {
        person = new Person("Elmer", "Fudd", 35);
    }

    @Test
    public void testGetPersonAttributes() {
        expected = new ArrayList<>(Arrays.asList("Elmer", "Fudd", 35));
        results = new ArrayList<>(
                Arrays.asList(
                        person.getFirstName(),
                        person.getLastName(),
                        person.getAge()
                )
        );
        Assert.assertEquals(results, expected);
    }

    @Test(dataProvider = "test-data")
    public void testSetPersonAttributesFirstIteration(String firstName, String lastName, int age) {
        expected = new ArrayList<>(Arrays.asList(firstName, lastName, age));
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        results = new ArrayList<>(Arrays.asList(
                person.getFirstName(),
                person.getLastName(),
                person.getAge())
        );

        Assert.assertEquals(results, expected);
    }
}
/*
    The data provider returns an array of values which can be used to run multiple iterations of a test.
    This is shown above, notice the data provider is a two dimension array.  The format of the inner
    arrays determine the arguments that can be passed to a test method.  In this case the inner array
    has type {String, String, int} so this determines the test method parameters.  We cannot pass all the
    inner arrays at once this is not how the data provider works.  It iterates through the inner arrays
    and runs the test for each iteration.
*/
