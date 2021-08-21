public class Main {

    public static void main(String[] args) {
        int[] numberArray = {4, 5, 6, 7, 8};
        for (int number: numberArray) {
            DiagonalStar.printSquareStar(number);
            System.out.println();
        }
    }
}
