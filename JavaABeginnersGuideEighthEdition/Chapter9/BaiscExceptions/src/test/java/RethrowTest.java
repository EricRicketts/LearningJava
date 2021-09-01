import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RethrowTest {

    @Test
    void genException() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Rethrow.genException();
        });
        String expected = "Index 6 out of bounds for length 6";
        String results = exception.getMessage();
        assertEquals(expected, results);
    }
}