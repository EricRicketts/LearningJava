import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTriangleTest {

    private ColorTriangle coloredTriangle;
    @BeforeEach
    void setUp() {
        coloredTriangle = new ColorTriangle("blue", "equilateral", 5.0, 5.0);
    }
    @Test
    void getColor() {
        assertEquals("blue", coloredTriangle.getColor());
    }

    @Test
    void setColor() {
        coloredTriangle.setColor("green");
        assertEquals("green", coloredTriangle.getColor());
    }

    @Test
    void showColor() {
        assertEquals("Color is blue", coloredTriangle.showColor());
    }

    @Test
    void showInheritedMethods() {
        Object[] expected = new Object[]{"equilateral", 5.0, 5.0};
        Object[] results = new Object[]{coloredTriangle.getStyle(), coloredTriangle.getHeight(),
                coloredTriangle.getWidth()};
        assertArrayEquals(expected, results);
    }
}