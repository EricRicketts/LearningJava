import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DTest {

    private D d;
    @BeforeEach
    void setUp() {
        d = new D(1, 2, 3);
    }
    @Test
    void showInherited() {
        assertEquals("i is: 1 j is: 2", d.show());
    }

    @Test
    void showUniqueToClass() {
        assertEquals("foobar k is: 3", d.show("foobar"));
    }
}