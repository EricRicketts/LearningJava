package org.example;

public class Dog extends Animal {

    @Override
    public String move(String speed) {
        return speed.equalsIgnoreCase("slow") ? type + " walking" : type + " running";
    }

    @Override
    public String makeNoise() {
        return type.equalsIgnoreCase("wolf") ? "Howling" : "Barking";
    }

    @Override
    protected String getSize() {
        return size;
    }

    @Override
    protected double getWeight() {
        return weight;
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
}
