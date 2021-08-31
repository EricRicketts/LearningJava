package series;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    private ByTwos byTwos;
    private ByThrees byThrees;
    private Series ob;

    @BeforeEach
    void setUp() {
        byTwos = new ByTwos();
        byThrees = new ByThrees();
    }

    @Test
    void getNext() {
        ob = byTwos;
        assertEquals(2, ob.getNext());
    }

    @Test
    void reset() {
        int[] expected = new int[]{2, 4, 6, 8, 2};
        ob = byTwos;
        int[] results = new int[5];
        for (int i = 0; i < results.length - 1; i += 1) {
            results[i] = ob.getNext();
        }
        ob.reset();
        results[4] = ob.getNext();
        assertArrayEquals(expected, results);
    }

    @Test
    void setStart() {
        ob = byThrees;
        ob.setStart(100);
        assertEquals(103, ob.getNext());
    }
}