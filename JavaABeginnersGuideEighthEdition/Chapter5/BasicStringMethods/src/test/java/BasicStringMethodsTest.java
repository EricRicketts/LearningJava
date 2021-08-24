import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStringMethodsTest {

    private String str1, str2, str3;

    @BeforeEach
    void setUp() {
        str1 = "I am learning about Java Strings.";
        str2 = "Java is a very strongly typed language.";
        str3 = "this string repeats it repeats";
    }

    @Test
    void length() {
        int count = 0;
        for (int i = 0; i < str1.length(); i += 1) count += 1;
        assertEquals(count, str1.length());
    }

    @Test
    void equals() {
        str1 = new String("FooBar");
        str2 = new String("FooBar");
        assertTrue(str1.equals(str2));
    }

    @Test
    void charAt() {
        char expected = 'a';
        assertEquals(expected, str2.charAt(3));
    }

    @Test
    void compareTo() {
        int[] expected = {-1, 1, 0};
        int[] results = {"fo".compareTo("foo"), "foo".compareTo("fo"), "abc".compareTo("abc")};
        assertArrayEquals(expected, results);
    }

    @Test
    void indexOf() {
        assertEquals(12, str3.indexOf("repeats"));
    }

    @Test
    void lastIndexOf() {
        assertEquals(23, str3.lastIndexOf("repeats"));
    }

    @Test
    void subString() {
        str1 = "Java makes the Web move.";
        str2 = str1.substring(5, 18);
        assertEquals("makes the Web", str2);
    }

}