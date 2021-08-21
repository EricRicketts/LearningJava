public class Main {

    public static void main(String[] args) {
        int[] dataArray = {0, 123_456_789, 252, -1, 2000};
        for (int number: dataArray) {
            System.out.println(EvenDigitSum.getEvenDigitSum(number));
        }
    }
}
