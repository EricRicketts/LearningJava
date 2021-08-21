import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerBreakTest {

    @Test
    void breakOnlyOutOfNearestLoop() {
        int[] expected = {0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, InnerBreak.breakOnlyOutOfNearestLoop());
    }
}