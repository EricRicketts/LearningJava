import static org.junit.jupiter.api.Assertions.*;

class IfDemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        String expected = "a is less than b. c is less than zero. c is greater than zero.";
        assertEquals(expected, IfDemo.main());
    }
}