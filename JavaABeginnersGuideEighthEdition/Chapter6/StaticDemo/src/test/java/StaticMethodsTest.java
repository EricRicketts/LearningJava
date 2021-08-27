import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticMethodsTest {

    @Test
    void valDiv2() {
        int[] expected = new int[]{512, 2};
        int[] results = new int[2];
        results[0] = StaticMethods.valDiv2();
        StaticMethods.value = 4;
        results[1] = StaticMethods.valDiv2();
        assertArrayEquals(expected, results);
    }
}