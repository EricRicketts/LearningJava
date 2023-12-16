package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest {

    public static Person person;

    @BeforeAll
    public static void oneTimeSetup() {
        person = new Person();
    }

    @Test
    public void testEmptyNames() {
        person.setFirstName("");
        person.setLastName("");
        person.setAge(12);

        Assertions.assertEquals(
                "",
                person.getFullName()
        );
        Assertions.assertEquals(
                12,
                person.getAge()
        );
        Assertions.assertFalse(person.isTeen());
    }

    @Test
    public void testSetFirstNameOnly() {
        person.setFirstName("John");
        person.setLastName("");
        person.setAge(13);
        Assertions.assertTrue(person.isTeen());
        Assertions.assertEquals(
                13,
                person.getAge()
        );
        Assertions.assertEquals(
                "John",
                person.getFullName()
        );
    }

    @Test
    public void testSetLastNameOnly() {
        person.setFirstName("");
        person.setLastName("Smith");
        person.setAge(19);

        Assertions.assertTrue(person.isTeen());
        Assertions.assertEquals(
                "Smith",
                person.getFullName()
        );
    }

    @Test
    public void testSetFullName() {
        person.setFirstName("John");
        person.setLastName("Smith");
        person.setAge(20);

        Assertions.assertFalse(person.isTeen());
        Assertions.assertEquals(
                "John Smith",
                person.getFullName()
        );
    }

    @Test
    public void testInvalidAgeRanges() {
        new ArrayList<>(Arrays.asList(
                -1, 101
        )).forEach(age -> {
            person.setAge(age);
            Assertions.assertEquals(0, person.getAge());
        });
    }
}

/*
    Note data was not shown for the course tests on my code, I had to look at the course
    method calls, based on the method names I added additional tests
*/
