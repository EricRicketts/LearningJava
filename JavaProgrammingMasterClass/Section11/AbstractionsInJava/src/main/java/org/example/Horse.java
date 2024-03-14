package org.example;

public class Horse extends Mammal {


    @Override
    public String move(String speed) {
        return super.move(speed);
    }

    @Override
    public String makeNoise() {
        return "Neigh, Neigh!!";
    }

    @Override
    protected String getSize() {
        return size;
    }

    @Override
    protected double getWeight() {
        return weight;
    }

    @Override
    public String shedHair() {
        return getExplicitType() + " shedding hair";
    }

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }
}
