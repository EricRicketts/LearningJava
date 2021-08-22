import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PwrTest {

    @Test
    void get_pwr() {
        double[] expected = new double[]{3.0, 16.0};
        Pwr x = new Pwr(4.0, 2);
        assertArrayEquals(expected, x.get_pwr());
    }
}