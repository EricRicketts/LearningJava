import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarArgsTest {

    private VarArgs x;
    @BeforeEach
    void setUp() {
        x = new VarArgs();
    }

    @Test
    void listVariablesNoArguments() {
        int[] expected = new int[0];
        int[] results = x.listVariables();
        assertArrayEquals(expected, results);
    }

    @Test
    void listVariablesOneArgument() {
        int[] expected = new int[]{1};
        int[] results = x.listVariables(1);
        assertArrayEquals(expected, results);
    }

    @Test
    void listVariablesFourArguments() {
        int[] expected = new int[]{1, 2, 3, 4};
        int[] results = x.listVariables(1, 2, 3, 4);
        assertArrayEquals(expected, results);
    }
}