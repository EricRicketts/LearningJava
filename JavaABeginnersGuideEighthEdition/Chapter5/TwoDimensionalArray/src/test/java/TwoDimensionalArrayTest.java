import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimensionalArrayTest {

    @Test
    void make_array() {
        TwoDimensionalArray twoDimension = new TwoDimensionalArray();
        int[][] testArray = twoDimension.make_array(3, 4);
        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 4; j += 1) {
                testArray[i][j] = (i * 4) + j + 1;
            }
        }
        assertEquals(1, testArray[0][0]);
        assertEquals(12, testArray[2][3]);
    }

    @Test
    void irregular_array() {
        int[][] example = new int[3][];
        example[0] = new int[2];
        example[1] = new int[3];
        example[2] = new int[4];
        for (int i = 0; i < 3; i += 1) {
            if (i == 0) {
                for (int j = 0; j < 2; j += 1) {
                    example[i][j] = i + j + 1;
                }
            }
            else if (i == 1) {
                for (int j = 0; j < 3; j += 1) {
                    example[i][j] = i + j + 1;
                }
            }
            else {
                for (int j = 0; j < 4; j += 1) {
                    example[i][j] = i + j + 1;
                }
            }
        }
        assertEquals(1, example[0][0]);
        assertEquals(6, example[2][3]);
    }

    @Test
    void threeDimensionalArray() {
        int example[][][] = {{{2, 4, 6}, {8, 10, 12}, {14, 16, 18}}, {{20, 22, 24}, {26, 28, 30}, {32, 34, 36}},
                {{38, 40, 42}, {44, 46, 48}, {50, 52, 54}}};
        int lastElement = example[2][2][2];
        int[] lastXY= example[2][2];
        assertEquals(54, lastElement);
        int expected[] = {50, 52, 54};
        assertArrayEquals(expected, lastXY);
    }
}