package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.util.stream.DoubleStream.concat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InterfacesTest {

    private Bird bird;
    private GenericAnimal animal;
    private FlightEnabled flier;
    private Trackable tracked;
    private List<FlightEnabled> fliers, otherFliers;
    private String expected, results;

    @BeforeEach
    public void setUp() {
        bird = new Bird();
        animal = bird;
        flier = bird;
        tracked = bird;
    }

    /*
        Notice below I am coding to the Interface type, we do not want
        to code with specific types.  As an example if I were to make
        the parameters ArrayList<FlightEnabled> then I would be restricted
        to passing in an ArrayList when the method is called.  I would not
        be able to pass in a LinkedList<FlightEnabled>.  But with the more
        general Interface type collection List<FlightEnabled> I can pass in
        either an ArrayList<FlightEnabled> or LinkedList<FlightEnabled>.
    */
    private static String triggerFliers(List<FlightEnabled> fliers) {
        StringBuilder fliersCompilation = new StringBuilder();
        for (var flier : fliers) {
            fliersCompilation.append(flier.takeOff()).append("\n");
        }
        return fliersCompilation.toString();
    }

    private static String flyFliers(List<FlightEnabled> fliers) {
        StringBuilder fliersCompilation = new StringBuilder();
        for (var flier : fliers) {
            fliersCompilation.append(flier.fly()).append("\n");
        }
        return fliersCompilation.toString();
    }

    private static String landFliers(List<FlightEnabled> fliers) {
        StringBuilder fliersCompilation = new StringBuilder();
        for (var flier : fliers) {
            fliersCompilation.append(flier.land()).append("\n");
        }
        return fliersCompilation.toString();
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

        In this case the flier object implements the methods from FlightEnabled, they are called from bird
        as bird is the runtime object.  Likewise, the bird object is type Trackable implements the methods defined
        in the Trackable interface, they are called from the bird as bird is the runtime object.
    */

    @Test
    public void testBirdObject() {
        Assertions.assertEquals("Bird moved.", bird.move());
    }

    @Test
    public void testGenericAnimalObject() {
        Assertions.assertEquals("Bird moved.", animal.move());
    }

    @Test
    public void testFlightEnabledObject() {
        String[] expected = new String[]{
                "Bird took off from the nest.", "Bird landed in the nest.", "Bird is flying over the farm."
        };
        String[] results = new String[]{
                flier.takeOff(), flier.land(), flier.fly()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testTrackableObject() {
        Assertions.assertEquals("Bird has a tracking device attached.", tracked.track());
    }

    @Test
    public void testFlierAndTracked() {
        String results = "";
        if (flier instanceof Trackable anotherTracked) {
            results = anotherTracked.track();
        }
        Assertions.assertEquals("Bird has a tracking device attached.", results);
        // this is a bit confusing to understand with the instanceof operator.  If we try to call the track() method
        // on the flier object we will get a compile error.  However, the bird object is an instance of a class that
        // does implement both the FlightEnabled and Trackable Interfaces.
    }

    @Test
    public void testTriggerFliers() {
        // we see here with two different types of Lists and ArrayList and a LinkedList
        // the triggerFliers method works the same for each type because the argument
        // is List<FlightEnabled> which means any subclass of List is permitted for
        // a method argument.
        fliers = new ArrayList<>();
        otherFliers = new LinkedList<>();
        fliers.add(bird);
        otherFliers.add(bird);
        expected = "Bird took off from the nest.\n" +
        "Bird took off from the nest.\n";
        results = triggerFliers(fliers) + triggerFliers(otherFliers);
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testFlyFliers() {
        fliers = new ArrayList<>();
        otherFliers = new LinkedList<>();
        fliers.add(bird);
        otherFliers.add(bird);
        expected = "Bird is flying over the farm.\n" +
                "Bird is flying over the farm.\n";
        results = flyFliers(fliers) + flyFliers(otherFliers);
        Assertions.assertEquals(expected, results);
    }
    @Test
    public void testLandFliers() {
        fliers = new ArrayList<>();
        otherFliers = new LinkedList<>();
        fliers.add(bird);
        otherFliers.add(bird);
        expected = "Bird landed in the nest.\n" +
                "Bird landed in the nest.\n";
        results = landFliers(fliers) + landFliers(otherFliers);
        Assertions.assertEquals(expected, results);
    }
    /*
        I cannot test calling a Trackable method from a FlightEnabled object because a compiler error is
        immediately thrown.  flier.track() shows a compile error.
    */
}
