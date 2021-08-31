package bookpackext;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProtectDemoTest {

    @Test
    void main() {
        String expected = "Java: A Beginner's Guide Java: The Complete Reference Introducing JavaFX 8 Programming";
        assertEquals(expected, ProtectDemo.getSchildt());
    }
}