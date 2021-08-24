import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscellaneousArrayTest {

    private MiscellaneousArray nums1, nums2;

    @BeforeEach
    void setUp() {
        nums1 = new MiscellaneousArray(10);
        nums2 = new MiscellaneousArray(10);
        for (int i = 0; i < 10; i += 1) {
            nums1.array[i] = i + 1;
            nums2.array[i] = -1*(i + 1);
        }
    }

    @Test
    void arraysDifferent() {
        int expected[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}
        };
        int results[][] = {nums1.array, nums2.array};
        assertArrayEquals(expected, results);
    }

    @Test
    void arrayAssignment() {
        nums2 = nums1;
        int expected[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };
        int results[][] = {nums1.array, nums2.array};
        assertArrayEquals(expected, results);
    }

    @Test
    void arrayAssignmentAndModification() {
        nums2 = nums1;
        nums1.array[5] = 99;
        assertEquals(99, nums2.array[5]);
    }

    @Test
    void modifyingArraysInForLoop() {
        // a conventional for loop can modify an array
        int expected[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < nums1.array.length; i += 1) {
            nums1.array[i] *= 10;
        }
        assertArrayEquals(expected, nums1.array);
    }

    @Test
    void modifyingArraysForEachLoop() {
        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int n: nums1.array) {
            n *= 10; // variable in for each type is read only
        }
        assertArrayEquals(expected, nums1.array);
    }

    @Test
    void forEachIterateOverMultiDimensionalArrays() {
        int multi[][] = new int[2][2];
        multi[0] = nums1.array;
        multi[1] = nums2.array;
        int x = 0, y = 0, count = 0;
        for (int[] ary: multi) {
            for (int n: ary) {
                if (count == 0 && n == 5) {
                    x = n;
                    count += 1;
                } else if (count == 1 && n == -5) {
                    y = n;
                }
            }
        }
        int[] expected = {5, -5};
        int[] results = {x, y};
        assertArrayEquals(expected, results);
    }

    @Test
    void breakOutOfForEachLoop() {
        int expected = 5;
        boolean found = false;
        for (int n: nums1.array) {
            if (n == 5) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }
}