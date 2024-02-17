package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethodsTest {

    private final Random random = new Random();
    private final int[] randomAry = new int[10];

    @BeforeEach
    public void setUp() {
        for (int index = 0; index < randomAry.length; index++) randomAry[index] = random.nextInt(100);
    }

    @Test
    public void testBoundedRandomNumbers() {
        for (int randomNumber : randomAry) {
            boolean numericBound = randomNumber > -1 && randomNumber < 100;
            Assertions.assertTrue(numericBound);
        }
    }

    @Test
    public void testSortRandomArray() {
        Arrays.sort(randomAry);
        int greaterCount = 0, equalCount = 0;
        for (int index = 0; index < randomAry.length - 1; index++) {
            if (randomAry[index] < randomAry[index + 1]) greaterCount += 1;
            if (randomAry[index] == randomAry[index + 1]) equalCount += 1;
        }
        Assertions.assertTrue(equalCount < greaterCount);
        // 0-1, 1-2, 2-3, 3-4, 4-5, 5-6, 6-7, 7-8, 8-9
    }

    @Test
    public void testFillArray() {
        int[] fillAry = new int[10];
        Arrays.fill(fillAry, 5);
        for (int i : fillAry) {
            Assertions.assertEquals(5, i);
        }
    }

    @Test
    public void testCopyArray() {
        int[] copyOfRandomAry = Arrays.copyOf(randomAry, randomAry.length);
        for (int index = 0; index < randomAry.length; index++) {
            Assertions.assertEquals(randomAry[index], copyOfRandomAry[index]);
        }
    }

    @Test
    public void testCopyArrayCreatesNewInstance() {
        boolean foundUnsortedNumber = false;
        int[] copyOfRandomAry = Arrays.copyOf(randomAry, randomAry.length);
        // if the sort of the copy does not affect the original array then
        // we should find unequal numbers as we cycle through the indices
        // as the original randomAry will remain unsorted
        Arrays.sort(copyOfRandomAry);
        for (int index = 0; index < randomAry.length; index++) {
            if (randomAry[index] != copyOfRandomAry[index]) {
                foundUnsortedNumber = true;
                break;
            }
        }
        Assertions.assertTrue(foundUnsortedNumber);
    }

    @Test
    public void testCopyArrayLessThanOriginalLength() {
        int[] originalAry = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyOfLessSize = Arrays.copyOf(originalAry, 5);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, copyOfLessSize);
    }

    @Test
    public void testCopyArrayGreaterThanOriginalLength() {
        int[] smallAry = {0, 1, 2, 3};
        int[] largeAry = Arrays.copyOf(smallAry, 6);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 0, 0}, largeAry);
    }


}
