import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForDemoTest {

    @Test
    void main() {
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, ForDemo.main());
    }
}