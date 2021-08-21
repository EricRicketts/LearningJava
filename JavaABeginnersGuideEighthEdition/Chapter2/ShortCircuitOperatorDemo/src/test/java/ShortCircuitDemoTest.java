import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortCircuitDemoTest {

    @Test
    void shortCircuitSideEffects() {
        String expected = "x is incremented to: 1 and not incremented further.";
        assertEquals(expected, ShortCircuitDemo.sideEffects());
    }

}