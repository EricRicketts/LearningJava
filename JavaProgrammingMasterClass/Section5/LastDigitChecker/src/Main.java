public class Main {

    public static void main(String[] args) {
        int[][] numbersArray = {{41, 22, 71}, {23, 32, 42}, {303, 513, 422}, {19, 99, 29}, {9, 99, 999}};
        for (int[] numbers: numbersArray) {
            System.out.println(LastDigitChecker.hasSameLastDigit(numbers[0], numbers[1], numbers[2]));
        }
    }
}
