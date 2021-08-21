import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockDemoTest {

    @Test
    void main() {
        assertEquals("result of division is: 2.5", BlockDemo.main(2));
        assertEquals("cannot divide by 0", BlockDemo.main(0));
    }
}