import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int age = year - birthYear;
            scanner.nextLine(); // handle the next line character (enter key) this is needed to handle the non-integer
            // next line character

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your age is: " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }


        scanner.close();
    }
}
