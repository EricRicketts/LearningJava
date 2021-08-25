import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErrorInfoTest {

    private ErrorInfo err;
    private Err e;

    @BeforeEach
    void setUp() {
        err = new ErrorInfo();
    }

    @Test
    void getErrorInfoValid() {
        e = err.getErrorInfo(2);
        assertEquals("Disk Full", e.msg);
        assertEquals(2, e.severity);
    }

    @Test
    void getErrorInfoInvalid() {
        e = err.getErrorInfo(19);
        assertEquals("Invalid Error Code", e.msg);
        assertEquals(0, e.severity);
    }
}