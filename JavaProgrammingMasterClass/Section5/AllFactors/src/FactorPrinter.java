public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int integer = 1; integer <= number; integer += 1) {
                if (number % integer == 0) System.out.println(integer);
           }
        }
    }
}

/*
    1.  loop through integers less than or equal to the number
    2.  if the integer evenly divides the number print it out
*/
