package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalArraysTest {

    private final int[][] symmetric2DArray = new int[4][4];
    private final int[][] freeForm2DArray = new int[4][];

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < symmetric2DArray.length; i++) {
            for (int j = 0; j < symmetric2DArray[i].length; j++) {
                symmetric2DArray[i][j] = (10 * i) + (j + 1);
            }
        }
        freeForm2DArray[0] = new int[]{0, 1, 2, 3, 4};
        freeForm2DArray[1] = new int[]{0, 1};
        freeForm2DArray[2] = new int[]{-3, -2, -1, 0};
        freeForm2DArray[3] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    public void testSquare2DArray() {
        int[][] expected = new int[][]{
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };
        Assertions.assertArrayEquals(expected, symmetric2DArray);
    }

    @Test
    public void testGetValuesFromFreeForm2DArray() {
        List<Integer> expected = new ArrayList<>(){{
            add(3); add(0); add(-1); add(8);
        }};
        List<Integer> results = new ArrayList<>(){{
            add(freeForm2DArray[0][3]);
            add(freeForm2DArray[1][0]);
            add(freeForm2DArray[2][2]);
            add(freeForm2DArray[3][8]);
        }};

        Assertions.assertEquals(expected, results);
    }
}
