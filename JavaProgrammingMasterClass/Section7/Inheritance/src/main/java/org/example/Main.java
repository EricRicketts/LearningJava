package org.example;

public class Main {

    public String doAnimalStuff(Animal animal, String speed) {
        return animal.makeNoise() + "\n" + animal.move(speed) + "\n" + animal.toString();
    }
}
