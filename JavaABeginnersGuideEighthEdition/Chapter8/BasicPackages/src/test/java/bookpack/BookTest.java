package bookpack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;
    @BeforeEach
    void setUp() {
        book = new Book("Java: A Beginner's Guide", "Schildt", 2019);
    }

    @Test
    void getAuthor() {
        assertEquals("Schildt", book.getAuthor());
    }

    @Test
    void getPubDate() {
        assertEquals(2019, book.getPubDate());
    }

    @Test
    void getTitle() {
        assertEquals("Java: A Beginner's Guide", book.getTitle());
    }

    @Test
    void setAuthor() {
        book.setAuthor("Uncle Bob");
        assertEquals("Uncle Bob", book.getAuthor());
    }

    @Test
    void setPubDate() {
        book.setPubDate(2020);
        assertEquals(2020, book.getPubDate());
    }

    @Test
    void setTitle() {
        book.setTitle("Java: The Complete Reference");
        assertEquals("Java: The Complete Reference", book.getTitle());
    }

    @Test
    void show() {
        String expected = "title: Java: A Beginner's Guide author: Schildt publication date: 2019";
        assertEquals(expected, book.show());
    }
}