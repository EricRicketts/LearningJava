import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodOverloadingTest {

    private MethodOverloading ob;

    @BeforeEach
    void setUp() {
        ob = new MethodOverloading();
    }

    @Test
    void ov1Demo() {
        assertEquals("no parameters", ob.ov1Demo());
    }

    @Test
    void testOv1Demo() {
        assertEquals(2, ob.ov1Demo(2));
    }

    @Test
    void testOv1Demo1() {
        assertEquals(5, ob.ov1Demo(2, 3));
    }

    @Test
    void testOv1Demo2() {
        assertEquals(-2.0, ob.ov1Demo(3.0, 5.0));
    }
}