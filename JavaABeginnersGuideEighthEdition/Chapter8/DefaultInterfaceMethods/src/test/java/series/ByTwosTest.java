package series;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void getNextArray() {
        // very important point here, the adopting class does not need to implement getNextArray as it has
        // a default implementation, so without an implementation in the class, ByTwos will call the default
        // implementation
        int[] expected = new int[]{2, 4, 6, 8, 10};
        assertArrayEquals(expected, byTwos.getNextArray(5));
    }
}