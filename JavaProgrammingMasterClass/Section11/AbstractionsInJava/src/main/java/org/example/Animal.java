package org.example;

public abstract class Animal {

    protected String type;
    protected String size;
    protected double weight;

    public abstract String move(String speed);

    public abstract String makeNoise();

    protected abstract String getSize();

    protected abstract double getWeight();

    // Note this is an important feature of abstract classes they can contain concrete methods
    // which will be inherited by their subclasses.
    public String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
}
