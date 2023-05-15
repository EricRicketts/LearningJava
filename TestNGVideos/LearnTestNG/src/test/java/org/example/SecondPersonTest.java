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

        secondPerson.setAge(40);
        results.add(secondPerson.getAge());

        Assert.assertEquals(results, expected);
    }
}
