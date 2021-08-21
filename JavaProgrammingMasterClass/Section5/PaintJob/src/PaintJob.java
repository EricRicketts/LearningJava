public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        return (int) (Math.ceil((width * height) / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        return (int) (Math.ceil((width * height) / areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;

        return (int) (Math.ceil(area / areaPerBucket));
    }
}

/*
    1.  calculate the area which should be a double
    2.  calculate the number of buckets needed by dividing the area by the areaPerBucket, use Math.ceil to return
    an integer
    3.  subtract the extraBuckets to get the final bucket count
*/
