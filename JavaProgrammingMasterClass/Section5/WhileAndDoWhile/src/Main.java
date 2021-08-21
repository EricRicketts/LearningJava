public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.println("count value is: " + count);
            count++;
        }

        count = 0;
        while (true) {
            if (count > 4) break;
            System.out.println("count value is: " + count);
            count ++;
        }

        count = 0;
        do {
            System.out.println("count value is: " + count);
            count++;
        } while (count < 5);

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) continue;
            System.out.println("The even number is: " + number);
        }

        number = 4;
        count = 0;
        do {
            number++;
            if (!isEvenNumber(number)) continue;
            count++;
            System.out.println("The even number is: " + number);
            if (count >= 5) break;
        } while (number <= finishNumber);
        System.out.println("The number of even numbers found is: " + count);
    }

    public static boolean isEvenNumber(int number) {
        return (number > 0 && (number % 2 == 0));
    }
}
