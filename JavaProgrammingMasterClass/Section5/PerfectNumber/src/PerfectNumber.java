public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumOfFactors = 0;
        for (int integer = 1; integer < number; integer += 1) {
            if (number % integer == 0) sumOfFactors += integer;
        }
        return sumOfFactors == number;
    }
}

/*
    1.  find the factors if the number, keep a variable call sumOfFactors
    2.  loop through the factors except for the number itself
    3.  if the integer is a factor add is to sumOfFactors
    4.  sumOfFactors == number then it is a perfect number
*/
