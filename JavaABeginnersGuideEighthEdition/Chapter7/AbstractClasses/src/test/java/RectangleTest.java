import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private TwoDShape[] shapes;
    @BeforeEach
    void setUp() {
       shapes = new TwoDShape[4];
       shapes[0] = new Triangle("outlined", 8.0, 12.0);
       shapes[1] = new Rectangle(10);
       shapes[2] = new Rectangle(10, 4);
       shapes[3] = new Triangle(7.0);
    }
    @Test
    void isSquare() {
        // we have to cast shapes[1] as a Rectangle or else we cannot call isSquare() because isSquare is not
        // defined in TwoDShape class
        Rectangle rect = new Rectangle((Rectangle) shapes[1]);
        assertTrue(rect.isSquare());
    }

    @Test
    void area() {
        // abstract method, area(), in TwoDShape defined in Rectangle so we can call it
        assertEquals(40, shapes[2].area());
    }
}