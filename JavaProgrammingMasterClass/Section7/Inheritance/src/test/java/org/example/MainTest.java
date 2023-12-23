package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    String expected, result;

    @Test
    public void testPassingInSubClass() {
        Main main = new Main();
        SimpleDog simpleDog = new SimpleDog();
        expected = "null makes some kind of noise.\n" +
                "null moves fast.\n" +
                "SimpleDog{" +
                "type='" + "null" + '\'' +
                ", size='" + "null" + '\'' +
                ", weight=" + "0.0" +
                '}';
        result = main.doAnimalStuff(simpleDog, "fast");
        Assertions.assertEquals(expected, result);
    }
}
/*
    The code above demonstrates a very important principle called the "Liskov Substitution Principle" => LSP,
    which states that an object (such as a class) may be replaced by a sub-object (such as a class which
    extends the first class) without breaking the program.

    The reverse is not true if we declare what is in essence a subclass as a method argument then a parent
    class CANNOT be passed in as an argument.  So if we declared in the doAnimalStuff method an instance
    of SimpleDog class as the first parameter instead of an instance of the Animal class then passing in an
    instance of type Animal would yield a compile error.

*/
