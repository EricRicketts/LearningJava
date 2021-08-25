import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassByReferenceTest {

    @Test
    void change() {
        PassByReference ob1 = new PassByReference(10, 15), ob2 = new PassByReference(10, 15);
        int[] expected = new int[]{10, 15, 25, -15};
        int[] results = new int[4];
        results[0] = ob1.a; results[1] = ob1.b;
        ob1.change(ob2);
        results[2] = ob1.a; results[3] = ob1.b;
        assertArrayEquals(expected, results);
    }
}