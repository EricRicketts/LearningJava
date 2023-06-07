package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class ParallelTestTwo {
    private Book book;

    @BeforeMethod
    public void setUp() {
        book = new Book(
                "Treasure Island",
                "Robert Louis Stevenson",
                "Penguin Classics",
                1883,
                new BigDecimal("8.99")
        );
    }

    @Test
    public void testGetTitle() {
        Assert.assertEquals(book.getTitle(), "Treasure Island");
    }

    @Test
    public void testGetAuthor() {
        Assert.assertEquals(book.getAuthor(), "Robert Louis Stevenson");
    }

    @Test
    public void testGetPublisher() {
        Assert.assertEquals(book.getPublisher(), "Penguin Classics");
    }

    @Test
    public void testGetYear() {
        Assert.assertEquals(book.getYear(), 1883);
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(book.getCost(), new BigDecimal("8.99"));
    }
}
