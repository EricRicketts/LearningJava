public class Main {

    public static void main(String[] args) {
        int[][] testData = {{10, 1}, {-1, -1}, {4, -1}, {125, 8}, {1_568, 20}, {32_123, 11}};
        for (int[] data: testData) {
            System.out.println(sumDigits(data[0]) == data[1]);
        }
    }

    public static int sumDigits(int number) {
        if (number < 10) return -1;
        int nextNumber = number, sumOfDigits = 0;
        final int base = 10;
        do {
            sumOfDigits += (nextNumber % base);
            nextNumber = nextNumber / base;
        } while (nextNumber > 0);
        return sumOfDigits;
    }
}
/*
    the number is >= 10
    1.  first get the last digit by (number % 10);
    2.  add this last digit to the digit sum; digitSum += lastDigit
    3.  get the next number to text by (number / 10);
    4.  if the next number is 0 that is (number / 10) == 0; then exit
*/
