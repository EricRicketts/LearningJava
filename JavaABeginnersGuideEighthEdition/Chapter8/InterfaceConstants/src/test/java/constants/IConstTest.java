package constants;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IConstTest implements IConst {

    @Test
    void minMaxErrorMsg() {
        Object[] expected = new Object[]{0, 10, "Boundary Error"};
        Object[] results = new Object[]{MIN, MAX, ERRORMSG};
        assertArrayEquals(expected, results);
    }

}