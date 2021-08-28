import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle t1, t2, t3;
    @BeforeEach
    void setUp() {
        t1 = new Triangle();
        t2 = new Triangle("isosceles", 5);
        t3 = new Triangle("345", 3.0, 4.0);
    }

    @Test
    void showDimensions() {
        assertEquals("length: 3.0 width: 4.0", t3.showDimensions());
    }

    @Test
    void area() {
        assertEquals(12.5, t2.area());
    }

    @Test
    void showStyle() {
        assertEquals("Triangle is of style or type 345", t3.showStyle());
    }

    @Test
    void showCommonInstanceVariables() {
        int[] expected = new int[]{0, 1};
        int[] results = new int[]{t1.getI(), t1.i};
        assertArrayEquals(expected, results);
    }
}