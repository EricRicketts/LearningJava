import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    private A a;
    private C c;
    @BeforeEach
    void setUp() {
        a = new A(1, 2);
        c = new C(1, 2, 3);
    }
    @Test
    void showA() {
        assertEquals("i is: 1 j is: 2", a.show());
    }

    @Test
    void showC() {
        assertEquals("i is: 1 j is: 2 k is: 3", c.show());
    }
}