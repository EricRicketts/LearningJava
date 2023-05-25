package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class GroupingTest {

    private Person person;
    private Book book;

    @BeforeMethod(alwaysRun = true)
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

    @Test(priority = 0, groups = {"odd"})
    public void testGetPersonFirstName() {
        Assert.assertEquals(person.getFirstName(), "Elmer");
    }

    @Test(priority = 1, groups = {"even"})
    public void testGetPersonLastName() {
        Assert.assertEquals(person.getLastName(), "Fudd");
    }

    @Test(priority = 2, groups = {"odd"})
    public void testGetPersonAge() {
        Assert.assertEquals(person.getAge(), 35);
    }

    @Test(priority = 3, groups = {"even"})
    public void testGetBookTitle() {
        Assert.assertEquals(book.getTitle(), "Treasure Island");
    }

    @Test(priority = 4, groups = {"odd"})
    public void testGetBookAuthor() {
        Assert.assertEquals(book.getAuthor(), "Robert Louis Stevenson");
    }

    @Test(priority = 5, groups = {"even"})
    public void testGetYearPublished() {
        Assert.assertEquals(book.getYear(), 1883);
    }
}
