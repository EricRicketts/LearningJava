public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count == 5) break;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5");
                sum += i;
                count += 1;
            }
        }
        String finalSumStatement = "The total sum of the first five numbers divisible by" +
                " both 3 and 5 from 1 to 1000 is: " + sum;
        System.out.println(finalSumStatement);
    }
}
