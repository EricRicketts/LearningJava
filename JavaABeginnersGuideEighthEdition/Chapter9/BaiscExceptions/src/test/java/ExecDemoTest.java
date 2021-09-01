import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecDemoTest {

    @Test
    void demonstrateExceptions() {
        Object[] expected = new Object[]{1, "/ by zero", 3, "/ by zero"};
        Object[] results = new ExecDemo().demonstrateExceptions();
        assertArrayEquals(expected, results);
    }
}