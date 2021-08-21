import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromotionDemoTest {

    @Test
    void integerBackToByte() {
        String expected = "int from bytes, no cast needed i = 100 cast needed for byte * byte b = 100";
        assertEquals(expected, PromotionDemo.integerBackToByte());
    }

    @Test
    void charBackToChar() {
        String expected = "concat two chars need type cast, 'a' + 'b' is integer value: 195";
        assertEquals(expected, PromotionDemo.charBackToChar());
    }
}