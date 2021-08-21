import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example3Test {

    @Test
    void main() {
        String[] expected = {"Original value of v: 10 Original value of x: 10.0",
                "v after division: 2 x after division: 2.5"};
        assertArrayEquals(expected, Example3.main());
    }
}