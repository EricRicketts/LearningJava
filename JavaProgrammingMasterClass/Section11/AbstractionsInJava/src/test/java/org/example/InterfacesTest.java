package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterfacesTest {

    private Bird bird;
    private GenericAnimal animal;
    private FlightEnabled flier;
    private Trackable tracked;

    @BeforeEach
    public void setUp() {
        bird = new Bird();
        animal = bird;
        flier = bird;
        tracked = bird;
    }

    /*
        If I attempt to call filer.move() or tracked.move() I will get a compiler error.  This is
        because filer is of a FlightEnabled type and tracked is of a Trackable type.  Neither of
        these types have a move() method defined.  In the case of animal of the GenericAnimal
        type, there is a move() method which is defined with abstract but the implementation is
        in the Bird class, which gets called when using animal.move().  Note I did not instantiate
        a GenericAnimal class, which is not allowed, I assigned an existing Bird object to
        the GenericAnimal class, this is permitted as it is also permitted with the two Interfaces
        FlightEnabled and Trackable.

        Note as with the abstract class GenericAnimal I cannot instantiate an Interface.

        In the Bird declaration => public class Bird extends GenericAnimal implements FlightEnabled, Trackable {},
        I can assign both FlightEnabled and Trackable a Bird object, as well as GenericAnimal.

        A class can only extend a single class (so Java is called Single Inheritance) but it can implement many
        interfaces (this is called plug and play) and is what makes Interfaces so powerful.

    */

    @Test
    public void testBirdObject() {
        Assertions.assertEquals("Bird moved.", bird.move());
    }

    @Test
    public void testGenericAnimalObject() {
        Assertions.assertEquals("Bird moved.", animal.move());
    }
}
