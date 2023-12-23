package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleDogTest {

    private SimpleDog simpleDog;
    private String expected, result;

    @BeforeEach
    public void setUp() {
        simpleDog = new SimpleDog();
        /*
            All methods and fields are inherited but any constructor declarations
            are not inherited as in this case only the non-argument constructor is
            available.  In this case the getters and setters were defined in the
            parent class so the inherited fields can be set.

            Constructors are not inherited because then the constructor for the
            subclass would not have the same name as the subclass.  In this example
            if the SimpleDog class inherits the Animal Constructors then the constructor
            method name would be Animal and not SimpleDog.  It is required that the
            constructor method name be the same as the class name.
        */
    }

    @Test
    public void testInitialDogFields() {
        expected = "SimpleDog{" +
                "type='" + "null" + '\'' +
                ", size='" + "null" + '\'' +
                ", weight=" + "0.0" +
                '}';
        result = simpleDog.toString();
        Assertions.assertEquals(expected, result);
        // note since all methods were inherited from Parent Animal the toString()
        // method came over to SimpleDog without any modification
    }

    @Test
    public void testSetFields() {
        simpleDog.setType("Bullmastiff");
        simpleDog.setSize("Very Large");
        simpleDog.setWeight(100);
        expected = "SimpleDog{" +
                "type='" + "Bullmastiff" + '\'' +
                ", size='" + "Very Large" + '\'' +
                ", weight=" + "100.0" +
                '}';
        result = simpleDog.toString();
        Assertions.assertEquals(expected, result);
    }
}
