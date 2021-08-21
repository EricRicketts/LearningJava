package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result is: " + previousResult);
        result = result - 1;
        System.out.println("The new result is: " + result);
        System.out.println("However, result does not change previous result: " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("Remainder of 4 / 3 is: " + result);
        result++; // same as result + 1;
        System.out.println("1 + 1 = " + result);
        result--; // same as result - 1;
        System.out.println("2 - 1 = " + result);
        result += 2; // result = result + 2;
        System.out.println("1 + 2 = " + result);
        result *= 10; // result = result * 10;
        System.out.println("3 * 10 = " + result);
        result /= 3; // result = result / 3;
        System.out.println("30 / 3 = " + result);
        result -= 2; // result = result = 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        boolean isAlien2 = true;
        if(isAlien == false)
            System.out.println("It is not an alien");
        if (isAlien2) {
            System.out.println("It is not an alien");
            System.out.println("I am not scared of aliens");
        }

        int topScore = 80;
        int secondTopScore = 60;
        if (topScore < 100) {
            System.out.println("You got the high score.");
        }
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of hte conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) { // if (newValue = 50) gives an error because the assignment returns an int
            // but in an if expression, the conditional must return a boolean
            System.out.println("this is true");
        }
        boolean isCar = false;
        if (isCar = true) { // no error here because assignment returns a boolean but we have a logical error
            System.out.println("logical error should use == instead");
        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
