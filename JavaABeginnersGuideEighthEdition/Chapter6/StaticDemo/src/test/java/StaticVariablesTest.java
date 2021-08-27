import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticVariablesTest {

    private StaticVariables ob1, ob2;
    int[] expected, results;

    @BeforeEach
    void setUp() {
        ob1 = new StaticVariables();
        ob2 = new StaticVariables();
        ob1.x = 10; ob2.x = 20;
    }

    @Test
    void instanceVariablesUniqueToObject() {
        expected = new int[]{10, 20};
        results = new int[]{ob1.x, ob2.x};
        assertArrayEquals(expected, results);
    }

    @Test
    void staticVariablesSameForAllInstances() {
        expected = new int[]{29, 39};
        StaticVariables.y = 19;
        results = new int[]{ob1.sum(), ob2.sum()};
        assertArrayEquals(expected, results);
    }
}