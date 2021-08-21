public class Main {

    public static void main(String[] args) {
        int[][] dataArray = {{12, 23}, {9, 99}, {15, 55}, {12, 345}, {10, 50}, {12, 13}};
        for (int[] numbers: dataArray) {
            System.out.println(SharedDigit.hasSharedDigit(numbers[0], numbers[1]));
        }
    }
}
