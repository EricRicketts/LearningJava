package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
      int myIntValue = 10_000; // underscores allowed for making numbers more readable
      long myLongValue = 100_000L; // long values need to be suffixed with 'L' or 'l', 'L' is preferred
      /*
        When it comes to integer numbers, Java uses an int by default, so as you will see below when we
        take a short or byte and perform an operation on it, Java will assume an int so we will get a type
        error.  In order to fix this we need to cast our variable.
      */
      int myMinIntValue = Integer.MIN_VALUE;
      int myMaxIntValue = Integer.MAX_VALUE;
      byte myMinByteValue = Byte.MIN_VALUE;
      byte myMaxByteValue = Byte.MAX_VALUE;
      short myMinShortValue = Short.MIN_VALUE;
      short myMaxShortValue = Short.MAX_VALUE;
      long myMinLongValue = Long.MIN_VALUE;
      long myMaxLongValue = Long.MAX_VALUE;

      // in both cases below without the case we would have an type error as Java would assume int on the right
      int myNewIntValue = (myMinIntValue / 2); // no casting required here, assumes an int on the right
      byte myNewByteValue = (byte) (myMinByteValue / 2);
      short myNewShortValue = (short) (myMinShortValue / 2);

      System.out.println("myIntValue is: " + myIntValue);
      System.out.println("myLongValue is: " + myLongValue);
      System.out.println("Integer Minimum Value: " + myMinIntValue);
      System.out.println("Integer Maximum Value: " + myMaxIntValue);
      System.out.println("Integer Overflow Value: " + (myMaxIntValue + 1));
      System.out.println("Integer Underflow Value: " + (myMinIntValue - 1));
      System.out.println("Byte Minimum Value: " + myMinByteValue);
      System.out.println("Byte Maximum Value: " + myMaxByteValue);
      System.out.println("Short Minimum Value: " + myMinShortValue);
      System.out.println("Short Maximum Value: " + myMaxShortValue);
      System.out.println("Long Minimum Value: " + myMinLongValue);
      System.out.println("Long Maximum Value: " + myMaxLongValue);
      System.out.println("myNewIntValue: " + myNewIntValue);
      System.out.println("myNewShortValue: " + myNewShortValue);
      System.out.println("myNewByteValue: " + myNewByteValue);
    }
}
