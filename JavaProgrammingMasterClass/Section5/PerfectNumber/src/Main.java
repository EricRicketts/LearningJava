public class Main {

    public static void main(String[] args) {
        int[] numbers = {6, 28, 5, -1, 496, 8128, 100, 53};
        for (int number: numbers) {
            System.out.println(PerfectNumber.isPerfectNumber(number));
        }
    }
}
