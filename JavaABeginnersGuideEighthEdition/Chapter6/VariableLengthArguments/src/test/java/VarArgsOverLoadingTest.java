import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarArgsOverLoadingTest {

    private VarArgsOverLoading x;
    @BeforeEach
    void setUp() {
        x = new VarArgsOverLoading();
    }
    @Test
    void listVariables() {
        int[] expected = new int[]{1, 2, 3, 4};
        int[] results = x.listVariables(1, 2, 3, 4);
        assertArrayEquals(expected, results);
    }

    @Test
    void testListVariables() {
        char[] expected = new char[]{'a', 'b', 'c', 'd'};
        char[] results = x.listVariables('a', 'b', 'c', 'd');
        assertArrayEquals(expected, results);
    }
}