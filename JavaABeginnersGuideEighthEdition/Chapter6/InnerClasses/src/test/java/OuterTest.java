import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OuterTest {

    @Test
    void results() {
        Outer ob = new Outer(new double[]{2.0, 4.0, 6.0, 8.0, 10.0, 12, 14, 16, 18, 20});
        double[] expected = new double[]{2.0, 20.0, 11.0};
        double[] results = ob.results();
        assertArrayEquals(expected, results);
    }
}