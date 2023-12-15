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

    @Test
    public void testCourseDateThreeParameters() {
        List<Double> widths = new ArrayList<>(Arrays.asList(
                -3.4, 0.0, 3.4, 3.4, 1.4, 2.25,
                3.4, 3.26, 8.45, 7.25, 6.26, 3.46
        ));

        List<Double> heights = new ArrayList<>(Arrays.asList(
                2.1, 2.1, -2.1, 0.0, 2.1, 2.0,
                2.1, 2.15, 4.6, 4.3, 3.84, 7.12
        ));

        List<Double> areasPerBuckets = new ArrayList<>(Arrays.asList(
                1.5, 1.5, 1.5, 1.5, -1.5, 0.0,
                1.5, 0.75, 2.25, 2.35, 2.2, 4.2
        ));

        List<Integer> bucketCounts = new ArrayList<>(Arrays.asList(
                -1, -1, -1, -1, -1, -1,
                5, 10, 18, 14, 11, 6
        ));

        for (int index = 0; index < bucketCounts.size(); index++) {
            double width = widths.get(index);
            double height = heights.get(index);
            double areaPerBucket = areasPerBuckets.get(index);
            int bucketCount = bucketCounts.get(index);

            Assertions.assertEquals(
                    bucketCount,
                    PaintJob.getBucketCount(width, height, areaPerBucket)
            );
        }
    }

    @Test
    public void testCourseDataFourParameters() {
        List<Double> widths = new ArrayList<>(Arrays.asList(
                -3.4, 0.0, 3.4, 3.4, 1.4,
                2.25, 1.4, 1.4, 3.4, 2.75,
                0.75, 7.32, 5.55, 4.14, 6.12,
                9.25, 6.24, 7.55, 6.35, 1.22
        ));

        List<Double> heights = new ArrayList<>(Arrays.asList(
                2.1, 2.1, -2.1, 0.0, 2.1,
                2.0, 2.1, 2.1, 2.1, 3.25,
                0.75, 6.45, 4.75, 2.28, 3.11,
                2.22, 5.75, 7.11, 6.65, 3.11
        ));

        List<Double> areaPerBuckets = new ArrayList<>(Arrays.asList(
                1.5, 1.5, 1.5, 1.5, -1.5,
                0.0, 1.5, 1.5, 1.5, 2.5,
                0.5, 2.22, 3.25, 1.32, 1.25,
                2.125, 6.25, 3.12, 2.6, 2.5
        ));

        List<Integer> extraBucketsCounts = new ArrayList<>(Arrays.asList(
                2, 7, 2, 6, 2,
                4, -4, -1, 2, 1,
                0, 10, 3, 1, 2,
                4, 3, 9, 5, 0
        ));

        List<Integer> bucketCounts = new ArrayList<>(Arrays.asList(
                -1, -1, -1, -1, -1,
                -1, -1, -1, 3, 3,
                2, 12, 6, 7, 14,
                6, 3, 9, 12, 2
        ));

        for (int index = 0; index < bucketCounts.size(); index++) {
            double width = widths.get(index);
            double height = heights.get(index);
            double areaPerBucket = areaPerBuckets.get(index);
            int extraBuckets = extraBucketsCounts.get(index);
            int bucketCount = bucketCounts.get(index);

            Assertions.assertEquals(
                    bucketCount,
                    PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckets)
            );
        }
    }
}
