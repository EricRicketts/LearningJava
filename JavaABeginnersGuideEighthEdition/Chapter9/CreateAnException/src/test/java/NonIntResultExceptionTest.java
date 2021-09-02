import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonIntResultExceptionTest {

    @Test
    void testToString() {
        String expected = "Result of 15 / 4 is non-integer";
        assertEquals(expected, new NonIntResultException(15, 4).toString());
    }
}