package org.example;

public class Fish extends Animal {

    @Override
    public String move(String speed) {
        return speed.equalsIgnoreCase("slow") ? type + " lazily swimming" : type + " darting frantically";
    }

    @Override
    public String makeNoise() {
        return type.equalsIgnoreCase("goldfish") ? "swish" : "splash";
    }

    @Override
    protected String getSize() {
        return size;
    }

    @Override
    protected double getWeight() {
        return weight;
    }

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }
}
