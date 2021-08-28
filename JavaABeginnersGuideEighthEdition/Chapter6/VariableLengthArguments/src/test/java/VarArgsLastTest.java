import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarArgsLastTest {

    private VarArgsLast x;
    @BeforeEach
    void setUp() {
        x = new VarArgsLast();
    }

    @Test
    void listVariables() {
        Object[] expected = new Object[]{"FooBar", 1, 2, 3};
        Object[] results = x.listVariables("FooBar", 1, 2, 3);
        assertArrayEquals(expected, results);
    }
}