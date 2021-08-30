import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle t1, t2;
    @BeforeEach
    void setUp() {
        t1 = new Triangle("outlined", 8.0, 12.0);
        t2 = new Triangle(t1);
    }

    @Test
    void area() {
        double[] expected = new double[]{48.0, 48.0};
        double[] results = new double[]{t1.area(), t2.area()};
        assertArrayEquals(expected, results);
    }

    @Test
    void getStyle() {
        String[] expected = new String[]{"outlined", "outlined"};
        String[] results = new String[]{t1.getStyle(), t2.getStyle()};
        assertArrayEquals(expected, results);
    }
}