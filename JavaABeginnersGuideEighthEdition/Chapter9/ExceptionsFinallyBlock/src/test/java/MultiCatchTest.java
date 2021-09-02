import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiCatchTest {

    @Test
    void genExceptionDivideByZero() {
        String expected = "/ by zero";
        assertEquals(expected, MultiCatch.genException(0));
    }

    @Test
    void genExceptionArrayOutOfBounds() {
        String expected = "Index 2 out of bounds for length 2";
        assertEquals(expected, MultiCatch.genException(1));
    }
}