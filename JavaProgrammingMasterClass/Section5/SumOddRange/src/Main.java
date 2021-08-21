public class Main {

    public static void main(String[] args) {
        int[][] testData = {{1, 100}, {-1, 100}, {100, 100}, {13, 13}, {100, -100}, {100, 1000}};
        for (int[] data: testData) {
            System.out.println(SumOddRange.sumOdd(data[0], data[1]));
        }
    }
}
