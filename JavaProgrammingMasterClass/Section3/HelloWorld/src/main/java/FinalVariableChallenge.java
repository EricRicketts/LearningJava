package main.java;

public class FinalVariableChallenge {
  public static void main(String[] args) {
    int myFirstNumber = (10 + 5) + (2 * 10);
    int mySecondNumber = 12;
    int myThirdNumber = myFirstNumber * 2;
    int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
    int myLastOne = 1000 - myTotal;

    System.out.print("myLastOne has a value of: ");
    System.out.println(myLastOne);
  }
}
