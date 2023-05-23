package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class GroupingTest {

    Person person;
    Book book;
    @BeforeMethod
    public void setUp() {
        person = new Person("Elmer", "Fudd", 35);
        book = new Book(
                "Treasure Island",
                "Robert Louis Stevenson",
                "Penguin Classics",
                1883,
                new BigDecimal("8.99")
        );
    }

    @Test
    public void testGetPersonFirstName() {
        Assert.assertEquals(person.getFirstName(), "Elmer");
    }

    @Test
    public void testGetPersonLastName() {
        Assert.assertEquals(person.getLastName(), "Fudd");
    }

    @Test
    public void testGetPersonAge() {
        Assert.assertEquals(person.getAge(), 35);
    }
}
