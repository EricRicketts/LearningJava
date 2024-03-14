package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FishAndDogTest {

    Object[] expected, results;
    private List<Animal> animals;

    @BeforeEach
    public void setUp() {
        Dog firstDog = new Dog("Wolf", "Big", 100);
        Dog secondDog = new Dog("Beagle", "Small", 25);
        Fish firstFish = new Fish("Goldfish", "small", 1);
        Fish secondFish = new Fish("Barracuda", "big", 75);
        animals = new ArrayList<>(){{
            add(firstDog); add(secondDog); add(firstFish); add(secondFish);
        }};
        // note even though the List is of type Animal we can add a child class
        // to the List and make full use of the methods on that child class
    }

    @Test
    public void testDogsMakeNoise() {
        expected = new String[]{"Howling", "Barking"};
        results = new String[]{
            animals.get(0).makeNoise(), animals.get(1).makeNoise()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testDogsMove() {
        String[] expected = {"Wolf running", "Beagle walking"};
        results = new String[]{
                animals.get(0).move("fast"), animals.get(1).move("slow")
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testFishMakeNoise() {
        expected = new String[]{"swish", "splash"};
        results = new String[]{
                animals.get(2).makeNoise(), animals.get(3).makeNoise()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testFishMove() {
        expected = new String[]{"Goldfish lazily swimming", "Barracuda darting frantically"};
        results = new String[]{
                animals.get(2).move("slow"), animals.get(3).move("fast")
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testDogAndFishGetters() {
        expected = new Object[]{"Big", 25.0, "small", 75.0};
        results = new Object[]{
                animals.get(0).getSize(), animals.get(1).getWeight(),
                animals.get(2).getSize(), animals.get(3).getWeight()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testExplicitTypeMethod() {
        expected = new String[]{"Dog (Wolf)", "Fish (Goldfish)"};
        results = new String[]{
                animals.get(0).getExplicitType(), animals.get(2).getExplicitType()
        };
        Assertions.assertArrayEquals(expected, results);
    }
}
