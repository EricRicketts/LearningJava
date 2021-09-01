package series;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ByTwosTest {

    private ByTwos ob;
    @BeforeEach
    void setUp() {
        ob = new ByTwos();
    }

    @Test
    void getNext() {
        assertEquals(2, ob.getNext());
    }

    @Test
    void getPrevious() {
        assertEquals(0, ob.getPrevious());
    }

    @Test
    void reset() {
        int[] expected = new int[]{2, 0};
        int[] results = new int[2];
        results[0] = ob.getNext();
        ob.reset();
        results[1] = ob.getPrevious();
        assertArrayEquals(expected, results);
    }

    @Test
    void setStart() {
        ob.setStart(100);
        assertEquals(102, ob.getNext());
    }

    @Test
    void skipAndGetNextArray() {
        int[] expected = new int[]{12, 14, 16, 18, 20};
        int[] results = ob.skipAndGetNextArray(5, 5);
        assertArrayEquals(expected, results);
    }

    @Test
    void staticInterfaceMethod() {
        assertEquals("Foo", Series.staticMethod());
    }
}