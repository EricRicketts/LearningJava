import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

import static org.junit.jupiter.api.Assertions.*;

class CastDemoTest {

    @Test
    void castDoubleToInt() {
        String expected = "truncation of 10.0 / 3.0 to 3 when cast as int";
        assertEquals(expected, CastDemo.castDoubleToInt());
    }

    @Test
    void castIntToByteNoLoss() {
        String expected = "No loss of information when casting int to byte when byte is 100";
        assertEquals(expected, CastDemo.castIntToByteNoLoss());
    }

    @Test
    void castIntToByteLoss() {
        String expected = "Loss of information when casting int of 300 to byte result is 44";
        assertEquals(expected, CastDemo.castIntToByteLoss());
    }

    @Test
    void castByteToChar() {
        String expected = "Can cast byte to a char byte is 88 char is X";
        assertEquals(expected, CastDemo.castByteToChar());
    }
}