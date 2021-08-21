import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticTypeConversionTest {

    @Test
    void longToDouble() {
        assertEquals(10.0, AutomaticTypeConversion.longToDouble(10L));
    }

    @Test
    void charToInt() {
        assertEquals(90, AutomaticTypeConversion.charToInt('Z'));
    }
}