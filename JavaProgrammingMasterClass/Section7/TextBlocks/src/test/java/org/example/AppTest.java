package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Formatter;

public class AppTest {

    App app;
    String result, expected;
    int age, birthYear;
    Formatter f;

    @BeforeEach
    public void setUp() {
        app = new App();
        f = new Formatter();
        age = 63;
        birthYear = 1960;
    }

    @Test
    public void testBulletedString() {
        result = """
                Print a Bulleted List:
                    • First Point
                        • Sub Point""";
        expected = app.bulletedString();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSimpleFormat() {
        expected = "I am 63 years old.";
        int age = 63;
        f.format("I am %d years old.", age);
        result = f.toString();
        Assertions.assertEquals(expected, result);
    /*
        Note to print to the console we could use System.out.printf("I am %d years old.", age);
    */
    }

    @Test
    public void testMultipleArgumentsToFormat() {
        expected = "Age = 63, Birth year = 1960\n";
        result = String.format("Age = %d, Birth year = %d%n", age, birthYear);
        Assertions.assertEquals(expected, result);
        expected = "Age = 62, Birth year = 1961\n";
        age = 62; birthYear = 1961;
        result = "Age = %d, Birth year = %d\n".formatted(age, birthYear);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFloatingPointFormat() {
        expected = "My age is 63.00.";
        result = String.format("My age is %.2f.", (float) age);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSpaceVariablesFormat() {
        int number = 100;
        expected = "Printing 100\n";
        result = "Printing %d%n".formatted(number);
        Assertions.assertEquals(expected, result);
        result = "Printing %3d%n".formatted(number);
        Assertions.assertEquals(expected, result);
        expected = "Printing    100 \n";
        result = String.format("Printing %6d \n", number);
        Assertions.assertEquals(expected, result);
        result = "Printing %6d \n".formatted(number);
        Assertions.assertEquals(expected, result);
        /*
            Originally, I could not figure out why "Printing %3d%n" would not give me 3 spaces
            in from of the number 100.  I then figured out Java includes the width of the number
            when counting the number of spaces.  Since the number, 100, is 3 characters in length
            then to add in extra space the spacing would have to be %4d.
        */
    }
}
