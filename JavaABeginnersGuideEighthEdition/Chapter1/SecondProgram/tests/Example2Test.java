import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {
    @Test
    void usingVariables() {
        int[] expected = {1024, 512};
        assertArrayEquals(expected,  Example2.usingVariables());
    }
}