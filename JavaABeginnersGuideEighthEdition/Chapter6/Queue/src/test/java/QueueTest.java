import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue q;

    @BeforeEach
    void setUp() {
        q = new Queue(5);
        for (int i = 0; i < 5; i += 1) {
            char ch = (char) ('a' + i);
            q.put(ch);
        }
    }

    @Test
    void get() {
        char[] expected = {'a', 'b', 'c', 'd', 'e'};
        char[] results = new char[5];
        for (int i = 0; i < 5; i += 1) {
            results[i] = q.get();
        }
        assertArrayEquals(expected, results);
    }
}