package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintJobTest {

    @Test
    public void testFirstCourseExamplesFourParameters() {
        Assertions.assertEquals(
                -1,
                PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2)
        );

        Assertions.assertEquals(
                3,
                PaintJob.getBucketCount(3.4, 2.1, 1.5, 2)
        );

        Assertions.assertEquals(
                3,
                PaintJob.getBucketCount(2.75, 3.25, 2.5, 1)
        );
    }

    @Test
    public void testCourseExamplesThreeParameters() {
        Assertions.assertEquals(
                -1,
                PaintJob.getBucketCount(-3.4, 2.1, 1.5)
        );

        Assertions.assertEquals(
                5,
                PaintJob.getBucketCount(3.4, 2.1, 1.5)
        );

        Assertions.assertEquals(
                14,
                PaintJob.getBucketCount(7.25, 4.3, 2.35)
        );
    }

    @Test
    public void testCourseExamplesTwoParameters() {
        Assertions.assertEquals(
                3,
                PaintJob.getBucketCount(3.4, 1.5)
        );

        Assertions.assertEquals(
                3,
                PaintJob.getBucketCount(6.26, 2.2)
        );

        Assertions.assertEquals(
                5,
                PaintJob.getBucketCount(3.26, 0.75)
        );
    }

    @Test
    public void testCourseDataTwoParameters() {
        List<Double> areas = new ArrayList<>(Arrays.asList(
                -3.4, 0.0, 1.4, 2.25, 3.4,
                3.26, 8.45, 7.25, 6.26, 3.46
        ));

        List<Double> areasPerBuckets = new ArrayList<>(Arrays.asList(
                1.5, 1.5, -1.5, 0.00, 1.5,
                0.75, 2.25, 2.35, 2.2, 1.2
        ));

        List<Integer> bucketCounts = new ArrayList<>(Arrays.asList(
                -1, -1, -1, -1, 3,
                5, 4, 4, 3, 3
        ));

        for (int index = 0; index < bucketCounts.size(); index++) {
            Double area = areas.get(index);
            Double areaPerBucket = areasPerBuckets.get(index);
            int bucketCount = bucketCounts.get(index);
            Assertions.assertEquals(
                    bucketCount,
                    PaintJob.getBucketCount(area, areaPerBucket)
            );
        }
    }
}
