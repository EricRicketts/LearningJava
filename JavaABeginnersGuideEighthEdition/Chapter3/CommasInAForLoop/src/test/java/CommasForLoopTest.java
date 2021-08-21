import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommasForLoopTest {

    @Test
    void useCommasForLoop() {
        int[][] expected = {{0, 10}, {1, 9}, {2, 8}, {3, 7}, {4, 6}, {5, 5}};
        assertArrayEquals(expected, CommasForLoop.useCommasForLoop());
    }
}