package org.example;

public class PaintJob {

    public static int getBucketCount(
            double width, double height, double areaPerBucket, int extraBuckets
    ) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) return -1;

        double initialArea = width * height;
        double remainingArea = initialArea - (extraBuckets * areaPerBucket);
        double preciseBucketCount = Math.ceil(remainingArea / areaPerBucket);

        return (int) preciseBucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) return -1;

        double area = width * height;
        double preciseBucketCount = Math.ceil(area / areaPerBucket);

        return (int) preciseBucketCount;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) return -1;

        double preciseBucketCount = Math.ceil(area / areaPerBucket);

        return (int) preciseBucketCount;
    }
}
