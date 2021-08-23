import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    private int testArray[];
    private MinMax minMax;

    @BeforeEach
    void setUp() {
        testArray = new int[]{99, -10, 100_123, 18, -978, 5_623, 463, -9, 287, 49};
        minMax = new MinMax();
    }

    @Test
    void max() {
        assertEquals(100_123, minMax.get_max(testArray));
    }

    @Test
    void min() {
        assertEquals(-978, minMax.get_min(testArray));
    }
}