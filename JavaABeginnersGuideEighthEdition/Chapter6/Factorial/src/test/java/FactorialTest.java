import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial x;

    @BeforeEach
    void setUp() {
        x = new Factorial();
    }

    @Test
    void factR() {
        assertEquals(120, x.factI(5));
    }

    @Test
    void factI() {
        assertEquals(120, x.factR(5));
    }
}