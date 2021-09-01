import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UseFinallyTest {


    @Test
    void genExceptionDivideByZero() {
        String expected = "/ by zero in final block leaving method";
        assertEquals(expected, UseFinally.genException(0));
    }

    @Test
    void genArrayOutOfBounds() {
        String expected = "Index 4 out of bounds for length 2 in final block leaving method";
        assertEquals(expected, UseFinally.genException(1));
    }

    @Test
    void bypassCatch() {
        String expected = "no exceptions generated in final block leaving method";
        assertEquals(expected, UseFinally.genException(2));
    }
}