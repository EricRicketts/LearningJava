import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTest {

    private A a;
    private B b;
    @BeforeEach
    void setUp() {
        a = new A(1, 2);
        b = new B(1, 2, 3);
    }

    @Test
    void getk() {
        assertEquals(3, b.getk());
    }

    @Test
    void setk() {
        b.setk(4);
        assertEquals(4, b.getk());
    }

    @Test
    void show() {
        String[] expected = new String[]{"i is: 1 j is: 2", "k is: 3"};
        String[] results = new String[]{a.show(), b.show()};
        assertArrayEquals(expected, results);
    }
}