package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class SectionNineSortingChallengeTest {

    private final Random random = new Random();
    int[] ary = new int[10];

    private int[] bubbleSort(int[] ary) {
        int[] aryCopy = Arrays.copyOf(ary, ary.length);
        int aryLength = aryCopy.length;
        boolean swapped = false;
        for (int i = 0; i < aryLength - 1; i++) {
            for (int j = 0; j < aryLength - i - 1; j++) {
                if (aryCopy[j] < aryCopy[j + 1]) {
                    int temp = aryCopy[j];
                    aryCopy[j] = aryCopy[j + 1];
                    aryCopy[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return aryCopy;
    }

    @BeforeEach
    public void setUp() {
        for (int index = 0; index < ary.length; index++) ary[index] = random.nextInt(100);
    }
/*
[10, 44, 55, 23, 76] => [76, 55, 44, 23, 10]
[44, 55, 23, 76, 10]
[55, 44, 76, 23, 10]
[55, 76, 44, 23, 10]
[76, 55, 44, 23, 10]
 */
    @Test
    public void testReverseSortedArray() {
        int greaterCount = 0, equalCount = 0;
        int[] sortedAry = this.bubbleSort(ary);
        for (int index = 0; index < sortedAry.length - 2; index++) {
            if (sortedAry[index] > sortedAry[index + 1]) greaterCount += 1;
            if (sortedAry[index] == sortedAry[index + 1]) equalCount += 1;
            Assertions.assertTrue(sortedAry[index] >= sortedAry[index + 1]);
        }
        Assertions.assertTrue(greaterCount > equalCount);
    }
}
