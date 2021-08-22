import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTwoTest {

    @Test
    void parameterizedConstructor() {
        int[] expected = {10, 20};
        MyClassTwo objOne = new MyClassTwo(10), objTwo = new MyClassTwo(20);
        int[] results = new int[]{objOne.x, objTwo.x};
        assertArrayEquals(expected, results);
    }

}