public class Main {

    public static void main(String[] args) {
        double[][] dataArraySetOne = {{-3.4, 2.1, 1.5, 2}, {3.4, 2.1, 1.5, 2}, {2.75, 3.25, 2.5, 1}};
        double[][] dataArraySetTwo = {{-3.4, 2.1, 1.5}, {3.4, 2.1, 1.5}, {7.25, 4.3, 2.35}};
        double[][] dataArraySetThree = {{3.4, 1.5}, {6.26, 2.2}, {3.26, 0.75}};
        for (double[] data: dataArraySetOne) {
            System.out.println(PaintJob.getBucketCount(data[0], data[1], data[2], (int)data[3]));
        }
        System.out.println();
        for (double[] data: dataArraySetTwo) {
            System.out.println(PaintJob.getBucketCount(data[0], data[1], data[2]));
        }
        System.out.println();
        for (double[] data: dataArraySetThree) {
            System.out.println(PaintJob.getBucketCount(data[0], data[1]));
        }
    }
}
