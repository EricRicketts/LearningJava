import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackCasesTest {

    @Test
    void main() {
        assertEquals("x is 1, 2, 3, or 4", StackCases.main(2));
        assertEquals("x is not 1, 2, 3, or 4", StackCases.main(5));
    }
}