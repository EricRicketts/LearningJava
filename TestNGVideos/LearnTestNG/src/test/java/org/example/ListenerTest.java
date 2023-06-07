package org.example;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.math.BigDecimal;

@Listeners(org.example.CustomListeners.class)
public class ListenerTest {

    private Book book;
    private Person person;

    @BeforeMethod
    public void setUp() {
        book = new Book(
                "Treasure Island",
                "Robert Louis Stevenson",
                "Penguin Classics",
                1883,
                new BigDecimal("8.99")
        );
        person = new Person("Frodo", "Baggins", 35);
    }

    @Test
    public void testGetFrodoAge() {
        Assert.assertEquals(person.getAge(), 35);
    }

    @Test
    public void testGetBookTitle() {
        Assert.assertEquals(book.getTitle(), "Treasure Isle");
    }

    @Test
    public void testGetBookYearPublished() {
        throw new SkipException("Skip publish year.");
    }
}

/*
    Starts Test Execution ..... LearnTestNG
    Starts test ..... testGetBookTitle

    Failed test ...... testGetBookTitleStarts test ..... testGetBookYearPublished
    Test ignored.
    Skipped test ...... testGetBookYearPublishedStarts test ..... testGetFrodoAgePassed test ...... testGetFrodoAgeFinish Test Execution ..... LearnTestNG
*/
