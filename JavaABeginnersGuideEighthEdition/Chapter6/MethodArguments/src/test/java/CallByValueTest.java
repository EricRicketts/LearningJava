import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CallByValueTest {

    @Test
    void noChange() {
        int[] expected = new int[]{10, 15, 10, 15};
        int[] results = new int[4];
        int a = 10, b = 15;
        CallByValue cbv = new CallByValue();
        results[0] = a; results[1] = b;
        cbv.noChange(a, b);
        results[2] = a; results[3] = b;
        assertArrayEquals(expected, results);
    }
}