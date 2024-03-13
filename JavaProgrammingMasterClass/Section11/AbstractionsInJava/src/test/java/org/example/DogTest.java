package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogTest {

    private Dog firstDog, secondDog;

    @BeforeEach
    public void setUp() {
        firstDog = new Dog("Wolf", "Big", 100);
        secondDog = new Dog("Beagle", "Small", 50);
    }

    @Test
    public void testMakeNoise() {
        String[] expected = {"Howling", "Barking"};
        String[] results = {firstDog.makeNoise(), secondDog.makeNoise()};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testMove() {
        String[] expected = {"Wolf running", "Beagle walking"};
        String[] results = {firstDog.move("fast"), secondDog.move("slow")};
        Assertions.assertArrayEquals(expected, results);
    }
}
