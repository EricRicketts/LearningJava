package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class BookTest {

    Book firstBook, secondBook;

    @BeforeMethod
    public void setUp() {
        firstBook = new Book();
        secondBook = new Book(
                "Treasure Island",
                "Robert Louis Stevenson",
                "Penguin Classics",
                1883,
                new BigDecimal("8.99")
        );
    }

//     @Test(priority = 0, enabled = false)
    /*
    if the above is used in place of @Test(priority = 0) then the test suite will fail and not run
    because testGetSecondBookAuthor is dependent on testGetSecondBookTitle successfully
    running. If the first test is enabled but fails the test suite will run the first test
    and then stop running.
    */
    @Test(priority = 0)
    public void testGetSecondBookTitle() {
        Assert.assertEquals(secondBook.getTitle(), "Treasure Island");
    }

    @Test(priority = 1, dependsOnMethods = {"testGetSecondBookTitle"})
    public void testGetSecondBookAuthor() {
        Assert.assertEquals(secondBook.getAuthor(), "Robert Louis Stevenson");
    }

    @Test(priority = 2, dependsOnMethods = {"testGetSecondBookAuthor"})
    public void testGetSecondBookPublisher() {
        Assert.assertEquals(secondBook.getPublisher(), "Penguin Classics");
    }

    // if we want a test to always run even if there are failures use the alwaysRun parameter
    // in this case if the testGetSecondBookAuthor has enabled = false then the entire test suite
    // will not run however, if the testGetSecondBookAuthor runs but fails, the testGetSecondBookYear
    // will still run
    @Test(priority = 3, dependsOnMethods = {"testGetSecondBookPublisher"}, alwaysRun = true)
    public void testGetSecondBookYear() {
        Assert.assertEquals(secondBook.getYear(), 1883);
    }

    // we can have more than one dependency
    @Test(priority = 4, dependsOnMethods = {"testGetSecondBookPublisher", "testGetSecondBookYear"})
    public void testGetSecondBookCost() {
        Assert.assertEquals(secondBook.getCost(), new BigDecimal("8.99"));
    }
}
