public class Main {

    public static void main(String[] args) {
        int[] numbers = {1000, 123, 1010, 9876, -12};
        for (int number: numbers) {
            NumberToWords.numberToWords(number);
            System.out.println("");
        }
        int[] numberArray = {12, -12, 4, -4};
        for (int number: numberArray) {
            System.out.println(NumberToWords.reverse(number));
        }
    }
}
