package bookpackext;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseBookTest {

    @Test
    void showBooks() {
        String[] expected = new String[]{
                "Title: Java: A Beginner's Guide, Author: Schildt, Publication Date: 2019",
                "Title: Java: The Complete Reference, Author: Schildt, Publication Date: 2019",
                "Title: Introducing JavaFX 8 Programming, Author: Schildt, Publication Date: 2015",
                "Title: Red Storm Rising, Author: Clancy, Publication Date: 1986",
                "Title: On The Road, Author: Kerouac, Publication Date: 1955",
        };
        assertArrayEquals(expected, UseBook.showBooks());
    }
}