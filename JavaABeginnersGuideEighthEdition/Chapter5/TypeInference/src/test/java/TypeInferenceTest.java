import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeInferenceTest {

    @Test
    void simplePrimitiveDeclarations() {
        double x = 10.0;
        var y = 10.0; // type is inferred
        assertEquals(x, y);
    }

    @Test
    void inferredObjectDeclarations() {
        int[] arrayOne = {1, 2, 3};
        var arrayTwo = new int[3];
        arrayTwo = new int[]{1, 2, 3};

        assertArrayEquals(arrayOne, arrayTwo);
    }

    @Test
    void typeInferenceForClass() {
        var foo = new TypeInference(5);
        int exepected[] = new int[]{5, 6};
        int[] results = new int[2];
        results[0] = foo.geti();
        foo.seti(6);
        results[1] = foo.geti();
        assertArrayEquals(exepected, results);
    }

}