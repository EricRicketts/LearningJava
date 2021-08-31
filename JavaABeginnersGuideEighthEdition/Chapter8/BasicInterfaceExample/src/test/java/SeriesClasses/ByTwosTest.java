package SeriesClasses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ByTwosTest {

    private ByTwos byTwos;
    @BeforeEach
    void setUp() {
        byTwos = new ByTwos();
    }

    @Test
    void getNext() {
        assertEquals(2, byTwos.getNext());
    }

    @Test
    void getPrevious() {
        assertEquals(0, byTwos.getPrevious());
    }

    @Test
    void reset() {
        int[] expected = new int[]{2, 0};
        int increment = byTwos.getNext();
        byTwos.reset();
        int resetValue = byTwos.getPrevious();
        int[] results = new int[]{increment, resetValue};
        assertArrayEquals(expected, results);
    }

    @Test
    void setStart() {
        byTwos.setStart(100);
        assertEquals(102, byTwos.getNext());
    }
}