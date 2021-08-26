import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue q1, q2, q3;

    @BeforeEach
    void setUp() {
        char[] name = {'T', 'o', 'm'};
        q1 = new Queue(10);
        q2 = new Queue(name);
        for (int i = 0; i < 10; i += 1) {
            q1.put((char) ('A' + i));
        }
        q3 = new Queue(q1);
    }

    @Test
    void q2Contents() {
        String expected = "Tom";
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < 3; i += 1) {
            results.append(q2.get());
        }
        assertEquals(expected, results.toString());
    }

    @Test
    void q1AndQ3TheSame() {
        StringBuilder expected = new StringBuilder();
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < 10; i += 1) {
            expected.append(q1.get());
            results.append(q3.get());
        }
        assertEquals(expected.toString(), results.toString());
    }
}