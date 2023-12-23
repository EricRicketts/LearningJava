package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    private Animal animal;
    private String expected, result;

    @BeforeEach
    public void setUp() {
        animal = new Animal("Generic Animal", "Huge", 400);
    }

    @Test
    public void testAnimalMakeNoise() {
        expected = "Generic Animal makes some kind of noise.";
        result = animal.makeNoise();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAnimalMoves() {
        expected = "Generic Animal moves slow.";
        result = animal.move("slow");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAnimalToString() {
        expected = "Animal{" +
                "type='" + "Generic Animal" + '\'' +
                ", size='" + "Huge" + '\'' +
                ", weight=" + "400.0" +
                '}';
        result = animal.toString();
        Assertions.assertEquals(expected, result);
    }
}
