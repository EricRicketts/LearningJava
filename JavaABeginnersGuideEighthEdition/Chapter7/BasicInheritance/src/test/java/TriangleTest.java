import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle;
    @BeforeEach
    void setUp() {
        triangle = new Triangle("isosceles", 4, 5);
    }
    @Test
    void area() {
        assertEquals(10.0, triangle.area());
    }

    @Test
    void getStyle() {
        assertEquals("isosceles", triangle.getStyle());
    }

    @Test
    void setStyle() {
        triangle.setStyle("equilateral");
        assertEquals("equilateral", triangle.getStyle());
    }
}