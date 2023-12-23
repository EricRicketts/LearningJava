package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogTest {

    private Dog yorkie, retriever;
    private String expected, result, expectedFirstPart, expectedSecondPart;

    @BeforeEach
    public void setUp() {
        yorkie = new Dog("Yorkie", 15);
        retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
    }

    @Test
    public void testYorkieInitialState() {
        expectedFirstPart = "Dog{" +
                "earShape='" + "Perky" + '\'' +
                ", tailShape='" + "Curled" + '\'' + "} ";
        expectedSecondPart = "Dog{" +
                "type='" + "Yorkie" + '\'' +
                ", size='" + "medium" + '\'' +
                ", weight=" + "15.0" +
                '}';
        expected = expectedFirstPart + expectedSecondPart;
        result = yorkie.toString();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRetrieverInitialState() {
        expectedFirstPart = "Dog{" +
                "earShape='" + "Floppy" + '\'' +
                ", tailShape='" + "Swimmer" + '\'' + "} ";
        expectedSecondPart = "Dog{" +
                "type='" + "Labrador Retriever" + '\'' +
                ", size='" + "large" + '\'' +
                ", weight=" + "65.0" +
                '}';
        expected = expectedFirstPart + expectedSecondPart;
        result = retriever.toString();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testYorkieMakeNoiseAndMove() {
        expected = "Yorkie makes some kind of noise.";
        result = yorkie.makeNoise();
        Assertions.assertEquals(expected, result);
        // using Text Block
        expected = """
                Yorkie moves slowly.
                In general dogs walk, run, and wag their tails.
                Yorkie is walking.
                Yorkie is wagging it's tail.""";
        result = yorkie.move("slowly");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRetrieverMakeNoiseAndMove() {
        expected = "Labrador Retriever makes some kind of noise.";
        result = retriever.makeNoise();
        Assertions.assertEquals(expected, result);
        // using Text Block
        expected = """
                Labrador Retriever moves quickly.
                In general dogs walk, run, and wag their tails.
                Labrador Retriever is running.
                Labrador Retriever says Woof!""";
        result = retriever.move("quickly");
        Assertions.assertEquals(expected, result);
    }
}
