public class Main {

    public static void main(String[] args) {
        int[][] numbersArray = {{25, 15}, {12, 30}, {9, 18}, {81, 153}, {1010, 10}};
        for (int[] numbers: numbersArray) {
            System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(numbers[0], numbers[1]));
        }
    }
}
