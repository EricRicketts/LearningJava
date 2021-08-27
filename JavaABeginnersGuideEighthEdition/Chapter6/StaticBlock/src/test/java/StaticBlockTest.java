import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticBlockTest {

    StaticBlock ob;
    double[] expected, results;

    @BeforeEach
    void setUp() {
        ob = new StaticBlock("I am in the constructor");
    }

    @Test
    void staticBlockInitialization() {
        expected = new double[]{Math.sqrt(2), Math.sqrt(3)};
        results = new double[]{StaticBlock.rootOf2, StaticBlock.rootOf3};
        assertArrayEquals(expected, results);
    }

    @Test
    void instanceVariableInitialization() {
        assertEquals("I am in the constructor", ob.msg);
    }
}